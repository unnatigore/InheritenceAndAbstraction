package com.inheritenceassignment;

public class Two {
	
	public static void main(String[] args) {
	
	
	First first1 = new First(5);
	First first2 = new First(10);
	
	
	Second second1 = new Second(3,4,5);
	Second second2 = new Second(7,8,9);
	
	
	System.out.println(first1.getAreaCircle());
	System.out.println(first1.getPerimeterCircle());
	System.out.println(first2.getAreaCircle());
	System.out.println(first2.getPerimeterCircle());
	System.out.println(second1.getAreaRectangle());
	System.out.println(second2.getAreaRectangle());
	System.out.println(second1.getVolumeRectangle());
	System.out.println(second2.getVolumeRectangle());
	
	}
}
