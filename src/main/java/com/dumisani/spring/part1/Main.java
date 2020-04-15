package com.dumisani.spring.part1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        UserServicesImpl users = new UserServicesImpl();
        SpringApplication.run(Main.class, args);
        System.out.println(users.addUser(1,"Dumisani","Ngobeni"));
        System.out.println(users.getUser(1));
        System.out.println(users.removeUser(1));
    }
}
