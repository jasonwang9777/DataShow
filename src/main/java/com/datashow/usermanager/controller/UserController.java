package com.datashow.usermanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.datashow.usermanager.po.UserPO;
import com.datashow.usermanager.service.UserService;

@Controller
@RequestMapping(value = "/users")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/page={page}&size={size}", method = RequestMethod.GET)
	public Page<UserPO> get(@PathVariable int page, @PathVariable int size) {
		Pageable pageable = new PageRequest(page, size);
		return userService.findAllFromPage(pageable);
	}
}
