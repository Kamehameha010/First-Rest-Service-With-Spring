package com.rest.models;

import org.springframework.context.annotation.Configuration;

/* import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table; */



/* @Entity
@Table(name = "tb_user") */
@Configuration
public class User {


    /* @Column(name = "userId") */
    private int userId;


    /* @Column(name = "Name") */
    private String name;


    /* @Column(name = "LastName") */
    private String lastname;

    public User() {
    }

    public User(int userId) {
        this.userId = userId;
    }

    public User(int userId, String name, String lastname) {
        this(userId);
        this.name = name;
        this.lastname = lastname;

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return String.format("{id:%d, name:%s, lastname: %s}", userId, name, lastname);
    }

}
