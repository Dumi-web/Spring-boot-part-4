package com.dumisani.spring.part1;

import org.springframework.http.ResponseEntity;

public interface UserServices {
    String addUser(long Id,String name, String surname);
    String getUser(long Id);
    String removeUser(long Id);
    ResponseEntity<String> getGit();
    ResponseEntity<String> getCommits();


}
