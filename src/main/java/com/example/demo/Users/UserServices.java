package com.example.demo.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

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

    public void addNewUser(Users user) {
        Optional<Users> userByEmail = usersRepository.findUserByEmail(user.getEmail());

        if(userByEmail.isPresent())
        {
            throw new IllegalStateException("Email already in use.");
        }
        usersRepository.save(user);
    }

    public void deleteStudent(Long id) {
        boolean flag = usersRepository.existsById((double)id);
        if(!flag)
        {
            throw new IllegalStateException("Student with id "+ id + " does not exist");
        }
        usersRepository.deleteById((double)id);
    }
}
