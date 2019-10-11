package cn.jvtd.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFunc implements Serializable, Comparable<SysFunc>{
    private String funcId;

    private String parentId;

    private String funcName;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;

    private Integer seqNum;

    private String remark;

    private String funcCode;

    private String funcUrl;

    private String iconUrl;

    private Integer viewType;

    private Integer implType;

    private String funcNameCn;

    private String funcNameEn;

    private String url;

    private String code;

    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId == null ? null : funcId.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName == null ? null : funcName.trim();
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

    public Integer getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode == null ? null : funcCode.trim();
    }

    public String getFuncUrl() {
        return funcUrl;
    }

    public void setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl == null ? null : funcUrl.trim();
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public Integer getViewType() {
        return viewType;
    }

    public void setViewType(Integer viewType) {
        this.viewType = viewType;
    }

    public Integer getImplType() {
        return implType;
    }

    public void setImplType(Integer implType) {
        this.implType = implType;
    }

    public String getFuncNameCn() {
        return funcNameCn;
    }

    public void setFuncNameCn(String funcNameCn) {
        this.funcNameCn = funcNameCn == null ? null : funcNameCn.trim();
    }

    public String getFuncNameEn() {
        return funcNameEn;
    }

    public void setFuncNameEn(String funcNameEn) {
        this.funcNameEn = funcNameEn == null ? null : funcNameEn.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    private List<SysFunc> childrens=null;

    private boolean isChecked;//是否选中 便于角色修改时前端回显

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public void addChild(SysFunc child) {
        if(childrens==null) {
            childrens=new ArrayList<SysFunc>();
        }
        childrens.add(child);
    }
    public List<SysFunc> getChildrens() {
        return childrens;
    }
    public void setChildrens(List<SysFunc> childrens) {
        this.childrens = childrens;
    }
    @Override
    public int compareTo(SysFunc next) {
        String thisParentID = this.getParentId();
        String nextParentID = next.getParentId();
        if(thisParentID.equals(nextParentID)){
            Integer thisSeqNum = this.getSeqNum();
            Integer nextSeqNum = next.getSeqNum();
            if(thisSeqNum==null || nextSeqNum==null || thisSeqNum.intValue()==nextSeqNum.intValue()){
                String thisFuncID = this.getFuncId();
                String nextFuncID = next.getFuncId();
                return thisFuncID.compareTo(nextFuncID);
            }
            return thisSeqNum.compareTo(nextSeqNum);
        }
        return thisParentID.compareTo(nextParentID);
    }


}