package com.bjike.goddess.task.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

import java.util.List;

/**
 * @Author: [chenjunhao]
 * @Date: [2018-01-05 16:24]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class DataBO extends BaseBO {
    /**
     * 表头
     */
    private List<String> tableHeader;

    /**
     * 数据列
     */
    private List<String> dataColumn;

    public List<String> getTableHeader() {
        return tableHeader;
    }

    public void setTableHeader(List<String> tableHeader) {
        this.tableHeader = tableHeader;
    }

    public List<String> getDataColumn() {
        return dataColumn;
    }

    public void setDataColumn(List<String> dataColumn) {
        this.dataColumn = dataColumn;
    }
}
