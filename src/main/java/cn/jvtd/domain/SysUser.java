package cn.jvtd.domain;

import java.util.Date;

public class SysUser {
    private Long userId;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;

    private String remark;

    private String status;

    private String pwd;

    private String pwdInitForce;

    private String pwdValidForever;

    private Integer userLevel;

    private Integer lockReason;

    private String loginFlag;

    private Date loginTime;

    private String loginIp;

    private Integer accumFailTimes;

    private String userName;

    private String title;

    private String mobile;

    private String phone;

    private String email;

    private String nickName;

    private String qq;

    private String wechat;

    private String province;

    private String city;

    private String academic;

    private String major;

    private String credentialType;

    private String credentialNumber;

    private Date birthday;

    private String language;

    private String serviceType;

    private String hobbies;

    private String reference;

    private String referenceUserid;

    private String industry1;

    private String industry1Position;

    private String industry2;

    private String industry2Position;

    private String industry3;

    private String industry3Position;

    private String industry4;

    private String industry4Position;

    private String industry5;

    private String industry5Position;

    private String aliPay;

    private String livechatWelcomeMsg;

    private String hashPwd;

    private Double hourlyRate;

    private String jobNumber;

    private String address;

    private String empStatus;

    private String isPush;

    private byte[] photo;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getPwdInitForce() {
        return pwdInitForce;
    }

    public void setPwdInitForce(String pwdInitForce) {
        this.pwdInitForce = pwdInitForce == null ? null : pwdInitForce.trim();
    }

    public String getPwdValidForever() {
        return pwdValidForever;
    }

    public void setPwdValidForever(String pwdValidForever) {
        this.pwdValidForever = pwdValidForever == null ? null : pwdValidForever.trim();
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getLockReason() {
        return lockReason;
    }

    public void setLockReason(Integer lockReason) {
        this.lockReason = lockReason;
    }

    public String getLoginFlag() {
        return loginFlag;
    }

    public void setLoginFlag(String loginFlag) {
        this.loginFlag = loginFlag == null ? null : loginFlag.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public Integer getAccumFailTimes() {
        return accumFailTimes;
    }

    public void setAccumFailTimes(Integer accumFailTimes) {
        this.accumFailTimes = accumFailTimes;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAcademic() {
        return academic;
    }

    public void setAcademic(String academic) {
        this.academic = academic == null ? null : academic.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(String credentialType) {
        this.credentialType = credentialType == null ? null : credentialType.trim();
    }

    public String getCredentialNumber() {
        return credentialNumber;
    }

    public void setCredentialNumber(String credentialNumber) {
        this.credentialNumber = credentialNumber == null ? null : credentialNumber.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies == null ? null : hobbies.trim();
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference == null ? null : reference.trim();
    }

    public String getReferenceUserid() {
        return referenceUserid;
    }

    public void setReferenceUserid(String referenceUserid) {
        this.referenceUserid = referenceUserid == null ? null : referenceUserid.trim();
    }

    public String getIndustry1() {
        return industry1;
    }

    public void setIndustry1(String industry1) {
        this.industry1 = industry1 == null ? null : industry1.trim();
    }

    public String getIndustry1Position() {
        return industry1Position;
    }

    public void setIndustry1Position(String industry1Position) {
        this.industry1Position = industry1Position == null ? null : industry1Position.trim();
    }

    public String getIndustry2() {
        return industry2;
    }

    public void setIndustry2(String industry2) {
        this.industry2 = industry2 == null ? null : industry2.trim();
    }

    public String getIndustry2Position() {
        return industry2Position;
    }

    public void setIndustry2Position(String industry2Position) {
        this.industry2Position = industry2Position == null ? null : industry2Position.trim();
    }

    public String getIndustry3() {
        return industry3;
    }

    public void setIndustry3(String industry3) {
        this.industry3 = industry3 == null ? null : industry3.trim();
    }

    public String getIndustry3Position() {
        return industry3Position;
    }

    public void setIndustry3Position(String industry3Position) {
        this.industry3Position = industry3Position == null ? null : industry3Position.trim();
    }

    public String getIndustry4() {
        return industry4;
    }

    public void setIndustry4(String industry4) {
        this.industry4 = industry4 == null ? null : industry4.trim();
    }

    public String getIndustry4Position() {
        return industry4Position;
    }

    public void setIndustry4Position(String industry4Position) {
        this.industry4Position = industry4Position == null ? null : industry4Position.trim();
    }

    public String getIndustry5() {
        return industry5;
    }

    public void setIndustry5(String industry5) {
        this.industry5 = industry5 == null ? null : industry5.trim();
    }

    public String getIndustry5Position() {
        return industry5Position;
    }

    public void setIndustry5Position(String industry5Position) {
        this.industry5Position = industry5Position == null ? null : industry5Position.trim();
    }

    public String getAliPay() {
        return aliPay;
    }

    public void setAliPay(String aliPay) {
        this.aliPay = aliPay == null ? null : aliPay.trim();
    }

    public String getLivechatWelcomeMsg() {
        return livechatWelcomeMsg;
    }

    public void setLivechatWelcomeMsg(String livechatWelcomeMsg) {
        this.livechatWelcomeMsg = livechatWelcomeMsg == null ? null : livechatWelcomeMsg.trim();
    }

    public String getHashPwd() {
        return hashPwd;
    }

    public void setHashPwd(String hashPwd) {
        this.hashPwd = hashPwd == null ? null : hashPwd.trim();
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber == null ? null : jobNumber.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus == null ? null : empStatus.trim();
    }

    public String getIsPush() {
        return isPush;
    }

    public void setIsPush(String isPush) {
        this.isPush = isPush == null ? null : isPush.trim();
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}