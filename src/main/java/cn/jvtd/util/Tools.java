package cn.jvtd.util;

import java.io.*;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@SuppressWarnings({"unchecked","rawtypes"})
public class Tools {
	public Tools() {
	}

	/** 从HTML中提取纯文本 */
	public static String getPlainTxtFromHtml(String htmlText) {
		if ((null != htmlText) && (htmlText.length() > 0)) {
			String strOut = htmlText.replaceAll("(<[a-zA-Z].*?>)|(<[\\/][a-zA-Z].*?>)", "");
			return strOut;
		} else {
			return null;
		}
	}
	/** 格式百分比 */
	public static String formatPercent(double d, String pattern, Locale locale) {
		String s = "";
		try {
			DecimalFormat df = (DecimalFormat) NumberFormat.getPercentInstance(locale);
			df.applyPattern(pattern);
			s = df.format(d);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return s;
	}

	/**替换文件名中的非法字符 */
	public static String replaceIllegalCharOfFilName(String srcFileName) {
		String destFileName = srcFileName;
		destFileName = destFileName.replace("\\", "");
		destFileName = destFileName.replace("/", "");
		destFileName = destFileName.replace(":", "");
		destFileName = destFileName.replace("*", "");
		destFileName = destFileName.replace("?", "");
		destFileName = destFileName.replace("\"", "");
		destFileName = destFileName.replace("<", "");
		destFileName = destFileName.replace(">", "");
		destFileName = destFileName.replace("|", "");
		return destFileName;
	}

	/** 替换URL中的保留字符 */
	public static String replaceReservedCharOfUrl(String strSrc) {
		/*1. +  URL 中+号表示空格 %2B 
		2. 空格 URL中的空格可以用+号或者编码 %20 
		3. /  分隔目录和子目录 %2F  
		4. ?  分隔实际的 URL 和参数 %3F  
		5. % 指定特殊字符 %25  
		6. # 表示书签 %23  
		7. & URL 中指定的参数间的分隔符 %26  
		8. = URL 中指定参数的值 %3D */
		String strDest= strSrc;
		strDest = strDest.replace("+", "");
		strDest = strDest.replace(" ", "");
		strDest = strDest.replace("/", "");
		strDest = strDest.replace("?", "");
		strDest = strDest.replace("%", "");
		strDest = strDest.replace("#", "");
		strDest = strDest.replace("&", "");
		strDest = strDest.replace("=", "");
		return strDest;
	}

	/** 获得本地IP */
	public static String getLocalIP() {
		Enumeration<NetworkInterface> netInterfaces = null;
		String strAllIPs = "";
		try {
			netInterfaces = NetworkInterface.getNetworkInterfaces();
			while (netInterfaces.hasMoreElements()) {
				NetworkInterface ni = (NetworkInterface) netInterfaces.nextElement();
				Enumeration<InetAddress> ips = ni.getInetAddresses();
				while (ips.hasMoreElements()) {
					String ip = ((InetAddress) ips.nextElement()).getHostAddress().toString();
					strAllIPs = strAllIPs + ip + ";";
				}
			}
			return strAllIPs;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	/** 编译文本 */
	public static String encodeText(String text) {
		return encodeText(text, "gb2312");
	}

	/** 以给定的字符集进行编码处理，text-输入的字符串，encoding-输入的字符集 */
	@SuppressWarnings("restriction")
	public static String encodeText(String text, String encoding) {
		boolean isAllAscii = true;
		for (int iIdx = 0; iIdx < text.length(); iIdx++) {
			if (text.charAt(iIdx) <= ' ' || text.charAt(iIdx) >= '~') {
				isAllAscii = false;
				break;
			}
		}
		if (isAllAscii)
			return text;
		// 然后在尝试进行编码, 首先进行 BASE64 编码, 然后进行 Mime 标题的编码设置
		try {
			byte[] bytes = text.getBytes();
			if (encoding == null || encoding.length() == 0) {
				encoding = "gb2312";
			}
			bytes = text.getBytes(encoding);
			return "=?" + encoding + "?B?" + new sun.misc.BASE64Encoder().encode(bytes) + "?=";
		} catch (Exception ex) {
			return text;
		}
	}

	/** 获得当前操系统的路径间隔符号 */
	public static String getPathSplit() {
		String fileSeperator = System.getProperty("file.separator");
		return fileSeperator;
	}



	/**************************************************************
	 * 邮编校验：6位数字,泰国邮编为5位
	 ***************************************************************/
	public static boolean validatePostCode(String postCodeValue) {
		if ((postCodeValue != null) && (postCodeValue.length() > 0)) {
			Pattern pattern = Pattern.compile("^([0-9]{1})?[0-9]{5}$");
			Matcher matcher = pattern.matcher(postCodeValue);
			return matcher.matches();
		} else {
			return false;
		}
	}

	/**************************************************************
	 * 电话校验:包括手机和固定电话
	 ***************************************************************/
	public static boolean validateCallDevice(String deviceNo) {
		String[] arrPhoneNum = deviceNo.split(";");
		if ((arrPhoneNum == null) || (arrPhoneNum.length == 0)) {
			return false;
		}

		boolean bValidateFlag = true;

		for (int i = 0; i < arrPhoneNum.length; i++) {
			boolean bOnceValidate = true;
			String phoneNum = arrPhoneNum[i];
			if ((null != phoneNum) && (phoneNum.length() > 0)) {
				if (!validateMobile(phoneNum)) {
					if (!validatePhone(phoneNum)) {
						bOnceValidate = false;
					}
				}
			} else {
				bOnceValidate = false;
			}
			bValidateFlag = bValidateFlag & bOnceValidate;
		}
		return bValidateFlag;
	}

	/**************************************************************
	 * 固定电话校验:可带括号和-分割符可带2-6位分机号
	 ***************************************************************/
	public static boolean validatePhone(String phone) {
		String[] arrPhoneNum = phone.split(";");
		if ((arrPhoneNum == null) || (arrPhoneNum.length == 0)) {
			return false;
		}

		boolean bValidateFlag = true;

		for (int i = 0; i < arrPhoneNum.length; i++) {
			boolean bOnceValidate = true;
			String phoneNum = arrPhoneNum[i];

			if ((null != phoneNum) && (phoneNum.length() > 0)) {
				Pattern pattern = Pattern.compile("^(\\d{1,4}[-]?)?(0\\d{2,3}[-]?)?\\d{7,8}([-]\\d{1,6})?$");
				Matcher matcher = pattern.matcher(phoneNum);
				bOnceValidate = matcher.matches();
			} else {
				bOnceValidate = false;
			}
			bValidateFlag = bValidateFlag & bOnceValidate;
		}
		return bValidateFlag;
	}

	/**************************************************************
	 * 手机校验:可带长途号0,以13,15,17,18,145,147开头
	 ***************************************************************/
	public static boolean validateMobile(String mobile) {
		String[] arrPhoneNum = mobile.split(";");
		if ((arrPhoneNum == null) || (arrPhoneNum.length == 0)) {
			return false;
		}

		boolean bValidateFlag = true;
		for (int i = 0; i < arrPhoneNum.length; i++) {
			boolean bOnceValidate = true;
			String phoneNum = arrPhoneNum[i];
			if ((null != phoneNum) && (phoneNum.length() > 0)) {
				Pattern pattern = Pattern.compile("^13\\d{9}$|^15\\d{9}$|^17\\d{9}$|^18\\d{9}$|^145\\d{8}$|^147\\d{8}$|^199\\d{8}$");
				Matcher matcher = pattern.matcher(phoneNum);
				bOnceValidate = matcher.matches();
			} else {
				bOnceValidate = false;
			}
			bValidateFlag = bValidateFlag & bOnceValidate;
		}
		return bValidateFlag;
	}

	/**************************************************************
	 * EMAIL校验
	 ***************************************************************/
	public static boolean validateEmail(String email) {
		if ((null != email) && (email.length() > 0)) {
			if (email.charAt(email.length() - 1) != ';') {
				email = email + ";";
			}
			Pattern pattern = Pattern.compile("^(([\\.a-zA-Z0-9_-])+@([\\.a-zA-Z0-9_-])+(\\.([a-zA-Z0-9_-]){1,3})[;]{1})+$");
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		} else {
			return false;
		}
	}

	/**************************************************************
	 * 日期校验
	 ***************************************************************/
	public static boolean validateDate(String dateValue) {
		if ((dateValue != null) && (dateValue.length() > 0)) {
			try {
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				dateFormat.parse(dateValue);
				return true;
			} catch (Exception ex) {
				try {
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					dateFormat.parse(dateValue);
					return true;
				} catch (Exception ex1) {
					return false;
				}
			}
		} else {
			return false;
		}
	}

	/**************************************************************
	 * 整数校验
	 ***************************************************************/
	public static boolean validateLong(String value) {
		try {
			Long.parseLong(value);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	/**************************************************************
	 * 数字校验,包括小数
	 ***************************************************************/
	public static boolean validateNumber(String number) {
		try {
			Double.parseDouble(number);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	/**************************************************************
	 * 验证正货币金额，要求小数点后有两位数字。
	 ***************************************************************/
	public static boolean validateMoney(String money) {
		String regex = "^-?\\d+(\\.\\d{2})?$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(money);
		return m.matches();
	}

	/**************************************************************
	 * 身份证校验
	 ***************************************************************/
	public static boolean validateIdCard(String idcard) {
		if ((null != idcard) && (idcard.length() > 0)) {
			Pattern pattern = Pattern.compile("^[1-9]{1}[0-9]{16}[0-9a-zA-Z]{1}|[1-9]{1}[0-9]{14}$");
			Matcher matcher = pattern.matcher(idcard);
			return matcher.matches();
		} else {
			return false;
		}
	}

	/**************************************************************
	 * IP地址校验 IP地址的寻址规则 1.网络寻址规则 A、网络地址必须唯一。
	 * B、网络标识不能以数字127开头。在A类地址中，数字127保留给内部回送函数（127.1.1.1用于回路测试）。
	 * C、网络标识的第一个字节不能为255。数字255作为广播地址。 D、网络标识的第一个字节不能为“0”，“0”表示该地址是本地主机，不能传送。
	 * 2.主机寻址规则 A、主机标识在同一网络内必须是唯一的。
	 * B、主机标识的各个位不能都为“1”，如果所有位都为“1”，则该机地址是广播地址，而非主机的地址。
	 * C、主机标识的各个位不能都为“0”，如果各个位都为“0”，则表示“只有这个网络”，而这个网络上没有任何主机。 主机的地址就是IP地址
	 ***************************************************************/
	public static boolean validateIPAddress(String ipaddress) {
		try {
			// 10.4.52.29
			String[] segments = ipaddress.split("\\.");
			if (segments.length != 4) {
				return false;
			}
			int nFirstSeg = Integer.parseInt(segments[0]);
			int nSecondSeg = Integer.parseInt(segments[1]);
			int nThirdSeg = Integer.parseInt(segments[2]);
			int nFourthSeg = Integer.parseInt(segments[3]);

			if ((nFirstSeg < 0) || (nFirstSeg > 255) || (nSecondSeg < 0) || (nSecondSeg > 255) || (nThirdSeg < 0) || (nThirdSeg > 255) || (nFourthSeg < 0) || (nFourthSeg > 255)) {
				return false;
			}
			if ((nFirstSeg == 127) || (nFirstSeg == 255) || (nFirstSeg == 0)) {
				return false;
			}
			if ((nFirstSeg == 1) && (nSecondSeg == 1) && (nThirdSeg == 1) && (nFourthSeg == 1)) {
				return false;
			}
			if ((nFirstSeg == 0) && (nSecondSeg == 0) && (nThirdSeg == 0) && (nFourthSeg == 0)) {
				return false;
			}
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	/**************************************************************
	 *判断输入串是否包含非ASCII字符
	 ***************************************************************/
	public static boolean validateAscIIString(String strInput) {
		Pattern pattern = Pattern.compile("^[\\x00-\\x80]+$");
		Matcher matcher = pattern.matcher(strInput);
		return matcher.matches();
	}

	/**************************************************************
	 *是否只包含数学运算符
	 ***************************************************************/
	public static boolean validateCalculateString(String strInput) {
		for (int i = 0; i < strInput.length(); i++) {
			Pattern pattern = Pattern.compile("[\\d*\\+\\-\\*\\/\\(\\)\\[\\]]");
			Matcher matcher = pattern.matcher(String.valueOf(strInput.charAt(i)));
			if (!matcher.matches()) {
				return false;
			}
		}
		return true;
	}

	/** 格式化小数：value-数据，scale-精度(保留的小数位数)，roundingMode-精度的取值方式，return-精度计算后的数据  */
	public static double round(double value,int scale,int roundingMode){
		BigDecimal bd=new BigDecimal(value);
		bd=bd.setScale(scale,roundingMode);
		double d=bd.doubleValue();
		bd=null;
		return d;
	}


	/** 文件重命名，path-文件目录、oldname-原来的文件名、newname-新文件名 */
	public void renameFile(String path, String oldname, String newname) {
		if (!oldname.equals(newname)) {// 新的文件名和以前文件名不同时,才有必要进行重命名
			File oldfile = new File(path + "/" + oldname);
			File newfile = new File(path + "/" + newname);
			if (newfile.exists())// 若在该目录下已经有一个文件和新文件名相同，则不允许重命名
				System.out.println(newname + "已经存在");
			else {
				oldfile.renameTo(newfile);
			}
		}
	}

	/** 根据正则表达式替换字符串，regex-正则表达式、str-原字符串、replacement-替换字符串 */
	public static String replaceString(String regex, String str, String replacement) {
		String retString = "";
		if (str != null)
			retString = str.replaceAll(regex, replacement);
		return retString;
	}

	/** 提取地址（删除字段全部全角及半角下空格，删除"#""-"以外符号） */
	public static String getAddressString(String str) {
		return replaceString("[^\\u4e00-\\u9fa50-9a-zA-Z#-]", str, "");
	}

	/** 提取汉字 */
	public static String getCNString(String str) {
		return replaceString("[^\\u4e00-\\u9fa5]", str, "");
	}

	/** 提取英文字母  */
	public static String getENString(String str) {
		return replaceString("[^a-zA-Z]", str, "");
	}

	/** 提取数字 */
	public static String getNumber(String str) {
		return replaceString("[^0-9]", str, "");
	}

	/** 产生一个UUID */
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}


	/** 格式字符串输出 */
	public static String formatStringOutput(Object orgString) {
		if (null == orgString) {
			return "";
		} else {
			String str = orgString.toString().trim();
			if ("null".equalsIgnoreCase(str)) {
				return "";
			}
			return str;
		}
	}

	/** 格式字符串输出，并控制长度 */
	public static String formatStringOutput(Object orgString,int nPrintLen) {
		if (null == orgString) {
			return "";
		} else {
			String str = orgString.toString().trim();
			if ("null".equalsIgnoreCase(str)) {
				return "";
			}else if(str.length()>nPrintLen){
				return str.substring(0,nPrintLen)+"......";
			}else{
				return str;
			}
		}
	}

	public static String toString(Boolean flag) {
		if (flag == null) {
			return null;
		}
		return flag ? "1" : "0";
	}
	
	public static Integer toInteger(Boolean flag) {
		if (flag == null) {
			return null;
		}
		return flag ? 1 : 0;
	}

	public static Boolean toBoolean(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		return str.equals("1") ? true : false;
	}
	
	/** 去除空格,若为空返回null */
	public static String trimToNull(Object obj) {
		return trim(obj, null);
	}

	/** 去除空格,若为空返回空字符串 */
	public static String trimToEmpty(Object obj) {
		return trim(obj, "");
	}

	/** 去除空格,若为空返回指定值 */
	public static String trim(Object obj, String defaultValue) {
		return obj == null ? defaultValue : obj.toString() == null ? defaultValue : obj.toString().trim();
	}

	/** 去除换行符、空格、制表符和注入sql的特殊符号 */
	public static String getRightString(String str) {
		return replaceString("[\t\n\r\\s',\\*\\?]", str, "");
	}

	/** 转义注入sql的单引号 */
	public static String getRightSql(String str) {
		return replaceString("'", str, "''");
	}

	/** 对map中的值去除空格,若值为空返回空字符串 */
	public static void trimMapValueToEmpty(Map<String, String> map) {
		trimMap(map, "");
	}

	/** 对map中的值去除空格,若值为空返回指定值 */
	public static void trimMap(Map<String, String> map, String defaultValue) {
		for (Map.Entry<String, String> es : map.entrySet()) {
			es.setValue(trim(es.getValue(), defaultValue));
		}
	}


	/** 校验非空 */
	public static boolean isBlank(Object value){
		if(value==null){
			return true;
		}else{
			String str = value.toString().trim();
			if((str.length()==0)||("null".equalsIgnoreCase(str))){
				return true;
			}else{
				return false;
			}
		}
	}

	/** 校验字符串是否以某字符串开头（某字符串忽略大小写） */
	public static boolean isStartWithIgnoreCase(String orgStr, String startStr) {
		if(isBlank(orgStr) || isBlank(startStr)){
			return false;
		}
		int length=startStr.length();
		if(length>orgStr.length()){
			return false;
		}
		if(startStr.equalsIgnoreCase(orgStr.substring(0, length))){
			return true;
		}
		return false;
	}

	/** 校验密码 */
	public static boolean validatePassword(String pass) {
		if ((null != pass) && (pass.length() > 0)) {
			Pattern pattern = Pattern.compile("[a-z0-9A-Z_]{5,10}");
			Matcher matcher = pattern.matcher(pass);
			return matcher.matches();
		} else {
			return false;
		}
	}

	/** 校验是否只包含英文 */
	public static boolean validateENString(String strInput){
		Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
		Matcher matcher = pattern.matcher(strInput);
		return matcher.matches();
	}

	/** 校验表名称: 1、要以字母开头 2、包含字母和数字下划线 3、不能超过30个字符 */
	public static boolean validateTableName(String value) {
		if ((null != value) && (value.length() > 0)) {
			Pattern pattern = Pattern.compile("^TBL_[a-z0-9A-Z_]{1,26}$");
			Matcher matcher = pattern.matcher(value);
			return matcher.matches();
		} else {
			return false;
		}
	}

	/** 校验字段名称: 1、要以字母开头 2、包含字母和数字下划线 3、不能超过30个字符,sqlserver 128 */
	public static boolean validateColumnName(String value) {
		if ((null != value) && (value.length() > 0)) {
			Pattern pattern = Pattern.compile("^[A-Za-z]{1}[A-Za-z0-9_]{1,30}$");
			Matcher matcher = pattern.matcher(value);
			return matcher.matches();
		} else {
			return false;
		}
	}

	/** 校验类名 */
	public static boolean validateClassString(String strInput){
		Pattern pattern = Pattern.compile("^(?!_)(?!.*?_$)[a-zA-Z0-9_]+$");
		Matcher matcher = pattern.matcher(strInput);
		return matcher.matches();
	}

	/** 校验包名和类名 */
	public static boolean validJavaFullClassName(String fullName){
		if(fullName.equals("")){
			return false;
		}
		boolean flag = true;
		try{
			if(!fullName.endsWith(".")){
				int index = fullName.indexOf(".");
				if(index!=-1){
					String[] str = fullName.split("\\.");
					for(String name : str){
						if(name.equals("")){
							flag = false;
							break;
						}else if(!validJavaIdentifier(name)){
							flag = false;
							break;
						}
					}
				}else if(!validJavaIdentifier(fullName)){
					flag = false;
				}
			}else{
				flag = false;
			}
		}catch(Exception ex){
			flag = false;
			ex.printStackTrace();
		}
		return flag;
	}

	/** 校验单独的className */
	private static boolean validJavaIdentifier(String className){
		//确定是否允许将指定字符作为 Java 标识符中的首字符。
		if((className.length() == 0) ||(!Character.isJavaIdentifierStart(className.charAt(0)))){
			return false;
		}
		String name = className.substring(1);
		for(int i = 0; i < name.length(); i++)
			//确定指定字符是否可以是 Java 标识符中首字符以外的部分。
			if(!Character.isJavaIdentifierPart(name.charAt(i))){
				return false;
			}
		return true;
	}
	
	/**
	 * 获取字段的set方法
	 * @param cls
	 * @param fieldName
	 * @return
	 */
	public static Method getSetMethodByField(Class<?> cls, String fieldName, Class<?> paramCls) {
		String memberObjNameFormat = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
		String methodName = String.format("set%s", memberObjNameFormat);
		
		for (Method method : cls.getMethods()) {
			Class<?>[] parameterTypes = method.getParameterTypes();
			if (method.getName().equals(methodName) && parameterTypes.length == 1) {
				if(parameterTypes[0] == paramCls){
					return method;
				}
			}
		}
		return null;
	}
	public static Method getGetMethodByField(Class<?> cls, String fieldName, Class<?> retCls) {
		String memberObjNameFormat = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
		String methodName = String.format("get%s", memberObjNameFormat);
		
		for (Method method : cls.getMethods()) {
			Class<?>[] parameterTypes = method.getParameterTypes();
			if (method.getName().equals(methodName) && parameterTypes.length == 0) {
				if (method.getReturnType() == retCls) {
					return method;
				}
			}
		}
		return null;
	}

	/** 获得类下的method方法 */
	public static Method getMethod(Class<?> cls, String methodName) {
		for (Method method : cls.getMethods()) {
			Class<?>[] parameterTypes = method.getParameterTypes();
			if ((parameterTypes != null) && (parameterTypes.length > 0) && (methodName.startsWith("get"))) {// 忽略有参数的get方法
				continue;
			}

			if (method.getName().equals(methodName)) {
				return method;
			}
		}
		return null;
	}


	/**
	 * 将对象转换为long型,若对象为空则返回null
	 */
	public static Long parseLong(Object obj) {
		if (Tools.isBlank(obj)) {
			return null;
		}
		Long l= null;
		try {
			l = Long.valueOf(obj.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}
	public static Long parseLong(Object obj,Long defaultValue) {
		if (Tools.isBlank(obj)) {
			return defaultValue;
		}
		return parseLong(obj);
	}
	public static Integer parseInt(Object obj) {
		return parseInt(obj, null);
	}
	public static Integer parseInt(Object obj,Integer defaultValue) {
	    if (Tools.isBlank(obj)) {
	        return defaultValue;
	    }
	    Integer i = null;
	    try {
	        i = Double.valueOf(obj.toString()).intValue();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return i;
	}
	public static Double parseDouble(Object obj) {
		if (Tools.isBlank(obj)) {
			return null;
		}
		Double i = null;
		try {
			i = Double.valueOf(obj.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	/**
	 * 判断a,b两个对象调用toString方法生成的字符串是否相同
	 */
	public static boolean strEqual(Object a, Object b) {
		if (a == null || b == null) {
			return false;
		}
		return a.toString().equals(b.toString());
	}
	
	/**
	 * 拼接字符串,默认使用英文逗号',';
	 */
	public static String joinStr(Collection collection) {
		return joinStr(collection, ",");
	}
	/**
	 * 拼接字符串
	 */
	public static String joinStr(Collection collection, String joiner) {
		if (collection == null) {
			return null;
		}
		if (collection.isEmpty()) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (Object o : collection) {
			if (o == null) {
				continue;
			}
			sb.append(joiner).append(o);
		}
		if(sb.length()>0){
			sb.delete(0, joiner.length());
		}
		return sb.toString();
	}

	public static String joinStr(Object[] array) {
		return joinStr(array, ",");
	}

	public static String joinStr(Object[] array, String joiner) {
		if (array == null) {
			return null;
		}
		if (array.length == 0) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (Object o : array) {
			if (o == null) {
				continue;
			}
			sb.append(joiner).append(o);
		}
		if (sb.length() > 0) {
			sb.delete(0, joiner.length());
		}
		return sb.toString();
	}
	
	/**
	 * 可用来判断字符串str分割后是否包含指定字符串
	 * @param str
	 * @param value
	 * @return
	 */
	public static boolean splitAndContains(String str, String value) {
	    if (Tools.isBlank(str) || Tools.isBlank(value)) {
	        return false;
	    }
	    String[] array = str.split(",");
	    return contains(array, value);
	}

	/**
	 * 替换字符串,可以指定分隔符,若分隔符之间的字符串整个匹配,则替换之;
	 * @param str 若为空则返回null
	 * @param separator 若为空则返回原字符串;
	 * @param oldStr 若为空则返回原字符串;
	 * @param newStr 若为空则不添加分隔符;
	 * @return
	 */
    public static String splitAndReplace(String str, String separator, String oldStr, String newStr) {
        if (oldStr == null || Tools.strEqual(oldStr, newStr)) {
            return str;
        }
        List<String> list = splitList(str, separator, true);

        if (list == null || list.size() == 0) {
            return str;
        }
        list = list.stream().map(s -> {
            return s.equals(oldStr) ? newStr : s;
        }).collect(Collectors.toList());

        return joinStr(list, separator);
    }

    public static List<String> splitList(String str) {
        return splitList(str, ",", false);
    }
    /**
     * 将字符串分割为List,可指定分隔符,可指定是否去除列表中的空值
     */
    public static List<String> splitList(String str, String separator, boolean containNull) {
        if (Tools.isBlank(str) || Tools.isBlank(separator)) {
            return null;
        }
        String[] array = str.split(separator);
        List<String> list = null;
        if (array != null) {
            list = new ArrayList<>();
            for (String s : array) {
                if (!containNull) {
                    if (Tools.isBlank(s)) {
                        continue;
                    }
                }
                list.add(s);
            }
        }
        return list;
    }
	public static boolean contains(String[] array, String value) {
		if (array == null || array.length == 0 || Tools.isBlank(value)) {
			return false;
		}
		for (String s : array) {
			if (value.equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {

	}

	public static String getKeyByValue(Map<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue()!=null && entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }


}
