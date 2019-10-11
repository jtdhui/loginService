package cn.jvtd.domain;

import java.util.Date;

public class JvtdMobileBean {
    private Integer dataId;
    private String mobile;
    private Date callTime;
    private String callResult;
    private String score;

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getCallTime() {
        return callTime;
    }

    public void setCallTime(Date callTime) {
        this.callTime = callTime;
    }

    public String getCallResult() {
        return callResult;
    }

    public void setCallResult(String callResult) {
        this.callResult = callResult;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
