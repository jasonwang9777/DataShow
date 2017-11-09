/**
 * 
 */
package com.datashow.usermanager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

	public Page<UserPO> findAllFromPage(Pageable page) {
		return userRepository.findAll(page);
	}

}
