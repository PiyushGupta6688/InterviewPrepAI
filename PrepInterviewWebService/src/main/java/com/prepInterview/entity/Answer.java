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
public class Answer {
  
	@Id
	private String quesId;
	private String email ;
	private String answerText;
    private String score;
    private String feedback;
}
