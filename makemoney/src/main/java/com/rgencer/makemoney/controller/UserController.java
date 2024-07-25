package com.rgencer.makemoney.controller;

import com.rgencer.makemoney.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rgencer.makemoney.entity.User; // Bu satır User sınıfının bulunduğu pakete göre güncellenmelidir


import java.util.List;

@RestController
@RequestMapping("/api/users")
@Api(value="User Rest Service")
public class UserController {

    @Autowired
    private UserService userService;;


    @GetMapping("/{userId}")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        if (users != null) {
            return new ResponseEntity<>(users, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}
