package com.example.demo.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping(path = "/listofusers")
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
        @PostMapping
    public void registerUser(@RequestBody Users user)
    {
        userServices.addNewUser(user);
    }
    @DeleteMapping(path = "usersId")
    public void deleteUser(@PathVariable("usersId") Long id )
    {
        userServices.deleteStudent(id);
    }
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());

        return "signup_form";
    }

}
