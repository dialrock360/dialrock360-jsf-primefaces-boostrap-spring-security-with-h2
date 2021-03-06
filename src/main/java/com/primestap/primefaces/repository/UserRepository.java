package com.primestap.primefaces.repository;

import com.primestap.primefaces.model.ConfirmationToken;
import com.primestap.primefaces.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public User findByUsername(String username);
   /* Optional<User> findByEmail(String email);
    @Query("SELECT u FROM User u WHERE u.username = ?1 and u.password = ?2")
    Optional<User> findbyUser(String token);

    void findbyUser(User user);*/
}
