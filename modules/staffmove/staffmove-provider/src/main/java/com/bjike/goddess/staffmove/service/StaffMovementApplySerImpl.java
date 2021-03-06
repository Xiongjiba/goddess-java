package com.bjike.goddess.staffmove.service;

import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.staffmove.bo.StaffMovementApplyBO;
import com.bjike.goddess.staffmove.dto.StaffMovementApplyDTO;
import com.bjike.goddess.staffmove.entity.StaffMovementApply;
import com.bjike.goddess.staffmove.enums.AuditorType;
import com.bjike.goddess.staffmove.to.StaffMovementApplyTO;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 人员调动申请业务实现
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-04-22 04:40 ]
 * @Description: [ 人员调动申请业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "staffmoveSerCache")
@Service
public class StaffMovementApplySerImpl extends ServiceImpl<StaffMovementApply, StaffMovementApplyDTO> implements StaffMovementApplySer {

    @Override
    public Long countStaffMovementApply(StaffMovementApplyDTO staffMovementApplyDTO) throws SerException {
        staffMovementApplyDTO.getSorts().add("createTime=desc");
        Long count = super.count(staffMovementApplyDTO);
        return count;
    }

    @Override
    public StaffMovementApplyBO getOne(String id) throws SerException {
        StaffMovementApply staffMovementApply = super.findById(id);
        return BeanTransform.copyProperties(staffMovementApply, StaffMovementApplyBO.class);
    }

    @Override
    public List<StaffMovementApplyBO> findListStaffMovementApply(StaffMovementApplyDTO staffMovementApplyDTO) throws SerException {
        List<StaffMovementApply> staffMovementApplies = super.findByCis(staffMovementApplyDTO, true);
        List<StaffMovementApplyBO> staffMovementApplyBOS = BeanTransform.copyProperties(staffMovementApplies, StaffMovementApplyBO.class);
        return staffMovementApplyBOS;
    }

    @Override
    public StaffMovementApplyBO insertStaffMovementApply(StaffMovementApplyTO staffMovementApplyTO) throws SerException {
        StaffMovementApply staffMovementApply = BeanTransform.copyProperties(staffMovementApplyTO, StaffMovementApply.class, true);
        staffMovementApply.setCreateTime(LocalDateTime.now());
        super.save(staffMovementApply);
        return BeanTransform.copyProperties(staffMovementApply, StaffMovementApplyBO.class);
    }

    @Override
    public StaffMovementApplyBO editStaffMovementApply(StaffMovementApplyTO staffMovementApplyTO) throws SerException {
        StaffMovementApply staffMovementApply = super.findById(staffMovementApplyTO.getId());
        BeanTransform.copyProperties(staffMovementApplyTO, staffMovementApply, true);
        staffMovementApply.setModifyTime(LocalDateTime.now());
        super.update(staffMovementApply);
        return BeanTransform.copyProperties(staffMovementApply, StaffMovementApplyBO.class);
    }

    @Override
    public void removeStaffMovementApply(String id) throws SerException {
        super.remove(id);
    }

    @Override
    public StaffMovementApplyBO auditStaffMovementApply(StaffMovementApplyTO staffMovementApplyTO) throws SerException {
        StaffMovementApply staffMovementApply = super.findById(staffMovementApplyTO.getId());
        BeanTransform.copyProperties(staffMovementApplyTO,staffMovementApply, true);
//        switch (staffMovementApply.getAuditor()) {
//            case GENERALMANAGER:
//                staffMovementApply.setGeneralAuditOpinion(staffMovementApplyTO.getGeneralAuditOpinion());
//                break;
//            case ORIGINALPOLICYMAKERS:
//                staffMovementApply.setOriginalAuditOpinion(staffMovementApplyTO.getOriginalAuditOpinion());
//                break;
//            case TRANSFERREDPOLICYMAKERS:
//                staffMovementApply.setTransferAuditOpinion(staffMovementApplyTO.getTransferAuditOpinion());
//                break;
//            case PLANMODULE:
//                staffMovementApply.setPlanAuditOpinion(staffMovementApplyTO.getPlanAuditOpinion());
//                break;
//            case BUDGETMODULE:
//                staffMovementApply.setBudgetAuditOpinion(staffMovementApplyTO.getBudgetAuditOpinion());
//                break;
//            default:
//                break;
//        }
        if (AuditorType.GENERALMANAGER.equals(AuditorType.GENERALMANAGER)) {
            staffMovementApply.setGeneralAuditOpinion(staffMovementApplyTO.getGeneralAuditOpinion());
        }
        if (AuditorType.ORIGINALPOLICYMAKERS.equals(AuditorType.ORIGINALPOLICYMAKERS)) {
            staffMovementApply.setOriginalAuditOpinion(staffMovementApplyTO.getOriginalAuditOpinion());
        }
        if (AuditorType.TRANSFERREDPOLICYMAKERS.equals(AuditorType.TRANSFERREDPOLICYMAKERS)) {
            staffMovementApply.setTransferAuditOpinion(staffMovementApplyTO.getTransferAuditOpinion());
        }
        if (AuditorType.PLANMODULE.equals(AuditorType.PLANMODULE)) {
            staffMovementApply.setPlanAuditOpinion(staffMovementApplyTO.getPlanAuditOpinion());
        }
        if (AuditorType.BUDGETMODULE.equals(AuditorType.BUDGETMODULE)) {
            staffMovementApply.setBudgetAuditOpinion(staffMovementApplyTO.getBudgetAuditOpinion());
        }
        /*if (AuditorType.GENERALMANAGER.equals(staffMovementApply.getAuditor())) {
            dto.getConditions().add(Restrict.eq("generalmanager", AuditorType.GENERALMANAGER));
            staffMovementApply.setAuditOpinion(staffMovementApplyTO.getAuditOpinion());
        }
        if (AuditorType.ORIGINALPOLICYMAKERS.equals(staffMovementApply.getAuditor())) {
            dto.getConditions().add(Restrict.eq("originalpolicymakers", AuditorType.ORIGINALPOLICYMAKERS));
            staffMovementApply.setAuditOpinion(staffMovementApplyTO.getAuditOpinion());
        }
        if (AuditorType.TRANSFERREDPOLICYMAKERS.equals(staffMovementApply.getAuditor())) {
            dto.getConditions().add(Restrict.eq("transferredpolicymakers", AuditorType.TRANSFERREDPOLICYMAKERS));
            staffMovementApply.setAuditOpinion(staffMovementApplyTO.getAuditOpinion());
        }
        if (AuditorType.PLANMODULE.equals(staffMovementApply.getAuditor())) {
            dto.getConditions().add(Restrict.eq("planmodule", AuditorType.PLANMODULE));
            staffMovementApply.setAuditOpinion(staffMovementApplyTO.getAuditOpinion());
        }
        if (AuditorType.BUDGETMODULE.equals(staffMovementApply.getAuditor())) {
            dto.getConditions().add(Restrict.eq("budgetmodule", AuditorType.BUDGETMODULE));
            staffMovementApply.setAuditOpinion(staffMovementApplyTO.getAuditOpinion());
        }*/
        super.save(staffMovementApply);
        return BeanTransform.copyProperties(staffMovementApply, StaffMovementApplyBO.class);
    }
}