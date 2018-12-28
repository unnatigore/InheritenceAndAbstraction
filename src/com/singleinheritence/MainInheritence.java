package com.singleinheritence;
class MainInheritence extends SingleInheritence 
{  
		private double area;
		public double calculateArea()
		{
			
			return area = getLength()*getBreadth();
		} 
		
		public static void main(String args[]) 
		{  
			MainInheritence example = new MainInheritence();  
			example.rectangle(10, 5);
			System.out.println(example.getrectanglePerimeter()); 
			System.out.println(example.calculateArea());
			
			
		}
		
}  
