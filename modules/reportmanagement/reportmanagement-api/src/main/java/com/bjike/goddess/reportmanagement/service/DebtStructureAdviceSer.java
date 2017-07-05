package com.bjike.goddess.reportmanagement.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.reportmanagement.bo.DebtStructureAdviceBO;
import com.bjike.goddess.reportmanagement.dto.DebtStructureAdviceDTO;
import com.bjike.goddess.reportmanagement.entity.DebtStructureAdvice;
import com.bjike.goddess.reportmanagement.to.DebtStructureAdviceTO;

import java.util.List;

/**
 * 负债与权益结构管理建议设计业务接口
 *
 * @Author: [ chenjunhao ]
 * @Date: [ 2017-06-30 04:56 ]
 * @Description: [ 负债与权益结构管理建议设计业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface DebtStructureAdviceSer extends Ser<DebtStructureAdvice, DebtStructureAdviceDTO> {
    /**
     * 列表
     *
     * @param dto
     * @return
     * @throws SerException
     */
    List<DebtStructureAdviceBO> list(DebtStructureAdviceDTO dto) throws SerException;

    /**
     * 添加
     *
     * @param to
     * @return
     * @throws SerException
     */
    DebtStructureAdviceBO save(DebtStructureAdviceTO to) throws SerException;

    /**
     * 编辑
     *
     * @param to
     * @throws SerException
     */
    void edit(DebtStructureAdviceTO to) throws SerException;

    /**
     * 删除
     *
     * @param id
     * @throws SerException
     */
    void delete(String id) throws SerException;

    /**
     * 通过id查找
     *
     * @param id
     * @return
     * @throws SerException
     */
    DebtStructureAdviceBO findByID(String id) throws SerException;

    /**
     * 查找总记录数
     *
     * @param dto
     * @return
     * @throws SerException
     */
    Long count(DebtStructureAdviceDTO dto) throws SerException;
}