package com.bjike.goddess.datastore.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;

import javax.persistence.*;


/**
 * 数据存储账号密码规范
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-04-21 06:14 ]
 * @Description: [ 数据存储账号密码规范 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "datastore_accountpwdspecification")
public class AccountPwdSpecification extends BaseEntity {

    /**
     * 地区简称
     */
    @Column(name = "areaAbbreviation",  columnDefinition = "VARCHAR(255)   COMMENT '地区简称'")
    private String areaAbbreviation;

    /**
     * 代表性简称
     */
    @Column(name = "representativeAbbreviation",  columnDefinition = "VARCHAR(255)   COMMENT '代表性简称'")
    private String representativeAbbreviation;

    /**
     * 员工姓名
     */
    @Column(name = "employeeName", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '员工姓名'")
    private String employeeName;

    /**
     * 运营商简称
     */
    @Column(name = "operatorAbbreviation",  columnDefinition = "VARCHAR(255)   COMMENT '运营商简称'")
    private String operatorAbbreviation;

    /**
     * 厂家简称
     */
    @Column(name = "factoryAbbreviation",  columnDefinition = "VARCHAR(255)   COMMENT '厂家简称'")
    private String factoryAbbreviation;

    /**
     * 总包商简称
     */
    @Column(name = "contractorAbbreviation",  columnDefinition = "VARCHAR(255)   COMMENT '总包商简称'")
    private String contractorAbbreviation;

    /**
     * 符号
     */
    @Column(name = "symbol",  columnDefinition = "VARCHAR(255)   COMMENT '符号'")
    private String symbol;

    /**
     * 所属公司简称
     */
    @Column(name = "accountSubordinateCompanyAbbreviation",  columnDefinition = "VARCHAR(255)   COMMENT '所属公司简称'")
    private String accountSubordinateCompanyAbbreviation;

    /**
     * 所属部门简称
     */
    @Column(name = "subordinateDepartmentAbbreviation",  columnDefinition = "VARCHAR(255)   COMMENT '所属部门简称'")
    private String subordinateDepartmentAbbreviation;

    /**
     * 所属模块简称
     */
    @Column(name = "subordinateModuleAbbreviation",  columnDefinition = "VARCHAR(255)   COMMENT '所属模块简称'")
    private String subordinateModuleAbbreviation;

    /**
     * 简称后缀
     */
    @Column(name = "abbreviationSuffix",  columnDefinition = "VARCHAR(255)   COMMENT '简称后缀'")
    private String abbreviationSuffix;

    /**
     * 邮箱号
     */
    @Column(name = "email",  columnDefinition = "VARCHAR(255)   COMMENT '邮箱号'")
    private String email;

    /**
     * 公司正式员工简称
     */
    @Column(name = "companyStaffAbbreviation",  columnDefinition = "VARCHAR(255)   COMMENT '公司正式员工简称'")
    private String companyStaffAbbreviation;

    /**
     * 社保人员简称
     */
    @Column(name = "socialSecurityStaffAbbreviation",  columnDefinition = "VARCHAR(255)   COMMENT '社保人员简称'")
    private String socialSecurityStaffAbbreviation;

    /**
     * 外账人员简称
     */
    @Column(name = "accountStaffAbbreviation",  columnDefinition = "VARCHAR(255)   COMMENT '外账人员简称'")
    private String accountStaffAbbreviation;

    /**
     * 游客简称
     */
    @Column(name = "touristAbbreviation",  columnDefinition = "VARCHAR(255)   COMMENT '游客简称'")
    private String touristAbbreviation;

    /**
     * 数字序号
     */
    @Column(name = "accountNum", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '数字序号'")
    private String accountNum;

    /**
     * 备注
     */
    @Column(name = "accountRemark", columnDefinition = "VARCHAR(255)   COMMENT '备注'")
    private String accountRemark;

    /**
     * 所属公司简称
     */
    @Column(name = "pwdSubordinateCompanyAbbreviation",  columnDefinition = "VARCHAR(255)   COMMENT '所属公司简称'")
    private String pwdSubordinateCompanyAbbreviation;

    /**
     * 所属项目组简称
     */
    @Column(name = "subordinateProjectTeamAbbreviation",  columnDefinition = "VARCHAR(255)   COMMENT '所属项目组简称'")
    private String subordinateProjectTeamAbbreviation;

    /**
     * 初始英文简称
     */
    @Column(name = "initialEnglishAbbreviation",  columnDefinition = "VARCHAR(255)   COMMENT '初始英文简称'")
    private String initialEnglishAbbreviation;

    /**
     * 数字序号
     */
    @Column(name = "pwdNum", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '数字序号'")
    private String pwdNum;

    /**
     * 备注
     */
    @Column(name = "pwdRemark",  columnDefinition = "VARCHAR(255)   COMMENT '备注'")
    private String pwdRemark;


    public String getAreaAbbreviation() {
        return areaAbbreviation;
    }

    public void setAreaAbbreviation(String areaAbbreviation) {
        this.areaAbbreviation = areaAbbreviation;
    }

    public String getRepresentativeAbbreviation() {
        return representativeAbbreviation;
    }

    public void setRepresentativeAbbreviation(String representativeAbbreviation) {
        this.representativeAbbreviation = representativeAbbreviation;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getOperatorAbbreviation() {
        return operatorAbbreviation;
    }

    public void setOperatorAbbreviation(String operatorAbbreviation) {
        this.operatorAbbreviation = operatorAbbreviation;
    }

    public String getFactoryAbbreviation() {
        return factoryAbbreviation;
    }

    public void setFactoryAbbreviation(String factoryAbbreviation) {
        this.factoryAbbreviation = factoryAbbreviation;
    }

    public String getContractorAbbreviation() {
        return contractorAbbreviation;
    }

    public void setContractorAbbreviation(String contractorAbbreviation) {
        this.contractorAbbreviation = contractorAbbreviation;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAccountSubordinateCompanyAbbreviation() {
        return accountSubordinateCompanyAbbreviation;
    }

    public void setAccountSubordinateCompanyAbbreviation(String accountSubordinateCompanyAbbreviation) {
        this.accountSubordinateCompanyAbbreviation = accountSubordinateCompanyAbbreviation;
    }

    public String getSubordinateDepartmentAbbreviation() {
        return subordinateDepartmentAbbreviation;
    }

    public void setSubordinateDepartmentAbbreviation(String subordinateDepartmentAbbreviation) {
        this.subordinateDepartmentAbbreviation = subordinateDepartmentAbbreviation;
    }

    public String getSubordinateModuleAbbreviation() {
        return subordinateModuleAbbreviation;
    }

    public void setSubordinateModuleAbbreviation(String subordinateModuleAbbreviation) {
        this.subordinateModuleAbbreviation = subordinateModuleAbbreviation;
    }

    public String getAbbreviationSuffix() {
        return abbreviationSuffix;
    }

    public void setAbbreviationSuffix(String abbreviationSuffix) {
        this.abbreviationSuffix = abbreviationSuffix;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyStaffAbbreviation() {
        return companyStaffAbbreviation;
    }

    public void setCompanyStaffAbbreviation(String companyStaffAbbreviation) {
        this.companyStaffAbbreviation = companyStaffAbbreviation;
    }

    public String getSocialSecurityStaffAbbreviation() {
        return socialSecurityStaffAbbreviation;
    }

    public void setSocialSecurityStaffAbbreviation(String socialSecurityStaffAbbreviation) {
        this.socialSecurityStaffAbbreviation = socialSecurityStaffAbbreviation;
    }

    public String getAccountStaffAbbreviation() {
        return accountStaffAbbreviation;
    }

    public void setAccountStaffAbbreviation(String accountStaffAbbreviation) {
        this.accountStaffAbbreviation = accountStaffAbbreviation;
    }

    public String getTouristAbbreviation() {
        return touristAbbreviation;
    }

    public void setTouristAbbreviation(String touristAbbreviation) {
        this.touristAbbreviation = touristAbbreviation;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountRemark() {
        return accountRemark;
    }

    public void setAccountRemark(String accountRemark) {
        this.accountRemark = accountRemark;
    }

    public String getPwdSubordinateCompanyAbbreviation() {
        return pwdSubordinateCompanyAbbreviation;
    }

    public void setPwdSubordinateCompanyAbbreviation(String pwdSubordinateCompanyAbbreviation) {
        this.pwdSubordinateCompanyAbbreviation = pwdSubordinateCompanyAbbreviation;
    }

    public String getSubordinateProjectTeamAbbreviation() {
        return subordinateProjectTeamAbbreviation;
    }

    public void setSubordinateProjectTeamAbbreviation(String subordinateProjectTeamAbbreviation) {
        this.subordinateProjectTeamAbbreviation = subordinateProjectTeamAbbreviation;
    }

    public String getInitialEnglishAbbreviation() {
        return initialEnglishAbbreviation;
    }

    public void setInitialEnglishAbbreviation(String initialEnglishAbbreviation) {
        this.initialEnglishAbbreviation = initialEnglishAbbreviation;
    }

    public String getPwdNum() {
        return pwdNum;
    }

    public void setPwdNum(String pwdNum) {
        this.pwdNum = pwdNum;
    }

    public String getPwdRemark() {
        return pwdRemark;
    }

    public void setPwdRemark(String pwdRemark) {
        this.pwdRemark = pwdRemark;
    }
}