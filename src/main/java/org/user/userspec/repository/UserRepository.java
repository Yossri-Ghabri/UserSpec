package org.user.userspec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.user.userspec.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
}
