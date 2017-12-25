package com.bjike.goddess.royalty.service;

import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.royalty.dto.JobsBetBDTO;
import com.bjike.goddess.royalty.dto.JobsBetEDTO;
import com.bjike.goddess.royalty.entity.JobsBetB;
import com.bjike.goddess.royalty.entity.JobsBetE;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

/**
 * 岗位间对赌表E业务实现
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-07-12 04:33 ]
 * @Description: [ 岗位间对赌表E业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "royaltySerCache")
@Service
public class JobsBetESerImpl extends ServiceImpl<JobsBetE, JobsBetEDTO> implements JobsBetESer {

}