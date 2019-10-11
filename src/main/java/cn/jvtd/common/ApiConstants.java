package cn.jvtd.common;

public interface ApiConstants {
	/**
	 * 返回状态
	 */
	public enum ResultCode {
		SUCCESS("0000", "成功"),
		ERROR("1002", "失败"),
		ERROR_PARAM("1003","参数异常"),
		/**
		 * 用于显示客户端展示给用户看
		 */
		DISPLAY("1004","数据显示"),
		SYSTEM_EXCEPTION("1111","系统异常"),
		VERSION("1001","版本号不正确");

		private String value;
		private String code;

		ResultCode(String code, String value){
			this.code = code;
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public String getCode() {
			return code;
		}
	}

	public enum Version{
		VERSION("V2.4.0")
		;
		private String code;
		Version(String code){
			this.code= code;
		}

		public String getCode() {
			return code;
		}
	}
}
