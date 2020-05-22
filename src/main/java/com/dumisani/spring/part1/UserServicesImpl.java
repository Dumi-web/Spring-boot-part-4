package com.dumisani.spring.part1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    public RestTemplate template;
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
@Override
public  String getGit(){
    RestTemplate template = new RestTemplate();
    String userResourceUrl = "https://api.github.com";

    ResponseEntity<String> response = template.getForEntity(userResourceUrl + "/orgs/octokit/repos", String.class);
    System.out.println("response " + response.toString());
    return response.toString();
}
}
