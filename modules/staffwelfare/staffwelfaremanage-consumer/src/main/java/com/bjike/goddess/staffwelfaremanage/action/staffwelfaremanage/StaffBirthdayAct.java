package com.bjike.goddess.staffwelfaremanage.action.staffwelfaremanage;

import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.user.api.UserDetailAPI;
import com.bjike.goddess.user.dto.UserDetailDTO;
import com.bjike.goddess.user.vo.UserDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 员工生日信息
 *
 * @Author: [Jason]
 * @Date: [17-4-5 上午10:25]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@RestController
@RequestMapping("staffbirthday")
public class StaffBirthdayAct {

    @Autowired
    private UserDetailAPI userDetailAPI;

    /**
     * 查询员工生日信息
     *
     * @param dto 分页信息
     * @param month 生日月份
     * @version v1
     */
    @GetMapping("v1/findStaffBirthInfo")
    public Result findStaffBirthInfo(UserDetailDTO dto, Integer month) throws ActException {
        try {
            List<UserDetailVO> voList = BeanTransform.copyProperties(userDetailAPI.findByMonth(dto, month), UserDetailVO.class);
            return ActResult.initialize(voList);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

}
