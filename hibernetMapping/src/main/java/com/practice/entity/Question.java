package com.practice.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name="question_id")
	private int questionId;
	private String question;
	
	//@OneToOne
	//@JoinColumn(name="a_id")
	//private Answer answer;
	
	//one to meany
	@OneToMany(mappedBy="question")
	private List<Answer> answers;
	
	
	public int getQuestionId() {
		return questionId;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	//ont ot one constructor
	//public Question(int questionId, String question, Answer answer) {
	//	super();
	//	this.questionId = questionId;
	//	this.question = question;
		//this.answer = answer;
		
	//}
	
	
	
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	//one to meany constructor
	public Question(int questionId, String question, List<Answer> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	//one to one
	//public Answer getAnswer() {
	//	return answer;
	//}
	//public void setAnswer(Answer answer) {
	//	this.answer = answer;
	//}
	//ont ot meany
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
}
