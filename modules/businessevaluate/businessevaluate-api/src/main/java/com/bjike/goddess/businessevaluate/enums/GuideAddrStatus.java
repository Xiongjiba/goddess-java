package com.bjike.goddess.businessevaluate.enums;

/**
 * 导航栏类型
 *
 * @Author: [tanghaixiang]
 * @Date: [2017-03-20 19:57]
 * @Description: [导航栏类型]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public enum GuideAddrStatus {

    /**
     * 列表
     */
    LIST(0),
    /**
     * 添加
     */
    ADD(1),
    /**
     * 编辑
     */
    EDIT(2),
    /**
     * 组织结构
     */
    ORGANIZE(3),
    /**
     * 删除
     */
    DELETE(4),
    /**
     * 冻结
     */
    CONGEL(5),
    /**
     * 解冻
     */
    THAW(6),
    /**
     * 汇总
     */
    COLLECT(7),
    /**
     * 上传附件
     */
    UPLOAD(8),
    /**
     * 下载附件
     */
    DOWNLOAD(9),
    /**
     * 导入
     */
    IMPORT(10),
    /**
     * 导出
     */
    EXPORT(11),
    /**
     * 查看
     */
    SEE(12),
    /**
     * 查看附件
     */
    SEEFILE(13),
    /**
     * 定性指标
     */
    QUALITATIVE(14),
    /**
     * 定量指标
     */
    QUANTIFY(15);

    private int code;

    GuideAddrStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

}