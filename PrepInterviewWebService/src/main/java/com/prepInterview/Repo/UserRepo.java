package com.prepInterview.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prepInterview.entity.UserAccount;

@Repository
public interface UserRepo extends JpaRepository<UserAccount, String> {
      
}
