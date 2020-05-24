package com.dumisani.spring.part1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
    
    @GetMapping("/listRepos")
    public ResponseEntity<String> getGit(){
    RestTemplate template = new RestTemplate();
    String userResourceUrl = "https://api.github.com/users/dumi-web/repos";

    ResponseEntity<String> response = template.getForEntity(userResourceUrl, String.class);
    System.out.println("response " + response);
    return response;
}
    @GetMapping("/list/commits")
    public ResponseEntity<String> getCommits() {
        RestTemplate template = new RestTemplate();
        String userResourceUrl = "https://api.github.com/repos/dumi-web/addLogs/commits";

        ResponseEntity<String> output = template.getForEntity(userResourceUrl, String.class);
        System.out.println("response " + output);
        return output;
    }
}
