package com.krishkantrai27.farmxchain.repository;

import com.krishkantrai27.farmxchain.entity.User;
import com.krishkantrai27.farmxchain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    List<User> findByRole(Role role);
    boolean existsByEmail(String email);
    List<User> findAll();
}
