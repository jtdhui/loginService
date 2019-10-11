package cn.jvtd.util;


public class AccreditUtil {

	/**
	 * 使用MD5加密密码
	 * @param userID
	 * @param password
	 * @return
	 */
	public static String encodePass(String userID, String password) {
		String str = userID + ":" + password;
		return Signature.getMd5String(str);

	}
}
