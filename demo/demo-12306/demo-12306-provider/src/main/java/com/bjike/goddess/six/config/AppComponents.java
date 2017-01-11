package com.bjike.goddess.six.config;

import com.bjike.goddess.dbs.jpa.boot.initializer.Components;
import com.bjike.goddess.dbs.jpa.boot.initializer.EntityToScan;
import org.springframework.stereotype.Component;

/**
 * @Author: [liguiqin]
 * @Date: [2016-11-23 15:47]
 * @Description: [entity扫描类]
 * @Version: [1.0.0]
 * @Copy: [org.ndshop]
 */
@Component
public class AppComponents extends Components implements EntityToScan<AppRoot>{

    @Override
    public String[] entityScan() {
        return new String[]{"com.bjike.goddess.six.entity"};
    }
}