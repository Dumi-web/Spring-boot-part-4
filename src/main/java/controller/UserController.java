package controller;

import com.dumisani.spring.part1.User;
import com.dumisani.spring.part1.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/user/")
@RestController
public class UserController {
    @GetMapping("/")
    public String Home(){
        return "Welcome Home";
    }
    @Autowired
    UserServices userServices;
    
        @GetMapping("/list/commits")
    public ResponseEntity<String> getCommits() {
        RestTemplate template = new RestTemplate();
        String userResourceUrl = "https://api.github.com/repos/dumi-web/addLogs/commits";

        ResponseEntity<String> response = template.getForEntity(userResourceUrl, String.class);
        System.out.println("response " + response);
        return response;
    }

    @GetMapping("/list/repos")
        public ResponseEntity<String> getGit(){
            RestTemplate template = new RestTemplate();
            String userResourceUrl = "https://api.github.com/users/dumi-web/repos";

            ResponseEntity<String> response = template.getForEntity(userResourceUrl, String.class);
            System.out.println("response " + response);
            return response;
        }
    @PutMapping
    public void addUser(@RequestBody User user) {
        userServices.addUser(user.getId(),user.getName(),user.getSurname());
        //return new ResponseEntity<>("Success!", HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{Id}")
    public String getUser(@PathVariable(value = "Id") long Id){
        return userServices.getUser(Id);
    }

    @DeleteMapping
    public void removeUser(@PathVariable(value = "Id") long Id){
        userServices.removeUser(Id);
        //return new ResponseEntity<>("Success!", HttpStatus.OK);

    }





}
