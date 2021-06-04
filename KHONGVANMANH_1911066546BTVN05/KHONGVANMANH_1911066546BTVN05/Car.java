/**
 * @(#)Car.java
 *
 *
 * @author 
 * @version 1.00 2021/4/16
 */


abstract class Car {
	protected  int speed;
	protected  double regularPrice;
	protected  String color;
	abstract double getSalePrice();
    public Car() {
    }
    public Car(int s, double r, String c){
    	speed = s;
    	regularPrice = r;
    	color = c;
    }
    abstract double getPrice();
    
}
class Truck extends Car{
	private int weight;
	public double getSalePrice(){
		if(weight>2000)
			return 10;
		else
			return 20;
	}
	public Truck(int s, double r, String c,int w){
		super(s,r,c);
		weight = w;
	}
	public double getPrice(){
    	return super.regularPrice - super.regularPrice * getSalePrice() /100;
    }
}
class Ford extends Car{
	private int Year;
	private int manufacturerDiscount;
	public double getSalePrice(){
		return super.regularPrice - manufacturerDiscount;
	}
	public Ford(int s, double r, String c,int y, int m){
		super(s,r,c);
		Year = y;
		manufacturerDiscount = m;
	}
	public double getPrice(){
    	return getSalePrice();
    }
}
class Sedan extends Car{
	private int lenght;
	public double getSalePrice(){
		if(lenght>20)
			return 5;
		else
			return 10;
	}
	public Sedan(int s, double r, String c,int l){
		super(s,r,c);
		lenght = l;
	}
	public double getPrice(){
    	return super.regularPrice - (super.regularPrice * getSalePrice() / 100);
    }
}
class ThucHien{
	public static void main (String[] args) {
		Car sedan1 = new Sedan(100,1000,"red",10);
		Car ford1 = new Ford(90,1000,"blue",50,111);
		Car truck1 = new Truck(80,10000,"yellow",2001);
		//Xuat
		System.out.println ("Gia cua sedan: " + sedan1.getPrice());
		System.out.println ("Gia cua ford: " + ford1.getPrice());
		System.out.println ("Gia cua truck: " + truck1.getPrice());
    }
}