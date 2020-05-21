package com.dumisani.spring.part1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    static FakeRepo fakeRepo;
    @Override
    public String addUser(long Id , String name, String surname) {
        fakeRepo = new FakeRepo();
        return fakeRepo.insertUser(1,name,surname);
    }
    @Override
    public String getUser(long Id) {
        fakeRepo = new FakeRepo();
        return fakeRepo.findUserById(1);
    }

    @Override
    public String removeUser(long Id) {
        fakeRepo = new FakeRepo();
        return fakeRepo.deleteUser(1);
    }


}
