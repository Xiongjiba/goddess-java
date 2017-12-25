package com.bjike.goddess.system.excel;

import com.bjike.goddess.common.api.to.BaseTO;
import com.bjike.goddess.common.utils.excel.ExcelHeader;

import java.time.LocalDate;

/**
 * 平台分类
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-08-10 01:44 ]
 * @Description: [ 平台分类 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class PlatformClassifyTemplateExcel extends BaseTO {

    /**
     * 平台名称
     */
    @ExcelHeader(name = "平台名称")
    private String platformName;

    /**
     * 平台定位
     */
    @ExcelHeader(name = "平台定位")
    private String platformLocalize;

    /**
     * 平台目的
     */
    @ExcelHeader(name = "平台目的")
    private String platformPurpose;

    /**
     * 平台特色
     */
    @ExcelHeader(name = "平台特色")
    private String platformFeatures;

    /**
     * 平台需求描述
     */
    @ExcelHeader(name = "平台需求描述")
    private String platformDemand;

    /**
     * 包含（实现需求）功能
     */
    @ExcelHeader(name = "包含（实现需求）功能")
    private String ContainsFunction;

    /**
     * 最新更新时间
     */
    @ExcelHeader(name = "最新更新时间")
    private LocalDate updateTime;

    /**
     * 项目编号
     */
    @ExcelHeader(name = "项目编号")
    private String projectNum;

    /**
     * 项目名称
     */
    @ExcelHeader(name = "项目名称")
    private String projectName;

    /**
     * 最新更新时间
     */
    @ExcelHeader(name = "最新更新时间(节点)")
    private LocalDate newNodeUpdateTime;

    /**
     * 新节点编号（新）
     */
    @ExcelHeader(name = "新节点编号（新）")
    private String newNodeNum;

    /**
     * 节点（新）
     */
    @ExcelHeader(name = "节点（新）")
    private String newNode;

    /**
     * 最新更新时间
     */
    @ExcelHeader(name = "最新更新时间（字段）")
    private LocalDate fieldUpdateTime;

    /**
     * 字段编号（新）
     */
    @ExcelHeader(name = "字段编号（新）")
    private String newFieldNum;

    /**
     * 字段（新）
     */
    @ExcelHeader(name = "字段（新）")
    private String newField;

    /**
     * 平台企业内部需求描述
     */
    @ExcelHeader(name = "平台企业内部需求描述")
    private String platformInternalDemand;

    /**
     * 企业内部展示数据
     */
    @ExcelHeader(name = "企业内部展示数据")
    private Integer internalData;

    /**
     * 平台企业外部需求描述
     */
    @ExcelHeader(name = "平台企业外部需求描述")
    private String platformExternalDemand;

    /**
     * 企业外部展示数据
     */
    @ExcelHeader(name = "企业外部展示数据")
    private Integer externalData;

    /**
     * 注册用户需求描述
     */
    @ExcelHeader(name = "注册用户需求描述")
    private String registerDemand;

    /**
     * 注册展示数据
     */
    @ExcelHeader(name = "注册展示数据")
    private Integer registerData;

    /**
     * 非注册用户需求描述
     */
    @ExcelHeader(name = "非注册用户需求描述")
    private String unRegisterDemand;

    /**
     * 非注册展示数据
     */
    @ExcelHeader(name = "非注册展示数据")
    private Integer unRegisterData;

    /**
     * 平台链接
     */
    @ExcelHeader(name = "平台链接")
    private String platformLink;

    /**
     * 备注
     */
    @ExcelHeader(name = "备注")
    private String remark;


    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformLocalize() {
        return platformLocalize;
    }

    public void setPlatformLocalize(String platformLocalize) {
        this.platformLocalize = platformLocalize;
    }

    public String getPlatformPurpose() {
        return platformPurpose;
    }

    public void setPlatformPurpose(String platformPurpose) {
        this.platformPurpose = platformPurpose;
    }

    public String getPlatformFeatures() {
        return platformFeatures;
    }

    public void setPlatformFeatures(String platformFeatures) {
        this.platformFeatures = platformFeatures;
    }

    public String getPlatformDemand() {
        return platformDemand;
    }

    public void setPlatformDemand(String platformDemand) {
        this.platformDemand = platformDemand;
    }

    public String getContainsFunction() {
        return ContainsFunction;
    }

    public void setContainsFunction(String ContainsFunction) {
        this.ContainsFunction = ContainsFunction;
    }

    public LocalDate getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDate updateTime) {
        this.updateTime = updateTime;
    }

    public String getProjectNum() {
        return projectNum;
    }

    public void setProjectNum(String projectNum) {
        this.projectNum = projectNum;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDate getNewNodeUpdateTime() {
        return newNodeUpdateTime;
    }

    public LocalDate getFieldUpdateTime() {
        return fieldUpdateTime;
    }

    public void setFieldUpdateTime(LocalDate fieldUpdateTime) {
        this.fieldUpdateTime = fieldUpdateTime;
    }

    public String getNewNodeNum() {
        return newNodeNum;
    }

    public void setNewNodeNum(String newNodeNum) {
        this.newNodeNum = newNodeNum;
    }

    public String getNewNode() {
        return newNode;
    }

    public void setNewNode(String newNode) {
        this.newNode = newNode;
    }

    public void setNewNodeUpdateTime(LocalDate newNodeUpdateTime) {
        this.newNodeUpdateTime = newNodeUpdateTime;
    }

    public String getNewFieldNum() {
        return newFieldNum;
    }

    public void setNewFieldNum(String newFieldNum) {
        this.newFieldNum = newFieldNum;
    }

    public String getNewField() {
        return newField;
    }

    public void setNewField(String newField) {
        this.newField = newField;
    }

    public String getPlatformInternalDemand() {
        return platformInternalDemand;
    }

    public void setPlatformInternalDemand(String platformInternalDemand) {
        this.platformInternalDemand = platformInternalDemand;
    }

    public Integer getInternalData() {
        return internalData;
    }

    public void setInternalData(Integer internalData) {
        this.internalData = internalData;
    }

    public String getPlatformExternalDemand() {
        return platformExternalDemand;
    }

    public void setPlatformExternalDemand(String platformExternalDemand) {
        this.platformExternalDemand = platformExternalDemand;
    }

    public Integer getExternalData() {
        return externalData;
    }

    public void setExternalData(Integer externalData) {
        this.externalData = externalData;
    }

    public String getRegisterDemand() {
        return registerDemand;
    }

    public void setRegisterDemand(String registerDemand) {
        this.registerDemand = registerDemand;
    }

    public Integer getRegisterData() {
        return registerData;
    }

    public void setRegisterData(Integer registerData) {
        this.registerData = registerData;
    }

    public String getUnRegisterDemand() {
        return unRegisterDemand;
    }

    public void setUnRegisterDemand(String unRegisterDemand) {
        this.unRegisterDemand = unRegisterDemand;
    }

    public Integer getUnRegisterData() {
        return unRegisterData;
    }

    public void setUnRegisterData(Integer unRegisterData) {
        this.unRegisterData = unRegisterData;
    }

    public String getPlatformLink() {
        return platformLink;
    }

    public void setPlatformLink(String platformLink) {
        this.platformLink = platformLink;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}