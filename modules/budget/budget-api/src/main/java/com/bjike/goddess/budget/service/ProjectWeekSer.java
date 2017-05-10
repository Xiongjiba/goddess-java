package com.bjike.goddess.budget.service;

import com.bjike.goddess.budget.bo.ProjectWeekBO;
import com.bjike.goddess.budget.bo.ProjectWeekCountBO;
import com.bjike.goddess.budget.dto.ProjectWeekDTO;
import com.bjike.goddess.budget.entity.ProjectWeek;
import com.bjike.goddess.budget.to.ProjectWeekTO;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;

import java.util.List;

/**
 * 项目收入周业务接口
 *
 * @Author: [ chenjunhao ]
 * @Date: [ 2017-05-02 03:58 ]
 * @Description: [ 项目收入周业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface ProjectWeekSer extends Ser<ProjectWeek, ProjectWeekDTO> {
    /**
     * 添加
     *
     * @param to 项目收入周信息
     * @return class ProjectWeekBO
     * @throws SerException
     */
    default ProjectWeekBO save(ProjectWeekTO to) throws SerException {
        return null;
    }

    /**
     * 编辑
     *
     * @param to 项目收入周信息
     * @throws SerException
     */
    default void edit(ProjectWeekTO to) throws SerException {
    }

    /**
     * 删除
     *
     * @param id 项目收入周id
     * @throws SerException
     */
    default void delete(String id) throws SerException {

    }

    /**
     * 查找
     *
     * @param dto 项目收入周分页信息
     * @return class ProjectWeekBO
     * @throws SerException
     */
    default List<ProjectWeekBO> list(ProjectWeekDTO dto) throws SerException {
        return null;
    }

    /**
     * 通过id查找
     *
     * @param id 项目收入周id
     * @return class ProjectWeekBO
     * @throws SerException
     */
    default ProjectWeekBO findByID(String id) throws SerException {
        return null;
    }

    /**
     * 汇总
     *
     * @return class ProjectWeekCountBO
     * @throws SerException
     */
    default List<ProjectWeekCountBO> count() throws SerException {
        return null;
    }

    /**
     * 分项目汇总
     *
     * @param projects 项目数组
     * @return class ProjectWeekCountBO
     * @throws SerException
     */
    default List<ProjectWeekCountBO> conditionsCount(String[] projects) throws SerException {
        return null;
    }
}