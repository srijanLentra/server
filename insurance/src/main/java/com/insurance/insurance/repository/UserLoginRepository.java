package com.insurance.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.insurance.entity.UserLogin;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin,Long>{
    
}
