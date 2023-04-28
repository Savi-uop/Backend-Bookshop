package com.system.Bookshop.Controller;

import com.system.Bookshop.DTO.LoginDto;
import com.system.Bookshop.DTO.NewUserDto;
import com.system.Bookshop.Response.LoginResponse;
import com.system.Bookshop.Service.NewUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/newuser")


public class NewUserController {

    @Autowired
    private NewUserService newUserService;


    @PostMapping(path = "/save")
    public String saveNewUser( @RequestBody NewUserDto newUserDto){
        String id = newUserService.addNewUser(newUserDto);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginNewUser(@RequestBody LoginDto loginDto){
       LoginResponse loginResponse = newUserService.loginNewUser(loginDto);
        return ResponseEntity.ok(loginResponse);
    }


}
