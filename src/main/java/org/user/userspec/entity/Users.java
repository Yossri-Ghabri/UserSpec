package org.user.userspec.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data @NoArgsConstructor @AllArgsConstructor @Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private LocalDate birthdate;
    private String countryOfResidence;
    private String phoneNumber;
    private String gender;


    public Users(String johnDoe, LocalDate birthdate) {
    }
}
