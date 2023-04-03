package com.ravi.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ravi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
public User findByUserNameAndPassword(String userName, String password);
}