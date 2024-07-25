package com.rgencer.makemoney.controller;

import com.rgencer.makemoney.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rgencer.makemoney.entity.User; // Bu satır User sınıfının bulunduğu pakete göre güncellenmelidir


import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;;

    @GetMapping("/names")
    public List<String> getUserNames() {

        return userService.getAllUsers()
                .stream()
                .map(User::getUserName)
                .toList();
    }
}
