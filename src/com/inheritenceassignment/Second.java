package com.inheritenceassignment;
public class Second 
{
	private double Length;
	private double Breadth;
	private double Height;
	public Second(double Length,double Breadth,double Height) 
	{
		this.Length=Length;
		this.Breadth=Breadth;
		this.Height=Height;
	}
	public double getLength() 
	{
	    return this.Length;
	}
	public void setLength(double Length) 
	{
	    this.Length = Length;
	}
	public double getBreadth() 
	{
		return this.Breadth;
	}
	public void setbreadth(double Breadth) 
	{
		this.Breadth = Breadth;
	}
	public double getHeight() 
	{
		return this.Length;
	}
	public void setHeight(double Height) 
	{
		this.Height = Height;
	}
	public double getVolumeRectangle() 
	{
	    return this.Length*this.Breadth*this.Height;   
	   
	}
	public double getAreaRectangle() 
	{
		   return this.Length*this.Breadth;
		   
		   
	}

}

