package com.bjike.goddess.attainment.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

/**
 * 调研表问题业务传输对象
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-04-06 11:23 ]
 * @Description: [ 调研表问题业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class SurveyQuestionnaireBO extends BaseBO {

    /**
     * 调研实施id
     */
    private String actualize_id;

    /**
     * 问题
     */
    private String questionnaire;

    /**
     * 单选多选
     */
    private Boolean multiple;

    /**
     * 题号
     */
    private Integer num;

    public String getActualize_id() {
        return actualize_id;
    }

    public void setActualize_id(String actualize_id) {
        this.actualize_id = actualize_id;
    }

    public String getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(String questionnaire) {
        this.questionnaire = questionnaire;
    }

    public Boolean getMultiple() {
        return multiple;
    }

    public void setMultiple(Boolean multiple) {
        this.multiple = multiple;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }


}