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
public class Question {
  
	@Id
	private String quesId;
	private String difficulty ;
	private String topic;
    private String questionText;
}
