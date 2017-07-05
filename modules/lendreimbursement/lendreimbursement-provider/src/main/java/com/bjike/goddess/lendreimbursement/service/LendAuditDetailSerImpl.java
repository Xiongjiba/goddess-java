package com.bjike.goddess.lendreimbursement.service;

import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.provider.utils.RpcTransmit;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.lendreimbursement.bo.LendAuditDetailBO;
import com.bjike.goddess.lendreimbursement.dto.LendAuditDetailDTO;
import com.bjike.goddess.lendreimbursement.entity.LendAuditDetail;
import com.bjike.goddess.lendreimbursement.enums.GuideAddrStatus;
import com.bjike.goddess.lendreimbursement.to.GuidePermissionTO;
import com.bjike.goddess.user.api.UserAPI;
import com.bjike.goddess.user.bo.UserBO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 借款审核人员业务实现
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-04-06 10:06 ]
 * @Description: [ 借款审核人员业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "lendreimbursementSerCache")
@Service
public class LendAuditDetailSerImpl extends ServiceImpl<LendAuditDetail, LendAuditDetailDTO> implements LendAuditDetailSer {

    @Autowired
    private UserAPI userAPI;
    @Autowired
    private CusPermissionSer cusPermissionSer;

    @Override
    public Long countDetail(LendAuditDetailDTO lendAuditDetailDTO) throws SerException {
        lendAuditDetailDTO.getSorts().add("modifyTime=desc");
        Long counts = super.count( lendAuditDetailDTO);
        return counts;
    }

    @Override
    public LendAuditDetailBO getOneById(String id) throws SerException {
        if(StringUtils.isBlank(id)){
            throw new SerException("id不能呢为空");
        }
        LendAuditDetail lendAuditDetail = super.findById(id);
        return BeanTransform.copyProperties(lendAuditDetail, LendAuditDetailBO.class );
    }
    @Override
    public List<LendAuditDetailBO> listLendAuditDetail(LendAuditDetailDTO lendAuditDetailDTO) throws SerException {
        lendAuditDetailDTO.getSorts().add("modifyTime=desc");
        if(StringUtils.isNotBlank(lendAuditDetailDTO.getApplyLendId())){
            lendAuditDetailDTO.getConditions().add(Restrict.eq("applyLendId",lendAuditDetailDTO.getApplyLendId()));
        }
        List<LendAuditDetail> lendAuditDetails = super.findByCis( lendAuditDetailDTO,true);
        List<LendAuditDetailBO> lendAuditDetailBOS = BeanTransform.copyProperties(lendAuditDetails,LendAuditDetailBO.class);
        return lendAuditDetailBOS;
    }


}