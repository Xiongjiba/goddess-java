package com.bjike.goddess.user.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.user.bo.UserBO;
import com.bjike.goddess.user.entity.User;
import com.bjike.goddess.user.session.authcode.AuthCode;
import com.bjike.goddess.user.session.authcode.AuthCodeSession;
import com.bjike.goddess.user.session.phonecode.PhoneCode;
import com.bjike.goddess.user.session.phonecode.PhoneCodeSession;
import com.bjike.goddess.user.bo.UserSimpleBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户找回密码业务实现
 *
 * @Author: [liguiqin]
 * @Date: [2016-11-30 15:47]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@Service
public class UserFindPwdSerImpl implements UserFindPwdSer {
    @Autowired
    private UserSer userSer;


    @Override
    public UserSimpleBO verifyAccount(String account, String authCode) throws SerException {
        UserBO userBO = userSer.findByAccountNumber(account);
        if (null == userBO) {
            throw new SerException("用户不存在");
        }
        AuthCode auth = AuthCodeSession.get(account);
        if (null == auth && !auth.getCode().equalsIgnoreCase(authCode)) {
            throw new SerException("验证码不正确");
        }
        UserSimpleBO simpleBO = new UserSimpleBO();
        simpleBO.setNickname(userBO.getNickname());
        String phone = userBO.getPhone();
        phone = phone.substring(0, 3) + "*****" + phone.substring(8, phone.length());
        simpleBO.setPhone(phone);
        return simpleBO;
    }

    @Override
    public Boolean sendCodeByNickname(String nickname) throws SerException {
        User user = null;
        UserBO bo = userSer.findByNickname(nickname);
        if (null != user) {
            PhoneCode phoneCode = new PhoneCode();
            phoneCode.setCode("123456");
            PhoneCodeSession.put(user.getPhone(), phoneCode);
            return true;
        } else {
            throw new SerException();
        }
    }

    @Override
    public Boolean verifyPhoneCode(String nickname, String phoneCode) throws SerException {
        User user = null;
        UserBO bo = userSer.findByNickname(nickname);
        if (null != user) {
            PhoneCode code = PhoneCodeSession.get(user.getPhone());
            if (null == code && !phoneCode.equalsIgnoreCase(code.getCode())) {
                throw new SerException("手机校验码错误");
            }
            return true;
        } else {
            throw new SerException("手机校验码错误");
        }
    }
}