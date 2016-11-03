package com.youzipi.bean.entity;

import java.util.Date;

public class MarketingScope {
    private Long marketingScopeId;

    private Long marketingId;

    private Long scopeId;

    private String scopeType;

    private Date createTime;

    private Date updateTime;

    private String flag;

    public Long getMarketingScopeId() {
        return marketingScopeId;
    }

    public void setMarketingScopeId(Long marketingScopeId) {
        this.marketingScopeId = marketingScopeId;
    }

    public Long getMarketingId() {
        return marketingId;
    }

    public void setMarketingId(Long marketingId) {
        this.marketingId = marketingId;
    }

    public Long getScopeId() {
        return scopeId;
    }

    public void setScopeId(Long scopeId) {
        this.scopeId = scopeId;
    }

    public String getScopeType() {
        return scopeType;
    }

    public void setScopeType(String scopeType) {
        this.scopeType = scopeType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}