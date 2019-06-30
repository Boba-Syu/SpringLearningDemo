package com.boba.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by MI on 2019/6/30.
 */
public class User {
    private String id;
    private List<String> list;
    private Map<Integer, String> map;
    private Set<String> set;
    private int[] ints;

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

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public int[] getInts() {
        return ints;
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", ints=" + Arrays.toString(ints) +
                '}';
    }
}
