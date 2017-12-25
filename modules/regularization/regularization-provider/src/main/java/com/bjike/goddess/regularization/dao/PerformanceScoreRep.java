package com.bjike.goddess.regularization.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.regularization.dto.PerformanceScoreDTO;
import com.bjike.goddess.regularization.entity.PerformanceScore;

/**
 * 工作表现评分持久化接口, 继承基类可使用ｊｐａ命名查询
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-04-15 04:55 ]
 * @Description: [ 工作表现评分持久化接口, 继承基类可使用ｊｐａ命名查询 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface PerformanceScoreRep extends JpaRep<PerformanceScore, PerformanceScoreDTO> {

}