package com.battle.core.common.vo;

import java.util.List;

public class AEntityColumns {
    private String entity;
    private List<String> Columns;

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public List<String> getColumns() {
        return Columns;
    }

    public void setColumns(List<String> columns) {
        Columns = columns;
    }
}
