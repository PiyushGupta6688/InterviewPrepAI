package com.prepInterview.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserAccount {
	@Id
	private String email;
	private String password;
	private String name;
	private String phone;
    private boolean enable=true;
}
