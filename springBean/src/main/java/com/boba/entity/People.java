package com.boba.entity;

/**
 * Created by MI on 2019/6/29.
 */
public class People {
    private int id;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", user=" + user +
                '}';
    }
}
