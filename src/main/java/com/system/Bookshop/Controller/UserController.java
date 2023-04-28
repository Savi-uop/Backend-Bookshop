package com.system.Bookshop.Controller;


import com.system.Bookshop.Entity.Product;
import com.system.Bookshop.Entity.User;
import com.system.Bookshop.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "api/v1/users")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public String saveUsers(@RequestBody User user){
       userService.saveUser(user);
        return "new user is added" ;
    }

    @GetMapping("/getUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id){
        try{
            User user = userService.getUserById(id);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }catch(NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("update/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable Integer id){
        try{
            User existingUser = userService.getUserById(id);
            userService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return  new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleting/{id}")
    public String deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return "Deleted user with ID :" + id + " successfully!";
    }


}
