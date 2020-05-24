package com.dumisani.spring.part1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
    public class UserTest {
        @LocalServerPort
        private int port;
        @Autowired
        public TestRestTemplate template;
        @Autowired
        public UserServices userServices;

        private URL base;

        @BeforeEach
        public void urlLink()throws Exception{
            System.out.println(port);
            this.base =  new URL("http://localhost:" + port);
        }
        @Test
    public void getGit(){
            ResponseEntity<String> test = userServices.getGit();
            System.out.println(test);
        }
        @Test
    public void getCommits(){
            ResponseEntity<String> name1 = userServices.getCommits();
            System.out.println(name1);
        }

}
