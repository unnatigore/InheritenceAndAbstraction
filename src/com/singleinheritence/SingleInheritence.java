package com.singleinheritence;

public class SingleInheritence 
{  
		private double Length;
		private double Breadth;
		
		public void rectangle(double Length,double Breadth)
		{
			this.Length=Length;
			this.Breadth=Breadth;
			System.out.println("Length is " +this.Length);
			System.out.println("Breadth is "+this.Breadth);
		}

		public double getLength() {
			return Length;
		}

		public void setLength(double length) {
			Length = length;
		}

		public double getBreadth() {
			return Breadth;
		}

		public void setBreadth(double breadth) {
			Breadth = breadth;
		}
		
		public double getrectanglePerimeter() {
			return 2*(this.Length+this.Breadth);
		}
		
}  

