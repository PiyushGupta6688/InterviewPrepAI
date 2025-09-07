package com.prepInterview.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prepInterview.Repo.UserRepo;
import com.prepInterview.entity.UserAccount;
import com.prepInterview.entity.UserAccountDao;
@Service
public class UserService {
   @Autowired
   UserRepo userRepo;
	
	public boolean save(UserAccount userAccount) {
        if(userRepo.findById(userAccount.getEmail()).orElse(null)==null) {
        	//userAccount.setPassword(b.encode(userAccount.getPassword()));
        	userRepo.save(userAccount);
			return true;
        }else {
        	return false;
        }
	}

	public String getName(String email) {
		UserAccount u=userRepo.findById(email).orElse(null);
		if(u==null) {
			return null;
		}else{
			return u.getName();
		
	}

	}
}