package com.prepInterview.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prepInterview.Service.UserService;
import com.prepInterview.entity.UserAccount;
import com.prepInterview.entity.UserAccountDao;

import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;
public class UserController {
   
	@Autowired
	UserService userServcie;
	
	@PostMapping("/register")
	public UserAccount register(@ModelAttribute UserAccount userAccount, Model model) {
		if(userServcie.save(userAccount)) {
		 return userAccount;
		}else {
          return null;
		}
	}
	
	
	@RequestMapping("/login")
	 public String login(@ModelAttribute UserAccount userAccount, HttpSession session) {
		return userServcie.getName(userAccount.getEmail());
	}
	
	
}
