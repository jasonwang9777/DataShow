package com.datashow.usermanager.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datashow.usermanager.po.UserPO;

@Repository
@Scope(scopeName = "prototype")
public interface UserRepository extends JpaRepository<UserPO, Integer> {
	public UserPO findByUserEmailAndUserPassword(String userEmail, String userPassword);
}
