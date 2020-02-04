package com.yash.pta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Table(name="exam_criteria")
@Component
public class ExamCriteria {
	
	/**
	 * This is Criteria Id
	 * @Id represents auto-generated primary key
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	
	@NotBlank(message = "Minimu 1 Question!")
	@Size(min = 1, max = 100, message = "Question should be between 1 - 100")
	private Integer numberOfQuestion;

	@NotBlank(message ="Minimum time should be 1 minute")
	@Size(min = 1, max = 100, message = "Time should be in range 1 to 100 minute")
	private Integer timeMin;
	
	@NotBlank(message ="Passing criteria should not be blank")
	@Size(min = 35, max = 70, message = "Passing criteria should be in range 35% - 70%")
	private Integer passingCriteria;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getNumberOfQuestion() {
		return numberOfQuestion;
	}

	public void setNumberOfQuestion(Integer numberOfQuestion) {
		this.numberOfQuestion = numberOfQuestion;
	}

	public Integer getTimeMin() {
		return timeMin;
	}

	public void setTimeMin(Integer timeMin) {
		this.timeMin = timeMin;
	}

	public Integer getPassingCriteria() {
		return passingCriteria;
	}

	public void setPassingCriteria(Integer passingCriteria) {
		this.passingCriteria = passingCriteria;
	}

	@Override
	public String toString() {
		return "ExamCriteria [userId=" + userId + ", numberOfQuestion=" + numberOfQuestion + ", timeMin=" + timeMin
				+ ", passingCriteria=" + passingCriteria + "]";
	}
	
}
