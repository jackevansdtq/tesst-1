class Circle{
	//protected instance variable, only accessible from sub-class
	protected double radius;
	protected String color;
	
	//1st constructor, set both radius and color to default
	public Circle(){
		radius = 1.0;
		color = "red";
	}
	
	//2nd constructor with given radius, but color default
	public Circle(double newR){
		radius = newR;
		color = "red";
	}
	
	//public method for retrieving the radius (getter)
	public double getRadius(){
		return radius;
	}
	
	//public method for computing the area of circle
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	//public method for computing the perimeter of circle;
	public double getPerimeter(){
		return 2*radius*Math.PI;
	}
	
	//public method for printing information of circle
	@Override
	public String toString(){
		String s = "The circle has radius of "+getRadius()+" and area of " +getArea();
		return s;
	}
}

class Cylinder extends Circle{
	private double height;
	
	//Constructor with default cotor, radius and height
	public Cylinder(){
		super();
		height = 1.0;
	}
	
	//Constructor with default radius, color but given height
	public Cylinder(double newH){
		super(); //call superclass no-arg constructor Circle()
		this.height = newH;
	}
	
	//Constructor with default color, but given radius and height
	public Cylinder(double newR, double newH){
		super(newR);//call superclass constructor Circle(newR)
		this.height = newH;
	}
	
	//A public method for retrieving the height
	public double getHeight(){
		return height;
	}
	
	//A public method for computing the volume of cylinder
	//use superclass method getArea() to get the base area
	public double getVolume(){
		return super.getArea()*height;//getArea()*height;
	}
	
	//Override toString()
	@Override
	public String toString(){
		String s = "The cylind has base radius of "+getRadius()+", height of " +getHeight()+ ", base area of " +super.getArea()+ ", surface area of " +(2*super.getArea()+super.getPerimeter()*height)+" and volume of " +getVolume() ;
		return s;
	}
}

public class BaiThucHanh01{
	public static void main (String[] args) {
		//Declare and allocate a new instance of cylinder 
		// with default color, radius, and height
		Cylinder cl1 = new Cylinder();
		System.out.println(cl1.toString());
		
		Cylinder cl2 = new Cylinder(10.0);
		System.out.println(cl2.toString());
		
		Cylinder cl3 = new Cylinder(2.0,10.0);
		System.out.print(cl3.toString());
	}
}