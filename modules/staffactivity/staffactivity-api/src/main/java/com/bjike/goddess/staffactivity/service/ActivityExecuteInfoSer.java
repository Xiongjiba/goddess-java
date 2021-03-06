package com.bjike.goddess.staffactivity.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.staffactivity.bo.ActivityExecuteInfoBO;
import com.bjike.goddess.staffactivity.dto.ActivityExecuteInfoDTO;
import com.bjike.goddess.staffactivity.entity.ActivityExecuteInfo;
import com.bjike.goddess.staffactivity.to.ActivityExecuteInfoTO;

import java.util.List;

/**
 * 活动执行信息业务接口
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-04-09 09:09 ]
 * @Description: [  ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface ActivityExecuteInfoSer extends Ser<ActivityExecuteInfo, ActivityExecuteInfoDTO> {

    /**
     * 分页查询活动执行信息
     *
     * @param dto 活动执行信息dto
     * @return class ActivityExecuteInfoBO
     * @throws SerException
     */
    List<ActivityExecuteInfoBO> list(ActivityExecuteInfoDTO dto) throws SerException;

    /**
     * 保存活动执行信息
     *
     * @param to 活动执行信息to
     * @return class ActivityExecuteInfoBO
     * @throws SerException
     */
    ActivityExecuteInfoBO save(ActivityExecuteInfoTO to) throws SerException;

    /**
     * 根据id删除活动执行信息
     *
     * @param id 活动执行信息唯一标识
     * @throws SerException
     */
    void remove(String id) throws SerException;

    /**
     * 更新活动执行信息
     *
     * @param to 活动执行信息to
     * @throws SerException
     */
    void update(ActivityExecuteInfoTO to) throws SerException;

}