package com.bjike.goddess.market.api;

import com.bjike.goddess.market.bo.CusPermissionBO;
import com.bjike.goddess.market.dto.CusPermissionDTO;
import com.bjike.goddess.market.to.CusPermissionTO;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.organize.bo.OpinionBO;

import java.util.List;

/**
 * 市场信息限配置业务接口
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-05-12 05:43 ]
 * @Description: [ 市场信息权限配置业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface CusPermissionAPI {


    /**
     * 市场信息权限列表总条数
     */
    default Long countPermission(CusPermissionDTO cusPermissionDTO) throws SerException {
        return null;
    }

    /**
     * 市场信息权限列表
     *
     * @param cusPermissionDTO 市场信息权限数据
     * @return CusPermissionBO
     * @throws SerException
     */
    default List<CusPermissionBO> list(CusPermissionDTO cusPermissionDTO) throws SerException {
        return null;
    }

    /**
     * 一个市场信息权限
     *
     * @param id 市场信息权限id
     * @return CusPermissionBO
     * @throws SerException
     */
    default CusPermissionBO getOneById(String id) throws SerException {
        return null;
    }


    /**
     * 市场信息权限操作者
     *
     * @param id 市场信息权限id
     * @return OpinionBO 返回数据
     * @throws SerException
     */
    default List<OpinionBO> listOperateById(String id) throws SerException {
        return null;
    }

    /**
     * 添加市场信息权限
     *
     * @param cusPermissionTO 市场信息权限数据
     * @return CusPermissionBO
     * @throws SerException
     */
    default CusPermissionBO add(List<CusPermissionTO> cusPermissionTO) throws SerException {
        return null;
    }

    /**
     * 编辑市场信息权限
     *
     * @param cusPermissionTO 市场信息权限数据
     * @return CusPermissionBO
     * @throws SerException
     */
    default CusPermissionBO edit(CusPermissionTO cusPermissionTO) throws SerException {
        return null;
    }

    /**
     * 根据idFlag查询可以某种操作的市场信息权限
     *
     * @param idFlag 市场信息权限idFlag
     * @throws SerException
     */
    default Boolean getCusPermission(String idFlag) throws SerException {
        return null;
    }

    /**
     * 根据idFlag查询只有商务模块的才可以进行添加编辑删除操作
     *
     * @param idFlag 市场信息权限idFlag
     * @throws SerException
     */
    default Boolean busCusPermission(String idFlag) throws SerException {
        return null;
    }

}