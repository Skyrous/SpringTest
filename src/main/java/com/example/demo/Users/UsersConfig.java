package com.example.demo.Users;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UsersConfig {
    @Bean
    CommandLineRunner commandLineRunner(UsersRepository repository)
 {
     return args -> {
        Users Claudiu = new Users("Claudiu","Clauiu@Endava.com","Suceava","07400000");
         repository.saveAll(List.of(Claudiu));
     };

     }

 }

