package com.bjike.goddess.customer.bo;

import com.bjike.goddess.common.api.bo.BaseBO;
import com.bjike.goddess.common.api.type.Status;
import com.bjike.goddess.customer.entity.CustomerLevel;

/**
 * 客户级别业务传输对象
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-03-15T17:00:40.870 ]
 * @Description: [ 客户级别业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class CustomerLevelBO extends BaseBO {

    /**
     * 客户级别名
     */
    private String name;

    /**
     * 级别描述
     */
    private String remark;

    /**
     * 状态
     */
    private Status status;
    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String modifyTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }


}