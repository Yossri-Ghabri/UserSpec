package org.user.userspec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.user.userspec.entity.Users;
import org.user.userspec.repository.UserRepository;

import java.time.LocalDate;
import java.util.stream.Stream;

@SpringBootApplication
public class UserSpecApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserSpecApplication.class, args);
    }
@Bean
    CommandLineRunner adduser(UserRepository userRepository ){
        return args ->{
            Stream.of("Jhon").forEach(newUser->{
                Users users = new Users();
                users.setName(newUser);
                users.setGender("Homme");
                users.setPhoneNumber("2333323323");
                users.setCountryOfResidence("France");
                LocalDate birthdate = LocalDate.of(1990, 5, 15);
                users.setBirthdate(birthdate);
                userRepository.save(users);
            });
        };

}

}
