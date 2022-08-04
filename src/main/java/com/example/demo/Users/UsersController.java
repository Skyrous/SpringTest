package com.example.demo.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users")
public class UsersController {
    private final UserServices userServices;
    @Autowired
    public UsersController(UserServices userServices)
    {
        this.userServices = userServices;
    }
    @GetMapping
    @PostConstruct
    public List<Users> getUsers()
    { return userServices.getUsers();
        }

}
