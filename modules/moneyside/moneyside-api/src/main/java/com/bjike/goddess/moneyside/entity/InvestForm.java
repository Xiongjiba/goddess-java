package com.bjike.goddess.moneyside.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 投资形式
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-06-05 02:28 ]
 * @Description: [ 投资形式 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "moneyside_investform")
public class InvestForm extends BaseEntity {

    /**
     * 投资形式
     */
    @Column(name = "investForm", columnDefinition = "VARCHAR(255)   COMMENT '投资形式'")
    private String investForm;

    /**
     * 说明
     */
    @Column(name = "instruction", columnDefinition = "VARCHAR(255)   COMMENT '说明'")
    private String instruction;

    /**
     * 备注
     */
    @Column(name = "remark", columnDefinition = "VARCHAR(255)   COMMENT '备注'")
    private String remark;


    public String getInvestForm() {
        return investForm;
    }

    public void setInvestForm(String investForm) {
        this.investForm = investForm;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}