package com.bjike.goddess.balancecard.to;

import com.bjike.goddess.common.api.to.BaseTO;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 指标名称设置
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-05-19 09:02 ]
 * @Description: [ 指标名称设置 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class IndexNameSetTO extends BaseTO {

    public interface TestAdd{}
    /**
     * 指标名称
     */
    @NotBlank(groups = {IndexNameSetTO.TestAdd.class} , message = "指标名称不能为空")
    private String typeName;

    /**
     * 描述
     */
    private String describtion;

    /**
     * 指标名称添加人
     */
    private String person;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String modifyTime;


    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
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