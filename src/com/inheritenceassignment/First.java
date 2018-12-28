package com.inheritenceassignment;

public class First 
{
	private double radius;
	public First(double radius) 
	{
		this.radius = radius;
	     
	}
	public double getRadius() 
	{
		return this.radius;
    }
  
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}

	public double getAreaCircle() 
	{
		return this.radius * this.radius * Math.PI;
	}
	public double getPerimeterCircle() 
	{
	   return 2*Math.PI*this.radius;
	   
	}
}
   

