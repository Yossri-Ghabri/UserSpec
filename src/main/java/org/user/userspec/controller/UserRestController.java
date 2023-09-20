package org.user.userspec.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.user.userspec.entity.Users;
import org.user.userspec.exceptions.EntityNotFoundException;
import org.user.userspec.service.UserService;


@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserRestController {
    private UserService userService;

    @PostMapping("/saveUser")
    public Users saveUser(@RequestBody Users users){
        return  userService.saveUser(users);
    }

    @GetMapping("/getUser/{id}")
    public Users getUser(@PathVariable  Long id) throws EntityNotFoundException {
        return userService.getUserById(id);
    }




}
