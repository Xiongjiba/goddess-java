package com.bjike.goddess.market.to;

import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.entity.EDIT;
import com.bjike.goddess.common.api.to.BaseTO;
import com.bjike.goddess.market.enums.CooperationWay;
import com.bjike.goddess.market.enums.ProjectType;
import com.bjike.goddess.market.enums.SourceInfo;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * 市场信息记录
 *
 * @Author: [ lijuntao ]
 * @Date: [ 2017-10-20 11:50 ]
 * @Description: [ 市场信息记录 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class MarketInfoRecordTO extends BaseTO {

    /**
     * 市场信息编号
     */
    @NotBlank(message = "市场信息编号不能为空",groups = {ADD.class, EDIT.class})
    private String marketInfoNum;

    /**
     * 信息收集日期
     */
    @NotBlank(message = "信息收集日期不能为空",groups = {ADD.class, EDIT.class})
    private String infoCollectDate;

    /**
     * 业务类型
     */
    @NotBlank(message = "业务类型不能为空",groups = {ADD.class, EDIT.class})
    private String businessType;

    /**
     * 业务方向
     */
    @NotBlank(message = "业务方向不能为空",groups = {ADD.class, EDIT.class})
    private String businessDirection;

    /**
     * 专业
     */
    private String[] majors;

    /**
     * 合作方式
     */
    private CooperationWay cooperationWay;

    /**
     * 项目类型
     */
    private ProjectType projectType;

    /**
     * 需求
     */
    private String demand;

    /**
     * 合同金额
     */
    private Double contractAmount;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 地区
     */
    @NotBlank(message = "地区不能为空",groups = {ADD.class, EDIT.class})
    private String area;

    /**
     * 地区框架
     */
    private String areaFrames;

    /**
     * 参加竞标单位
     */
    private String bidUnit;

    /**
     * 信息来源
     */
    @NotNull(message = "信息来源不能为空",groups = {ADD.class, EDIT.class})
    private SourceInfo sourceInfo;

    /**
     * 合作项目区域分布
     */
    private String coopProjectAreaDistr;

    /**
     * 以前合作过的公司
     */
    private String beforeCoopCompan;

    /**
     * 现业务有关联公司
     */
    private String businessAffiliate;

    /**
     * 未来发展方向
     */
    private String futureDevelopmentDire;

    /**
     * 信息收集人
     */
    private String infoCollectPepol;

    /**
     * 总金额
     */
    private Double totalAmount;

    /**
     * 工作量/规模数量
     */
    private Integer workload;

    /**
     * 人员数量
     */
    private Integer peopelNum;

    /**
     * 配置要求
     */
    private String configRequirements;

    /**
     * 设备费用
     */
    private Double equipmentCost;

    /**
     * 车辆费用
     */
    private Double vehicleCost;

    /**
     * 服务费用
     */
    private Double serviceCost;

    /**
     * 配置费用
     */
    private Double configCost;

    /**
     * 资质要求
     */
    private String qualificationRequi;

    /**
     * 发起时间
     */
    private String initiateDate;

    /**
     * 时效开始时间
     */
    @NotBlank(message = "时效开始时间不能为空",groups = {ADD.class, EDIT.class})
    private String agingStartTime;

    /**
     * 时效结束时间
     */
    @NotBlank(message = "时效结束时间不能为空",groups = {ADD.class, EDIT.class})
    private String agingEndTime;

    /**
     * 结束时间
     */
    private String endDate;

    /**
     * 付款形式
     */
    private String payWay;

    /**
     * 发票类型
     */
    private String invoiceType;

    /**
     * 回款时间
     */
    private String receivableDate;

    /**
     * 回款方式
     */
    private String receivableWay;

    /**
     * 汇款内容
     */
    private String remittanceContent;

    /**
     * 内部项目名称
     */
    private String internalProjectName;

    /**
     * 客户信息编号
     */
    @NotBlank(message = "市场信息编号不能为空",groups = {ADD.class, EDIT.class})
    private String customerInfoNum;

    /**
     * 客户姓名
     */
    @NotBlank(message = "客户姓名不能为空",groups = {ADD.class, EDIT.class})
    private String customerName;

    /**
     * 组织机构名称
     */
    private String organizationName;

    /**
     * 竞争对手名称
     */
    @NotBlank(message = "竞争对手名称不能为空",groups = {ADD.class, EDIT.class})
    private String competitorsName;

    /**
     * 客户/竞争对手信息填写人
     */
    @NotNull(message = "客户/竞争对手信息填写人不能为空",groups = {ADD.class, EDIT.class})
    private String[] infoFillPerson;

    /**
     * 预估转正金额
     */
    @NotNull(message = "预估转正金额不能为空",groups = {ADD.class, EDIT.class})
    private Double estimateTransferAmount;

    /**
     * 预估市场亏损金额
     */
    @NotNull(message = "预估市场亏损金额不能为空",groups = {ADD.class, EDIT.class})
    private Double estimateMarketLoss;

    /**
     * 备注
     */
    private String remark;

    public String getMarketInfoNum() {
        return marketInfoNum;
    }

    public void setMarketInfoNum(String marketInfoNum) {
        this.marketInfoNum = marketInfoNum;
    }

    public String getInfoCollectDate() {
        return infoCollectDate;
    }

    public void setInfoCollectDate(String infoCollectDate) {
        this.infoCollectDate = infoCollectDate;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessDirection() {
        return businessDirection;
    }

    public void setBusinessDirection(String businessDirection) {
        this.businessDirection = businessDirection;
    }

    public String[] getMajors() {
        return majors;
    }

    public void setMajors(String[] majors) {
        this.majors = majors;
    }

    public CooperationWay getCooperationWay() {
        return cooperationWay;
    }

    public void setCooperationWay(CooperationWay cooperationWay) {
        this.cooperationWay = cooperationWay;
    }

    public ProjectType getProjectType() {
        return projectType;
    }

    public void setProjectType(ProjectType projectType) {
        this.projectType = projectType;
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand;
    }

    public Double getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(Double contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreaFrames() {
        return areaFrames;
    }

    public void setAreaFrames(String areaFrames) {
        this.areaFrames = areaFrames;
    }

    public String getBidUnit() {
        return bidUnit;
    }

    public void setBidUnit(String bidUnit) {
        this.bidUnit = bidUnit;
    }

    public SourceInfo getSourceInfo() {
        return sourceInfo;
    }

    public void setSourceInfo(SourceInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    public String getCoopProjectAreaDistr() {
        return coopProjectAreaDistr;
    }

    public void setCoopProjectAreaDistr(String coopProjectAreaDistr) {
        this.coopProjectAreaDistr = coopProjectAreaDistr;
    }

    public String getBeforeCoopCompan() {
        return beforeCoopCompan;
    }

    public void setBeforeCoopCompan(String beforeCoopCompan) {
        this.beforeCoopCompan = beforeCoopCompan;
    }

    public String getBusinessAffiliate() {
        return businessAffiliate;
    }

    public void setBusinessAffiliate(String businessAffiliate) {
        this.businessAffiliate = businessAffiliate;
    }

    public String getFutureDevelopmentDire() {
        return futureDevelopmentDire;
    }

    public void setFutureDevelopmentDire(String futureDevelopmentDire) {
        this.futureDevelopmentDire = futureDevelopmentDire;
    }

    public String getInfoCollectPepol() {
        return infoCollectPepol;
    }

    public void setInfoCollectPepol(String infoCollectPepol) {
        this.infoCollectPepol = infoCollectPepol;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    public Integer getPeopelNum() {
        return peopelNum;
    }

    public void setPeopelNum(Integer peopelNum) {
        this.peopelNum = peopelNum;
    }

    public String getConfigRequirements() {
        return configRequirements;
    }

    public void setConfigRequirements(String configRequirements) {
        this.configRequirements = configRequirements;
    }

    public Double getEquipmentCost() {
        return equipmentCost;
    }

    public void setEquipmentCost(Double equipmentCost) {
        this.equipmentCost = equipmentCost;
    }

    public Double getVehicleCost() {
        return vehicleCost;
    }

    public void setVehicleCost(Double vehicleCost) {
        this.vehicleCost = vehicleCost;
    }

    public Double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public Double getConfigCost() {
        return configCost;
    }

    public void setConfigCost(Double configCost) {
        this.configCost = configCost;
    }

    public String getQualificationRequi() {
        return qualificationRequi;
    }

    public void setQualificationRequi(String qualificationRequi) {
        this.qualificationRequi = qualificationRequi;
    }

    public String getInitiateDate() {
        return initiateDate;
    }

    public void setInitiateDate(String initiateDate) {
        this.initiateDate = initiateDate;
    }

    public String getAgingStartTime() {
        return agingStartTime;
    }

    public void setAgingStartTime(String agingStartTime) {
        this.agingStartTime = agingStartTime;
    }

    public String getAgingEndTime() {
        return agingEndTime;
    }

    public void setAgingEndTime(String agingEndTime) {
        this.agingEndTime = agingEndTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getReceivableDate() {
        return receivableDate;
    }

    public void setReceivableDate(String receivableDate) {
        this.receivableDate = receivableDate;
    }

    public String getReceivableWay() {
        return receivableWay;
    }

    public void setReceivableWay(String receivableWay) {
        this.receivableWay = receivableWay;
    }

    public String getRemittanceContent() {
        return remittanceContent;
    }

    public void setRemittanceContent(String remittanceContent) {
        this.remittanceContent = remittanceContent;
    }

    public String getInternalProjectName() {
        return internalProjectName;
    }

    public void setInternalProjectName(String internalProjectName) {
        this.internalProjectName = internalProjectName;
    }

    public String getCustomerInfoNum() {
        return customerInfoNum;
    }

    public void setCustomerInfoNum(String customerInfoNum) {
        this.customerInfoNum = customerInfoNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getCompetitorsName() {
        return competitorsName;
    }

    public void setCompetitorsName(String competitorsName) {
        this.competitorsName = competitorsName;
    }

    public String[] getInfoFillPerson() {
        return infoFillPerson;
    }

    public void setInfoFillPerson(String[] infoFillPerson) {
        this.infoFillPerson = infoFillPerson;
    }

    public Double getEstimateTransferAmount() {
        return estimateTransferAmount;
    }

    public void setEstimateTransferAmount(Double estimateTransferAmount) {
        this.estimateTransferAmount = estimateTransferAmount;
    }

    public Double getEstimateMarketLoss() {
        return estimateMarketLoss;
    }

    public void setEstimateMarketLoss(Double estimateMarketLoss) {
        this.estimateMarketLoss = estimateMarketLoss;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}