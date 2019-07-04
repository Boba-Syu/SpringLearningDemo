package com.boba.entity;

/**
 * Created by MI on 2019/7/4.
 */
public class User {
    private int id;
    private People people;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", people=" + people +
                '}';
    }
}
