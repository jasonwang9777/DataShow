package com.datashow.usermanager.repository;

import java.math.BigInteger;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datashow.base.repository.IBaseRepository;
import com.datashow.usermanager.po.UserPO;

@Repository
@Scope(scopeName = "prototype")
public interface UserRepository extends IBaseRepository<UserPO>, JpaRepository<UserPO, BigInteger> {
}
