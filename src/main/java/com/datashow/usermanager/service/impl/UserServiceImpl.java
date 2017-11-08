/**
 * 
 */
package com.datashow.usermanager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.datashow.usermanager.po.UserPO;
import com.datashow.usermanager.repository.UserRepository;
import com.datashow.usermanager.service.UserService;

/**
 * @author Jason
 *
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.datashow.usermanager.service.IUserService#loginByUserNameAndPassword()
	 */
	@Override
	public boolean loginByUserNameAndPassword(String email, String password) {
		UserPO userPO = userRepository.findByUserEmailAndUserPassword(email, password);
		if (null != userPO) {
			// TODO: login cookies;
			return true;
		} else {
			return false;
		}
	}

}
