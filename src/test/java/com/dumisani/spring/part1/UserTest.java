package com.dumisani.spring.part1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class UserTest {
    @Autowired
    public UserServicesImpl user;
    @Test
    public void addUser(){
        assertEquals("Dumisani Entered",user.addUser(1,"Dumisani","Ngobeni"));
    }
    @Test
    public void getUser(){
        assertEquals("Hello Dumisani Ngobeni",user.getUser(1));
    }
    @Test
    public void removeUser(){
        assertEquals("Dumisani Removed",user.removeUser(1));
    }

}
