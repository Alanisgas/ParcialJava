package com.example.parcial.model;

import jakarta.persistence.Entity;

@Entity
public class Person {

    @jakarta.persistence.Id
    private Long id;
    private char users;
    private Long version;
    private  Boolean enable;

    public Person(Long id, char users, Long version, Boolean enable) {
        this.id = id;
        this.users = users;
        this.version = version;
        this.enable = enable;
    }

    public Person() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public char getUsers() {
        return users;
    }

    public void setUsers(char users) {
        this.users = users;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}
