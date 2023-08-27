package org.interfacetest1;

abstract class Shape1{
	abstract void area();
	
}
class Shape extends Shape1{

	@Override
	void area() {
		double pi=3.14;
		int r=1;
		double area= pi*r*r;
		System.out.println("calculate Area:"+ area);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Shape cr=new Shape();
      
      cr.area();
	}

}
