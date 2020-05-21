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
