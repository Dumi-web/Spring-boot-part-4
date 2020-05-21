package com.dumisani.spring.part1;


public class User  {
    private long Id;
    private String name;
    private String surname;

    public User(long userId,String userName,String userSurname){
        super();
        this.Id  = userId;
        this.name = userName;
        this.surname = userSurname;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
