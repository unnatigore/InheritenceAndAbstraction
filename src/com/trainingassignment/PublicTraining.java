package com.trainingassignment;

public class PublicTraining extends Training {
	private int participants;

	public PublicTraining(String subject, double fees, double participants) {
		super(subject, fees);
		this.participants = (int) participants;
	}
	

	public int getParticipants() {
		return participants;
	}


	public void setParticipants(int participants) {
		this.participants = (int) participants;
	}


	@Override
	public double getOrderValue() {
		return super.getFees()*this.participants;
		
	}
	
	

}
