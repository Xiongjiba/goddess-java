package com.bjike.goddess.user.service;


import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.user.bo.UserDetailBO;
import com.bjike.goddess.user.dto.DepartmentDTO;
import com.bjike.goddess.user.dto.UserDTO;
import com.bjike.goddess.user.dto.UserDetailDTO;
import com.bjike.goddess.user.dto.rbac.GroupDTO;
import com.bjike.goddess.user.entity.Department;
import com.bjike.goddess.user.entity.Position;
import com.bjike.goddess.user.entity.User;
import com.bjike.goddess.user.entity.UserDetail;
import com.bjike.goddess.user.entity.rbac.Group;
import com.bjike.goddess.user.service.rbac.GroupSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 部门业务实现
 *
 * @Author: [liguiqin]
 * @Date: [2016-12-28 15:47]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@CacheConfig(cacheNames = "userSerCache")
@Service
public class UserDetailSerImpl extends ServiceImpl<UserDetail, UserDetailDTO> implements UserDetailSer {


    @Autowired
    private DepartmentSer departmentSer;
    @Autowired
    private GroupSer groupSer;
    @Autowired
    private UserSer userSer;

    @Transactional
    @Override
    public UserDetailBO add() throws SerException {
        UserDTO dto = new UserDTO();
        dto.getConditions().add(Restrict.eq("phone", "13457910241"));
        User user = userSer.findOne(dto);
        UserDetail userDetail = new UserDetail();
        userDetail.setUser(user);
        DepartmentDTO departmentDTO = new DepartmentDTO();
        departmentDTO.getConditions().add(Restrict.eq("name", "a研发部"));
        Department department = departmentSer.findOne(departmentDTO);
        userDetail.setDepartment(department);

        GroupDTO groupDTO = new GroupDTO();
        groupDTO.getConditions().add(Restrict.eq("name", "项目组"));
        Group group = groupSer.findOne(groupDTO);
        userDetail.setGroup(group);
        super.save(userDetail);
        return BeanTransform.copyProperties(userDetail, UserDetailBO.class);
    }

    @Override
    public UserDetailBO findByUserId(String userId) throws SerException {
        UserDetailDTO detailDTO = new UserDetailDTO();
        detailDTO.getConditions().add(Restrict.eq("user.id", userId));
        UserDetail detail = super.findOne(detailDTO);
        if(null!=detail){
            UserDetailBO userDetailBO = BeanTransform.copyProperties(detail, UserDetailBO.class);
            Department department = detail.getDepartment();
            Group group = detail.getGroup();
            Position position = detail.getPosition();
            if (null != department) {
                userDetailBO.setDepartmentId(detail.getDepartment().getId());
                userDetailBO.setDepartmentName(detail.getDepartment().getName());
            }
            if (null != group) {
                userDetailBO.setGroupId(detail.getGroup().getId());
                userDetailBO.setGroupName(detail.getGroup().getName());
            }
            if (null != position) {
                userDetailBO.setPositionId(detail.getPosition().getId());
                userDetailBO.setPositionName(detail.getPosition().getName());
            }
            return  userDetailBO;
        }

        return null;
    }
}