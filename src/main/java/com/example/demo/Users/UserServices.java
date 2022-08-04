package com.example.demo.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
public class UserServices {
    private final UsersRepository usersRepository;
    @Autowired
    public UserServices(UsersRepository usersRepository)
    {
        this.usersRepository = usersRepository;
    }
    @PostConstruct
    public List<Users> getUsers()
    {return usersRepository.findAll();}
}
