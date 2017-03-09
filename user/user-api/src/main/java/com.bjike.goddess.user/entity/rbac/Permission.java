package com.bjike.goddess.user.entity.rbac;


import com.bjike.goddess.common.api.entity.BaseEntity;
import com.bjike.goddess.common.api.type.Status;

import javax.persistence.*;

/**
 * 资源认证
 *
 * @Author: [liguiqin]
 * @Date: [2016-11-23 15:47]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@Entity
@Table(name = "rbac_permission")
public class Permission extends BaseEntity {
    /**
     * 认证名
     */
    @Column(unique = true, columnDefinition = "VARCHAR(255) COMMENT '认证名' ")
    private String name;

    /**
     * 描述
     */
    @Column(columnDefinition = "VARCHAR(255) COMMENT '资源描述' ")
    private String description;
    /**
     * 请求资源
     */
    @Column(columnDefinition = "VARCHAR(255) COMMENT '请求资源' ")
    private String resource;
    /**
     * 状态
     */
    @Column(columnDefinition = "TINYINT(1) DEFAULT 0 COMMENT '资源状态'", nullable = false, insertable = false)
    private Status status;

    /**
     * 父节点
     */
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id", columnDefinition = "VARCHAR(36) COMMENT '资源上级' ")
    private Permission parent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Permission getParent() {
        return parent;
    }

    public void setParent(Permission parent) {
        this.parent = parent;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
