package org.interfacetest1;


 interface drawable {

	void draw();
	void area();
	void volume();
}

class Circle1 implements drawable{

	@Override
	public void draw() {
		System.out.println("This is circle");
	}
	
 
  @Override
	public void area() {
		int y = 2;
		int r = y;
		double pi=3.14;
		double area =(pi*r*r);
		
		
		System.out.println("Area of circle:"+area);
	}
  @Override

   public void volume() {
					    
		double pi=3.14;
		int h = 2;
		int r = 1;
		double volume=(pi*r*r*h);
		System.out.println("Volume of circle:"+volume);
	}
  
  static class Rectangle implements drawable{
	  
	  public void draw() {
		  System.out.println("This is rectangle");
	  }

	@Override
	public void area() {
		// TODO Auto-generated method stub
		int l = 2;
		int b = 5;
		int area=l*b;
		
		System.out.println("area of rectangle:"+area);
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		int l=4;
		int b=3;
		int h=4;
		int volume=l*b*h;
		
		System.out.println("volume of rectangle:"+volume);
		
		}
	
	static class square implements drawable{

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("This is square");
		}

		@Override
		public void area() {
			// TODO Auto-generated method stub
			int a=3;
			int area=a*a;
			System.out.println("area of square:"+area);
				
		}

		@Override
		public void volume() {
			// TODO Auto-generated method stub
			int a=2;
			int volume=a*a*a;
			System.out.println("volume of square:"+volume);
		}
		
	
	}
		
		public static void main(String[] args) {
			
			Circle1 c= new Circle1();
			c.draw();
			c.area();
			c.volume();
			Rectangle r= new Rectangle();
			r.draw();
			r.area();
			r.volume();
			square s=new square();
			s.draw();
			s.area();
			s.volume();
			
		
		}
  }
}
	




		

