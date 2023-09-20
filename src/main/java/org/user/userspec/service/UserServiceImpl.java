package org.user.userspec.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.user.userspec.entity.Users;
import org.user.userspec.exceptions.EntityNotFoundException;
import org.user.userspec.repository.UserRepository;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public Users saveUser(Users user) {
        if (!isFrench(user)) {
            throw new IllegalArgumentException("Is Not Resident French");
        }
        return userRepository.save(user);
    }


    @Override
    public Users getUserById(Long userId) throws EntityNotFoundException {
        return userRepository.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("User Not Found " + userId));
    }


    private boolean isFrench(Users user) {
        return "France".equalsIgnoreCase(user.getCountryOfResidence());
    }
}
