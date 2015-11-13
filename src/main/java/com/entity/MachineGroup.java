package com.entity;

import java.math.BigDecimal;

public class MachineGroup {
    private Integer groupId;

    private BigDecimal price;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}