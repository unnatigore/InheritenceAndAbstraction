package com.inheritenceandabstraction.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.trainingassignment.CorporateTraining;
import com.trainingassignment.PublicTraining;
import com.trainingassignment.Training;

public class TrainingTest {
	
	public Training publictraining,corporatetraining;
	
	@Before
	public void setup() {
		
		publictraining = new PublicTraining ("Java",5000.0,50);
		corporatetraining = new CorporateTraining("BigData",35000.0,4);
	}
	
	
	@Test
	public void publicTrainingtest() {
		double actual=publictraining.getOrderValue();
		assertEquals(250000.0, actual,0.0);
	
		
	}
	
	@Test
	public void corporateTrainingtest() {
		double actual=corporatetraining.getOrderValue();
		assertEquals(140000.0, actual,0.0);
	
		
	}

}
