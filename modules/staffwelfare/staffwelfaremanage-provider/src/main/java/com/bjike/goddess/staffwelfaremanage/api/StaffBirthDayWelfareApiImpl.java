package com.bjike.goddess.staffwelfaremanage.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.staffwelfaremanage.bo.StaffBirthDayWelfareBO;
import com.bjike.goddess.staffwelfaremanage.dto.StaffBirthDayWelfareDTO;
import com.bjike.goddess.staffwelfaremanage.service.StaffBirthDayWelfareSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 员工生日福利记录业务接口实现
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-04-07 10:49 ]
 * @Description: [ 员工生日福利记录业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("staffBirthDayWelfareApiImpl")
public class StaffBirthDayWelfareApiImpl implements StaffBirthDayWelfareAPI {

    @Autowired
    private StaffBirthDayWelfareSer staffBirthDayWelfareSer;

    @Override
    public List<StaffBirthDayWelfareBO> pageList(StaffBirthDayWelfareDTO dto) throws SerException {
        return staffBirthDayWelfareSer.pageList(dto);
    }
}