package com.bjike.goddess.marketactivitymanage.bo;

import com.bjike.goddess.common.api.bo.BaseBO;
import com.bjike.goddess.marketactivitymanage.type.AuditType;

/**
 * 市场招待记录申请汇总或者市场招待记录汇总
 *
 * @Author: [sunfengtao]
 * @Date: [2017-03-21 17:22]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class ServeSummaryBO extends BaseBO {

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 地区
     */
    private String area;

    /**
     * 招待负责人
     */
    private String servePrincipal;

    /**
     * 客户姓名
     */
    private String clientName;

    /**
     * 活动类型
     */
    private String activityType;

    /**
     * 活动时间点
     */
    private String activityTiming;

    /**
     * 是否临时招待
     */
    private Boolean whetherTemporaryServe;

    /**
     * 参加人数
     */
    private Integer attendPeopleNo;

    /**
     * 费用
     */
    private double charge;

    /**
     * 金额
     */
    private double amount;

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

    public String getServePrincipal() {
        return servePrincipal;
    }

    public void setServePrincipal(String servePrincipal) {
        this.servePrincipal = servePrincipal;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getActivityTiming() {
        return activityTiming;
    }

    public void setActivityTiming(String activityTiming) {
        this.activityTiming = activityTiming;
    }

    public Boolean getWhetherTemporaryServe() {
        return whetherTemporaryServe;
    }

    public void setWhetherTemporaryServe(Boolean whetherTemporaryServe) {
        this.whetherTemporaryServe = whetherTemporaryServe;
    }

    public Integer getAttendPeopleNo() {
        return attendPeopleNo;
    }

    public void setAttendPeopleNo(Integer attendPeopleNo) {
        this.attendPeopleNo = attendPeopleNo;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
