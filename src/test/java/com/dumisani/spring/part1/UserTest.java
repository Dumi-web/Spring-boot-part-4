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
        String newName = user.addUser(1,"Dumisani","Ngobeni");
        assertThat(newName).isEqualTo("Dumisani Entered");
    }
    @Test
    public void getUser(){
        String name = user.getUser(1);
        assertThat(name).isEqualTo("Hello Dumisani Ngobeni");
    }
    @Test
    public void removeUser(){
        String Nam = user.removeUser(1);
        assertThat(Nam).isEqualTo("Dumisani Removed");
    }

}
