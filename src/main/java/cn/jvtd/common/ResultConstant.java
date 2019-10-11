package cn.jvtd.common;

/**
 * <p>
 * <p>
 * </p>
 *
 * @Author:zhaozhiyong
 * @CreateDate:2018/8/27
 * @Version:1.0
 */
public enum ResultConstant {
    SUCCESS("0000", "操作成功"),
    FAILED("9000", "操作失败"),

    SYSTEM_EXCEPTION("9001", "系统错误"),
    UNAUTHORIZED("9002", "获取登录用户信息失败"),//未登录/token过期
    PARAM_ERROR("9003", "参数错误"),

    INVALID_USER("1001", "用户不存在"),
    USERNAME_ALREADY_IN("1002", "用户已存在"),

    INVALID_ROLE("1004", "角色不存在"),
    ROLE_USER_USED("1008", "角色使用中，不可删除"),
    INVALID_PARAM_EXIST("1005", "请求参数已存在"),
    INVALID_PARAM_EMPTY("1006", "请求参数为空"),
    USER_NO_PERMITION("1007", "当前用户无该接口权限"),
    INVALID_PASSWORD("1009", "旧密码错误"),
    INVALID_RE_PASSWORD("1010", "两次输入密码不一致"),
    USER_NO_AUTHORITY("1013", "该用户没有权限"),
    MOBILE_ERROR("1014", "手机号格式错误"),
    DATA_ERROR("1015", "数据操作错误"),
    USER_NAME_EXIST_ERROR("1016", "用户名已被注册"),

    USER_LOCK_ERROR("1017", "该用户已被禁用"),

    INVALID_USERNAME_PASSWORD("1003", "用户名或密码错误"),
    MOBILE_REQUIRED("2001", "手机号不能为空"),
    PASS_REQUIRED("2002", "密码不能为空"),
    VALIDATE_CODE_REQUIRED("2003", "验证码不能为空"),
    VALIDATE_CODE_INVALID("2004", "验证码无效或已过期"),
    VALIDATE_CODE_ERROR("2005", "验证码错误"),
    INVLID_LOGIN_TYPE("2006", "登录方式无效"),
    WELCOME_SPEECH("3001", "欢迎语"),
    CONCLUDING_REMARKS("3002", "结束语"),
    RETRY_COUNT("3002", "没有匹配到结果！重试次数剩余"),
    FAIELD_RETRY("3003", "超过重试次数"),
    SURVEY_END("3004", "问卷流程结束");


    public String code;
    public String msg;

    ResultConstant(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
