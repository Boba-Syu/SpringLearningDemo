package com.boba.entity;

import java.util.List;
import java.util.Map;

/**
 * Created by MI on 2019/6/30.
 */
public class User {
    private String id;
    private List<String> list;
    private Map<Integer, String> map;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }
}
