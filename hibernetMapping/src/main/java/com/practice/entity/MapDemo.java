package com.practice.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		/*
		//sesson factory
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//creating a question
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("what is java");
		//creating answer
		Answer answer = new Answer();
		answer.setAnswerId(343);
		answer.setAnswer("java is a programing language");
		answer.setQuestion(q1);
		q1.setAnswer(answer);
		//creating second question
		Question q2 = new Question();
		q2.setQuestionId(242);
		q2.setQuestion("what is python");
		//creating answer
		Answer answer1 = new Answer();
		answer1.setAnswerId(344);
		answer1.setAnswer("python is a programing language");
		answer1.setQuestion(q2);
		q2.setAnswer(answer1);
		
		
		//session
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		//save
		s.save(q1);
		s.save(q2);
		s.save(answer);
		s.save(answer1);
		tx.commit();
		//fetching
		Question newQ=(Question)s.get(Question.class, 1212);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
		
		
		s.clear();
		factory.close(); */
		
		//one to meany
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//creating a question
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("what is java");
		//creating answer
		Answer answer = new Answer();
		answer.setAnswerId(343);
		answer.setAnswer("java is a programing language");
		answer.setQuestion(q1);
		//creating one more answer
		Answer answer1 = new Answer();
		answer1.setAnswerId(344);
		answer1.setAnswer("java is a object oriented programming language");
		answer1.setQuestion(q1);
		//creating one more answer
		Answer answer2 = new Answer();
		answer2.setAnswerId(345);
		answer2.setAnswer("java is easy to learn");
		answer2.setQuestion(q1);
		
		List<Answer> list = new ArrayList<>();
		list.add(answer);
		list.add(answer1);
		list.add(answer2);
		//seting  one question with meany answer
		q1.setAnswers(list);
		//session
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		//save
		s.save(q1);
		s.save(answer);
		s.save(answer1);
		s.save(answer2);
		tx.commit();
		//fetching
		Question newQ=(Question)s.get(Question.class, 1212);
		System.out.println(newQ.getQuestion());
		
		for(Answer a: newQ.getAnswers()) {
			System.out.println(a.getAnswer());
		}
		
		
		
	}
}
