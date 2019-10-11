package cn.jvtd.common;

public class ParamErrorBean {
	private String paramCode=null;
	private String errorDesc=null;
	
	public ParamErrorBean(String paramCode, String errorDesc) {
		this.paramCode = paramCode;
		this.errorDesc = errorDesc;
	}

	public String getParamCode() {
		return paramCode;
	}

	public void setParamCode(String paramCode) {
		this.paramCode = paramCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
}
