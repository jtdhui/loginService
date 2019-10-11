package cn.jvtd.common;

import java.util.ArrayList;
import java.util.List;

public class ErrorResult {
	private List<ParamErrorBean> errorList=null;

	public List<ParamErrorBean> getErrorList() {
		return errorList;
	}

	public void setErrorList(List<ParamErrorBean> errorList) {
		this.errorList = errorList;
	}
	
	public void addError(ParamErrorBean error) {
		if(errorList==null) {
			errorList=new ArrayList<ParamErrorBean>();
		}
		errorList.add(error);
	}
}
