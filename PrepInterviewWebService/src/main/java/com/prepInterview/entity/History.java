package com.prepInterview.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class History {
  
	@Id
	private String email ;
	private String topic;
	private String score;
    private String totalQuestions;
    
}
