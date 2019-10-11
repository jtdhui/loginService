package cn.jvtd.common;


import cn.jvtd.util.Tools;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by on 2018/11/07.
 */
public class ResultBean {

	private String msg;
	private String code;
	private Object result = null;

	public ResultBean() {
		this(null, null, null);
	}

	public ResultBean(String code) {
		this(code, null, null);
	}

	public ResultBean(String code, String msg) {
	    this(code, msg, null);
	}
	public ResultBean(String code, @SuppressWarnings("rawtypes") Map map) {
		this(code, null, map);
	}

	public ResultBean(String code, String msg, Object result) {
		this.code = Tools.trimToEmpty(code);
		this.msg = Tools.trimToEmpty(msg);
		this.result = getErrorResultObj(result);
	}

	public ResultBean(ResultConstant resultConstant, Object result) {
	    this.code = resultConstant.getCode();
	    this.msg = resultConstant.getMsg();
	    this.result = getErrorResultObj(result);
	}

    public ResultBean(ResultConstant resultConstant, String msg) {
        this(resultConstant.getCode(), msg);
    }

	public ResultBean(ResultConstant resultConstant) {
		this(resultConstant.getCode(), resultConstant.getMsg(), null);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object getErrorResultObj(Object result) {
		if (result == null) {
			return new HashMap<String, Object>();
		}

		Object retObj = result;
		if (!this.code.equals(ResultConstant.SUCCESS)) {
			if (result instanceof List) {
				boolean bParamErrorFlag = false;
				List lstResult = (List) result;
				for (int idx = 0; idx < lstResult.size(); idx++) {
					Object objUnit = lstResult.get(idx);
					if (objUnit instanceof ParamErrorBean) {
						bParamErrorFlag = true;
						break;
					}
				}
				if (bParamErrorFlag) {
					ErrorResult newResult = new ErrorResult();
					newResult.setErrorList((List<ParamErrorBean>) result);
					retObj = newResult;
				}
			} else if (result instanceof ParamErrorBean) {
				ErrorResult newResult = new ErrorResult();
				newResult.addError((ParamErrorBean) result);
				retObj = newResult;
			}
		}
		return retObj;
	}

	/**
	 * 版本号不正确
	 *
	 * @return result
	 */
	public static ResultBean createResultByVersion() {
		return new ResultBean(ApiConstants.ResultCode.VERSION.getCode(), ApiConstants.ResultCode.VERSION.getValue());
	}

	/**
	 * 系统异常
	 *
	 * @return result
	 */
	public static ResultBean createResultByException() {
		return new ResultBean(ApiConstants.ResultCode.SYSTEM_EXCEPTION.getCode(), ApiConstants.ResultCode.SYSTEM_EXCEPTION.getValue());
	}

	/**
	 * 参数异常
	 *
	 * @return result
	 */
	public static ResultBean createResultByParam() {
		return new ResultBean(ApiConstants.ResultCode.ERROR_PARAM.getCode(), ApiConstants.ResultCode.ERROR_PARAM.getValue());
	}

	/**
	 * 参数异常
	 *
	 * @return result
	 */
	public static ResultBean createResultByParam(String msg) {
		return new ResultBean(ApiConstants.ResultCode.ERROR_PARAM.getCode(), msg);
	}

	/**
	 * 操作失败
	 *
	 * @return result
	 */
	public static ResultBean createResultByError() {
		return new ResultBean(ApiConstants.ResultCode.ERROR.getCode(), ApiConstants.ResultCode.ERROR.getValue());
	}

	/**
	 * 操作失败
	 *
	 * @return result
	 */
	public static ResultBean createResultByError(String msg) {
	    return new ResultBean(ApiConstants.ResultCode.ERROR.getCode(), msg);
	}
	public static ResultBean createResultByError(@SuppressWarnings("rawtypes") Map map) {
	    String msg = ApiConstants.ResultCode.ERROR.getValue();
        if (map != null && map.values().iterator().hasNext()) {
            msg = Tools.trimToEmpty(map.values().iterator().next());
        }
		return new ResultBean(ApiConstants.ResultCode.ERROR.getCode(), msg, map);
	}

	/**
	 * 操作成功
	 *
	 * @return result
	 */
	public static ResultBean createResultBySuccess(Object result) {
		return new ResultBean(ApiConstants.ResultCode.SUCCESS.getCode(), ApiConstants.ResultCode.SUCCESS.getValue(), result);
	}

	/**
	 * 操作成功
	 *
	 * @return result
	 */
	public static ResultBean createResultSuccess() {
		return new ResultBean(ApiConstants.ResultCode.SUCCESS.getCode(), ApiConstants.ResultCode.SUCCESS.getValue());
	}

	/**
	 * 操作
	 *
	 * @param code
	 *            状态码
	 * @param msg
	 *            信息
	 * @return result
	 */
	public static ResultBean createResult(String code, String msg) {
		return new ResultBean(code, msg);
	}

	/**
	 * 操作
	 *
	 * @param code
	 *            状态码
	 * @param msg
	 *            信息
	 * @param result
	 *            返回数据
	 * @return result
	 */
	public static ResultBean createResult(String code, String msg, Object result) {
		return new ResultBean(code, msg, result);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
