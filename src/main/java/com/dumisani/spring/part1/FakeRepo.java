package com.dumisani.spring.part1;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeRepo implements FakeRepoInterFace {

    static List<User> newUser = new ArrayList<>();

    @Override
    public String insertUser(long Id, String name, String surname) {
        User users = new User(1,name,surname);
        newUser.add(users);
        return "Name: "+name;
        }

    @Override
    public String findUserById(long Id) {
        for (User users : newUser) {
            long userId = users.getId();
            if (userId == Id) {
               return "Hello " + users.getName() +" "+ users.getSurname();
            }
        }
        return null;
    }

    @Override
    public String deleteUser(long Id) {
        for (User users: newUser) {
            long userId = users.getId();
            if(userId == Id){
                newUser.remove(users);
                return users.getName() + " Removed";
            }
        }
        return null;
    }

}
