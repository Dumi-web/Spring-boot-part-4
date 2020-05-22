package com.dumisani.spring.part1;

public interface UserServices {
    String addUser(long Id,String name, String surname);
    String getUser(long Id);
    String removeUser(long Id);
    String getGit();


}
