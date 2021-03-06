package com.bjike.goddess.attainment.service;

import com.bjike.goddess.attainment.bo.SurveyPlanBO;
import com.bjike.goddess.attainment.dto.SurveyActualizeDTO;
import com.bjike.goddess.attainment.dto.SurveyPlanDTO;
import com.bjike.goddess.attainment.entity.SurveyDemand;
import com.bjike.goddess.attainment.entity.SurveyPlan;
import com.bjike.goddess.attainment.enums.AuditType;
import com.bjike.goddess.attainment.to.SurveyPlanTO;
import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 调研计划业务实现
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-04-06 10:41 ]
 * @Description: [ 调研计划业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "attainmentSerCache")
@Service
public class SurveyPlanSerImpl extends ServiceImpl<SurveyPlan, SurveyPlanDTO> implements SurveyPlanSer {

    @Autowired
    private SurveyDemandSer demandSer;
    @Autowired
    private SurveyActualizeSer surveyActualizeSer;
    @Autowired
    private SurveyAnalyseSer surveyAnalyseSer;
    @Autowired
    private SurveyPlanAuditSer surveyPlanAuditSer;

    private SurveyPlanBO transformBO(SurveyPlan entity) throws SerException {
        SurveyPlanBO bo = BeanTransform.copyProperties(entity, SurveyPlanBO.class);
        SurveyDemand demand = entity.getDemand();
        bo.setDemandId(demand.getId());
        bo.setDemandName(demand.getDemand().getType());
        bo.setPurpose(demand.getPurpose());
        bo.setScope(demand.getScope());
        bo.setTypeName(demand.getType().getType());
        bo.setUsername(demand.getUsername());
        bo.isRegular(demand.getType().isRegular());
        bo.setTheme(demand.getTheme());
        bo.setPurpose(demand.getPurpose());
        bo.setScope(demand.getScope());
        bo.setScopeName(demand.getScopeName());
        return bo;
    }

    private List<SurveyPlanBO> transformBOList(List<SurveyPlan> list) throws SerException {
        List<SurveyPlanBO> bos = new ArrayList<>(list.size());
        for (SurveyPlan entity : list)
            bos.add(this.transformBO(entity));
        return bos;
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public SurveyPlanBO save(SurveyPlanTO to) throws SerException {
        SurveyPlan entity = BeanTransform.copyProperties(to, SurveyPlan.class, true);
        entity.setDemand(demandSer.findById(to.getDemandId()));
        if (null == entity.getDemand())
            throw new SerException("选择的调研需求不存在,无法保存");
        entity.setAudit(AuditType.NONE);
        super.save(entity);
        return this.transformBO(entity);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public SurveyPlanBO update(SurveyPlanTO to) throws SerException {
        SurveyPlan entity = super.findById(to.getId());
        if (null == entity)
            throw new SerException("数据不存在");
        BeanTransform.copyProperties(to, entity, true);
        entity.setModifyTime(LocalDateTime.now());
        entity.setDemand(demandSer.findById(to.getDemandId()));
        if (null == entity.getDemand())
            throw new SerException("选择的调研需求不存在,无法保存");
        super.update(entity);
        return this.transformBO(entity);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public SurveyPlanBO delete(String id) throws SerException {
        SurveyPlan entity = super.findById(id);
        if (null == entity)
            throw new SerException("数据不存在");
        SurveyActualizeDTO dto = new SurveyActualizeDTO();
        dto.getConditions().add(Restrict.eq("plan.id", entity.getId()));
        if (surveyActualizeSer.findByCis(dto).size() != 0 || surveyAnalyseSer.findByPlan(entity.getId()).size() != 0 || surveyPlanAuditSer.findByPlan(entity.getId()).size() != 0)
            throw new SerException("存在依赖关系无法删除");
        super.remove(entity);
        return this.transformBO(entity);
    }

    @Override
    public List<SurveyPlanBO> findByDemand(String demand_id) throws SerException {
        SurveyPlanDTO dto = new SurveyPlanDTO();
        dto.getConditions().add(Restrict.eq("demand.id", demand_id));
        List<SurveyPlan> list = super.findByCis(dto);
        return this.transformBOList(list);
    }

    @Override
    public SurveyPlanBO findBOById(String id) throws SerException {
        SurveyPlan entity = super.findById(id);
        if (null == entity)
            throw new SerException("数据不存在");
        return this.transformBO(entity);
    }

    @Override
    public List<SurveyPlanBO> maps(SurveyPlanDTO dto) throws SerException {
        dto.getSorts().add("startTime=desc");
        return this.transformBOList(super.findByPage(dto));
    }

    @Override
    public Long getTotal() throws SerException {
        SurveyPlanDTO dto = new SurveyPlanDTO();
        return super.count(dto);
    }
}