package com.trainingassignment;
public abstract class Training {
	private int id;
	private String subject;
	private double fees;
	private static int studentId;
	
	public static void getStudentId() {
		studentId=100;
		
	}
	{
		studentId++;
	}
	public Training(String subject, double fees) {
		super();
		this.subject = subject;
		this.fees = fees;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public abstract double getOrderValue();
	 

}
