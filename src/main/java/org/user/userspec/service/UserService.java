package org.user.userspec.service;

import org.user.userspec.entity.Users;
import org.user.userspec.exceptions.EntityNotFoundException;

public interface UserService {

    Users saveUser(Users user);
    Users getUserById(Long userId) throws EntityNotFoundException;

}
