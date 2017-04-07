package com.bjike.goddess.annual.api;

import com.bjike.goddess.annual.bo.AnnualStandardBO;
import com.bjike.goddess.annual.service.AnnualStandardSer;
import com.bjike.goddess.annual.to.AnnualStandardTO;
import com.bjike.goddess.common.api.exception.SerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 年假标准业务接口实现
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-03-27 04:26 ]
 * @Description: [ 年假标准业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("annualStandardApiImpl")
public class AnnualStandardApiImpl implements AnnualStandardAPI {

    @Autowired
    private AnnualStandardSer annualStandardSer;

    @Override
    public AnnualStandardBO save(AnnualStandardTO to) throws SerException {
        return annualStandardSer.save(to);
    }

    @Override
    public AnnualStandardBO update(AnnualStandardTO to) throws SerException {
        return annualStandardSer.update(to);
    }

    @Override
    public AnnualStandardBO delete(AnnualStandardTO to) throws SerException {
        return annualStandardSer.delete(to);
    }

    @Override
    public AnnualStandardBO congeal(AnnualStandardTO to) throws SerException {
        return annualStandardSer.congeal(to);
    }

    @Override
    public AnnualStandardBO thaw(AnnualStandardTO to) throws SerException {
        return annualStandardSer.thaw(to);
    }

    @Override
    public List<AnnualStandardBO> findThaw() throws SerException {
        return annualStandardSer.findThaw();
    }

    @Override
    public AnnualStandardBO findBySeniority(Integer seniority) throws SerException {
        return annualStandardSer.findBySeniority(seniority);
    }
}