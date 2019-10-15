package cn.jvtd.util;
import cn.jvtd.common.Constants;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateTimeUtil {
	public final static String DATE_FORMAT_SECOND = "yyyy-MM-dd HH:mm:ss";
	public final static String DATE_FORMAT_DAY = "yyyy-MM-dd";
	public final static String DATE_FORMAT_HOUR = "HH";
	public final static String DATE_FORMAT_FULL_HOUR = "yyyy-MM-dd HH"; //带日期的小时
	public final static String DATE_FORMAT_MINUTE = "mm";

	public DateTimeUtil() {
	}

	public static String convertMillSecondsToHMS(long millSeconds) {
		long allSecond = millSeconds / 1000L;
		long hour = allSecond / 3600L;
		long minute = (allSecond - hour * 3600L) / 60L;
		long second = allSecond - hour * 3600L - minute * 60L;
		String retString = "";
		String strHour = String.valueOf(hour);
		if (strHour.length() <= 1)
			strHour = (new StringBuilder()).append("0").append(strHour).toString();
		String strMinute = String.valueOf(minute);
		if (strMinute.length() <= 1)
			strMinute = (new StringBuilder()).append("0").append(strMinute).toString();
		String strSecond = String.valueOf(second);
		if (strSecond.length() <= 1)
			strSecond = (new StringBuilder()).append("0").append(strSecond).toString();
		retString = (new StringBuilder()).append(strHour).append(":").append(strMinute).append(":").append(strSecond).toString();
		return retString;
	}

	/**
	 * 
	 * @param dealLength int
	 * @param addCondition int 0: add by months , 1 :add by hours, 2: add by days,3:add by minute
	 * @return Date
	 * @author wangxw
	 */
	public static Date getDateTime(int dealLength, int addCondition) {
		Date date = null;
		Calendar cal = null;
		try {
			cal = Calendar.getInstance();
			//java.text.SimpleDateFormat simple = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// simple.getDateInstance().parse()
			switch (addCondition) {
			case 0:
				cal.add(Calendar.MONTH, dealLength);
				break;
			case 1:
				cal.add(Calendar.HOUR, dealLength);
				break;
			case 2:
				cal.add(Calendar.HOUR, dealLength * 24);
				break;
			case 3:
				cal.add(Calendar.MINUTE, dealLength);
				break;
			}
			date = cal.getTime();
		} catch (Exception e) {
			System.err.println("日期处理出错!" + e.toString());
		}
		return date;
	}

	/**
	 * 
	 * @param dealLength int
	 * @param addCondition int 0: add by months , 1 :add by hours 2: add by days,3:add by minute
	 * @return String
	 * @author wangxw
	 */
	public static String getDateTimeString(int dealLength, int addCondition) {
		String date = "";
		Calendar cal = null;
		try {
			cal = Calendar.getInstance();
			SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// simple.getDateInstance().parse()
			switch (addCondition) {
			case 0:
				cal.add(Calendar.MONTH, dealLength);
				break;
			case 1:
				cal.add(Calendar.HOUR, dealLength);
				break;
			case 2:
				cal.add(Calendar.HOUR, dealLength * 24);
				break;
			case 3:
				cal.add(Calendar.MINUTE, dealLength);
			}
			date = simple.format(cal.getTime());
		} catch (Exception e) {
			System.err.println("日期处理出错!" + e.toString());
		}
		return date;
	}

	/**
	 * 根据系统间隔单位和时间间隔，获取时间字符串
	 * @param interval 时间间隔
	 * @param intervalUnit 间隔单位
	 * @return
	 */
	public static String getTimeString(int interval, String intervalUnit){
		String date = "";
		Calendar cal = null;
		try {
			cal = Calendar.getInstance();
			SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			date = simple.format(cal.getTime());
		} catch (Exception e) {
			System.err.println("日期处理出错!" + e.toString());
		}
		return date;
	}

	/**
	 * 根据系统间隔单位和时间间隔，获取时间
	 * @param interval 时间间隔
	 * @param intervalUnit 间隔单位
	 * @return
	 */
	public static Date getTime(int interval, String intervalUnit){
		Date date = null;
		Calendar cal = null;
		try {
			cal = Calendar.getInstance();
			if(Constants.DATE_UNIT_MONTH.equals(intervalUnit)) {
				cal.add(Calendar.MONTH, interval);
			}else if(Constants.DATE_UNIT_DAY.equals(intervalUnit)) {
				cal.add(Calendar.DATE, interval);
			}else if(Constants.DATE_UNIT_HOUR.equals(intervalUnit)) {
				cal.add(Calendar.HOUR, interval);
			}else if(Constants.DATE_UNIT_MINUTE.equals(intervalUnit)) {
				cal.add(Calendar.MINUTE, interval);
			}else if(Constants.DATE_UNIT_SECOND.equals(intervalUnit)) {
				cal.add(Calendar.SECOND, interval);
			}
			date = cal.getTime();
		} catch (Exception e) {
			System.err.println("日期处理出错!" + e.toString());
		}
		return date;
	}

	public static String getShortTime(String strDate) {
		String longTime = "";

		String stryear = "";
		String strMonth = "";
		String strday = "";
		String strhour = "";
		String strMin = "";
		String strSec = "";
		if (null != strDate) {
			stryear = strDate.substring(0, 4);
			strMonth = strDate.substring(4, 6);
			strday = strDate.substring(6, 8);
			strhour = strDate.substring(8, 10);
			strMin = strDate.substring(10, 12);
			strSec = strDate.substring(12, 14);
		}

		longTime = stryear + "-" + strMonth + "-" + strday + " " + strhour + ":" + strMin + ":" + strSec;
		return longTime;
	}

	public static String getMonthDay(String strDate) {
		String strMonth = "";
		String strday = "";
		if (null != strDate) {
			strMonth = strDate.substring(5, 7);
			strday = strDate.substring(7, 10);
		}
		return (strMonth + strday);
	}

	public static String getShortDate(String strDate) {
		String longDate = "";

		String stryear = "";
		String strMonth = "";
		String strday = "";
		if (null != strDate) {
			stryear = strDate.substring(0, 4);
			strMonth = strDate.substring(4, 7);
			strday = strDate.substring(7, 10);
		}

		longDate = stryear + strMonth + strday;
		return longDate;
	}

	public static String now() {
		String strNow = "";
		Calendar cal = null;
		try {
			cal = Calendar.getInstance();
			SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			strNow = simple.format(cal.getTime());
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return strNow;
	}

	public static String today() {
		String strNow = "";
		Calendar cal = null;
		try {
			cal = Calendar.getInstance();
			SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
			strNow = simple.format(cal.getTime());
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return strNow;
	}

	public static String nextYear(int iLaterYears) {
		String strNow = "";
		Calendar cal = null;
		try {
			cal = Calendar.getInstance();
			SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			cal.add(Calendar.YEAR, iLaterYears);
			strNow = simple.format(cal.getTime());
		} catch (Exception e) {
			System.err.println("日期处理出错!" + e.toString());
		}
		return strNow;
	}

	public static String getCurrentYear() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		Date date = new Date();
		return sdf.format(date);
	}

	/**
	 *
	 * @return Date
	 */
	public static Date getWeekStartDate() {
		Calendar calendar = Calendar.getInstance();
		Date firstDateOfWeek;
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		calendar.add(Calendar.DAY_OF_WEEK, -(dayOfWeek - 1));
		firstDateOfWeek = calendar.getTime();
		calendar.add(Calendar.DAY_OF_WEEK, 6);
		return firstDateOfWeek;
	}

	/**
	 *
	 * @return Date
	 */
	public static Date getWeekEndDate() {
		Calendar calendar = Calendar.getInstance();
		Date lastDateOfWeek;
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		calendar.add(Calendar.DAY_OF_WEEK, -(dayOfWeek - 1));
		calendar.add(Calendar.DAY_OF_WEEK, 6);
		lastDateOfWeek = calendar.getTime();
		return lastDateOfWeek;
	}

	public static Date getMonthStart() {
		Calendar calendar = Calendar.getInstance();
		Date firstDateOfMonth;
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		calendar.add(Calendar.DAY_OF_MONTH, -(dayOfMonth - 1));
		firstDateOfMonth = calendar.getTime();
		calendar.add(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH) - 1);
		;
		return firstDateOfMonth;
	}

	public static Date getMonthEndDate() {
		Calendar calendar = Calendar.getInstance();
		Date lastDateOfMonth;
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		calendar.add(Calendar.DAY_OF_MONTH, -(dayOfMonth - 1));
		// calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
		calendar.add(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH) - 1);
		lastDateOfMonth = calendar.getTime();
		return lastDateOfMonth;
	}

	/**
	 * java.util.Date to String
	 * @param date Date
	 * @return String
	 */
	public static String convertDateToStr(Date date) {
		if (null == date) {
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}

	public static String convertDateToStr(Date date, String format) {
		if (null == date) {
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	public static Date convertStrToDate(String strDate) {
		if((null == strDate)||(strDate.length()==0)||("null".equals(strDate))||("0".equals(strDate))) {
			return null;
		}

		if (strDate.trim().length() == 10) {
			strDate += " 00:00:00";
		}else if (strDate.trim().length() == 13) {
			strDate += ":00:00";
		}else if (strDate.trim().length() == 16) {
			strDate += ":00";
		}

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return sdf.parse(strDate);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public static Date convertStrToDate(String strDate, String format) {
		if (null == strDate) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(strDate);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public static int gapDate(Date beginDate, Date endDate) {
		long beginTime = beginDate.getTime();
		long endTime2 = endDate.getTime();
		long betweenDays = (long) ((endTime2 - beginTime) / (1000 * 60 * 60 * 24) + 0.5);
		return (int) betweenDays;
	}

	public static long gapHours(Date beginTime, Date endTime) {
		long interval = (endTime.getTime() - beginTime.getTime());
		return interval / (1000 * 60 * 60);
	}

	public static long getTwoDateInterval(Date start, Date end) {
		long interval = Math.abs(end.getTime() - start.getTime());
		return interval;
	}

	/**
	 * 使用固定的格式比较两个时间的大小
	 * @param strDate1 String
	 * @param strDate2 String
	 * @param strLayout String	yyyy-MM-dd HH:mm:ss
	 * @return i int
	 * @author matilda
	 * @throws ParseException
	 */
	public static int compareDate(String strDate1, String strDate2, String strLayout) throws ParseException {
		int i;
		SimpleDateFormat sf = new SimpleDateFormat(strLayout);
		Date dt = sf.parse(strDate1);
		i = dt.compareTo(sf.parse(strDate2));
		return i;
	}

	/**
	 * 将秒数转换为小时：分钟：秒的格式
	 */
	public static String convertSecondToString(long seconds) {
		long lOnLineHour = seconds / 3600;
		long lOnLineMinute = (seconds % 3600) / 60;
		long lOnLineSecond = (seconds % 3600) % 60;
		String strTime = String.format("%02d:%02d:%02d", lOnLineHour, lOnLineMinute, lOnLineSecond);
		return strTime;
	}

	/**
	 * 获得指定年指定月份的天数
	 * @param year
	 * @param month
	 * @return
	 * @author shirely
	 */
	public static int getDaysOfMonth(int year, int month) {
		//闰年2月29天，平年2月29天，其他大月31天，小月30天
		//能够被400整除是闰年，能够被4整除，而不能被100整除的，也是闰年
		int nDaysOfMonth = 0;
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))//闰年
		{
			if (month == 2) {
				nDaysOfMonth = 29;
			} else {
				nDaysOfMonth = 28;
			}
		} else {
			if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12))//大月
			{
				nDaysOfMonth = 31;
			} else//小月
			{
				nDaysOfMonth = 30;
			}
		}
		return nDaysOfMonth;
	}

	/**
	 * 将时间格式化为指定格式的字符串
	 * @param pattern String  yyyyMMddHHmmssSSS
	 * @param date Date
	 * @return String
	 * @author shirely
	 */
	public static String FormatDate(String pattern, Date date) {
		SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
		return dateformat.format(date).toString();
	}

	/**
	 * 将指定格式的字符串转换为日期型
	 * @param str String
	 * @param pattern String  yyyyMMddHHmmssSSS
	 * @return Date
	 */

	public static Date String2Date(String str, String pattern) throws ParseException {
		if (str == null) {
			return null;
		}
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		return formatter.parse(str);
	}

	/**
	 * 从fromDate开始计算tillDate目前是从fromDate起的第几周
	 * @param fromDate
	 * @param tillDate
	 */
	public static int getTotalWeeks(Date startDate, Date endDate) {
		//开始时间是星期几
		Calendar startCalendar = Calendar.getInstance();
		startCalendar.setTime(startDate);
		int nDayWeekOfStartDate = startCalendar.get(Calendar.DAY_OF_WEEK);

		Calendar endCalendar = Calendar.getInstance();
		endCalendar.setTime(endDate);
		int nDayWeekOfEndDate = endCalendar.get(Calendar.DAY_OF_WEEK);

		int weekIndex = 0;

		//过滤开始不完整的周
		if (nDayWeekOfStartDate != 2) {//monday
			weekIndex++;
			switch (nDayWeekOfStartDate) {
			case 3:
				startCalendar.add(Calendar.DATE, 6);
				break;
			case 4:
				startCalendar.add(Calendar.DATE, 5);
				break;
			case 5:
				startCalendar.add(Calendar.DATE, 4);
				break;
			case 6:
				startCalendar.add(Calendar.DATE, 3);
				break;
			case 7:
				startCalendar.add(Calendar.DATE, 2);
				break;
			case 1:
				startCalendar.add(Calendar.DATE, 1);
				break;
			}
		}

		//去掉结尾不完整的周
		if (nDayWeekOfEndDate != 1) {//sunday
			weekIndex++;
			switch (nDayWeekOfEndDate) {
			case 2:
				endCalendar.add(Calendar.DATE, -1);
				break;
			case 3:
				endCalendar.add(Calendar.DATE, -2);
				break;
			case 4:
				endCalendar.add(Calendar.DATE, -3);
				break;
			case 5:
				endCalendar.add(Calendar.DATE, -4);
				break;
			case 6:
				endCalendar.add(Calendar.DATE, -5);
				break;
			case 7:
				endCalendar.add(Calendar.DATE, -6);
				break;
			}
		}

		//一共多少天
		endCalendar.set(Calendar.HOUR, 0);
		endCalendar.set(Calendar.MINUTE, 0);
		endCalendar.set(Calendar.SECOND, 0);
		endCalendar.set(Calendar.MILLISECOND, 0);

		startCalendar.set(Calendar.HOUR, 0);
		startCalendar.set(Calendar.MINUTE, 0);
		startCalendar.set(Calendar.SECOND, 0);
		startCalendar.set(Calendar.MILLISECOND, 0);

		long lTotalDays = (endCalendar.getTimeInMillis() - startCalendar.getTimeInMillis()) / (24 * 60 * 60 * 1000) + 1;
		String strTemp = String.valueOf(lTotalDays);
		int totalDays = Integer.parseInt(strTemp);
		weekIndex += totalDays / 7;
		return weekIndex;
	}

	/**
	 * 获得从指定日期开始的第几周的的开始和结束日期
	 * @param weekDate
	 * @param weekIndex
	 * @return Date[] Date[0] 开始时间 Date[1]结束时间
	 * @author shirely 2007-11-18
	 */
	public static Date[] getWeekStartAndEndDate(Date weekDate, int weekIndex) {
		//开始时间是星期几
		Calendar startCalendar = Calendar.getInstance();
		Calendar endCalendar = Calendar.getInstance();

		startCalendar.setTime(weekDate);
		endCalendar.setTime(weekDate);

		Date[] retDate = new Date[2];

		//开始不完整的周
		int nDayWeekOfStartDate = startCalendar.get(Calendar.DAY_OF_WEEK);
		switch (nDayWeekOfStartDate) {
		case 1://sunday
			startCalendar.add(Calendar.DATE, -6);
			break;
		case 2://monday
			endCalendar.add(Calendar.DATE, 6);
			break;
		case 3://tuesday
			startCalendar.add(Calendar.DATE, -1);
			endCalendar.add(Calendar.DATE, 5);
			break;
		case 4://wendnesday
			startCalendar.add(Calendar.DATE, -2);
			endCalendar.add(Calendar.DATE, 4);
			break;
		case 5://thurday
			startCalendar.add(Calendar.DATE, -3);
			endCalendar.add(Calendar.DATE, 3);
			break;
		case 6://friday
			startCalendar.add(Calendar.DATE, -4);
			endCalendar.add(Calendar.DATE, 2);
			break;
		case 7://staurday
			startCalendar.add(Calendar.DATE, -5);
			endCalendar.add(Calendar.DATE, 1);
			break;
		}

		retDate[0] = startCalendar.getTime();
		retDate[1] = endCalendar.getTime();
		if (weekIndex == 1)
			return retDate;

		startCalendar.add(Calendar.DATE, 7 * (weekIndex - 1));
		endCalendar.add(Calendar.DATE, 7 * (weekIndex - 1));
		retDate[0] = startCalendar.getTime();
		retDate[1] = endCalendar.getTime();
		return retDate;
	}

	/**
	 * @title  getDateList
	 * @desc   获得传入时间范围内的日期列表
	 * @param startDate Date  时间范围开始值 
	 * @param endDate Date    时间范围截止值
	 * @param pattern String    日期串的格式yyyy-MM-dd;MM-dd;MM;dd
	 * @return List(Sting)
	 * @author shirely
	 * @create date:2007-11-21
	 * @throws Exception
	 * 
	 */
	public static List<String> getDateList(Date startDate, Date endDate, String pattern) throws Exception {
		List<String> dateList = new ArrayList<String>();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
		while (calendar.getTimeInMillis() <= endDate.getTime()) {
			dateList.add(DateTimeUtil.FormatDate(pattern, calendar.getTime()));
			calendar.add(Calendar.DATE, 1);
		}
		return dateList;
	}
	
	/**
	 * 将日期转化为 XMLGregorianCalendar
	 * @param date
	 * @return
	 */
	public static XMLGregorianCalendar convertToXMLGregorianCalendar(Date date) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        XMLGregorianCalendar gc = null;
        try {
            gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (Exception e) {
             e.printStackTrace();
        }
        return gc;
    }
	
	public static XMLGregorianCalendar convertToXMLGregorianCalendar(String dateStr) {
        return convertToXMLGregorianCalendar(convertStrToDate(dateStr));
    }
	
	public static void main(String[] args) {
		Date dt = convertStrToDate("2013-03-22");
		
		System.out.println(convertToXMLGregorianCalendar(dt));
	}
	/**
	 * 2个字符串时间之间的时间差（天数）
	 */
    public static long getDistanceDays(String str1, String str2) throws Exception{
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date one;
        Date two;
        long days=0;
        try {
            one = df.parse(str1);
            two = df.parse(str2);
            long time1 = one.getTime();
            long time2 = two.getTime();
            long diff ;
            if(time1<time2) {
                diff = time2 - time1;
            } else {
                diff = time1 - time2;
            }
            days = diff / (1000 * 60 * 60 * 24);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return days;
    }
}
