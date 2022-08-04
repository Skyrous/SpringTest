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
         Users Geo = new Users("Georgiana","Geo@Endava.com","Suceava","074312331");
         Users Alexandra = new Users("Alexandra","Alexandra@taratura.com","Iasington","0769696969");
         repository.saveAll(List.of(Claudiu,Geo,Alexandra));
     };

     }

 }

