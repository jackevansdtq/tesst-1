

//Bai 03: Thiet ket lop Fan gom cac yeu cau:
// -Yeu cau 1: Ve UML  va hien thuc lop - 1 diem
// -Yeu cau 2: Tao chuong trinh... Cai dat... Hien thi- 1 diem

//Yeu cau 1
/***********************
*         Fan          *
* ---------------------*
* +SLOW: int           *
* ----------           *
* +MEDIUM: int         *
* ------------         *
* +FAST: int           *
* ----------           *
* -speed: int          *
* -on: boolean         *
* -radius: double      *
* +color: String       *
* +Fan()               *
* +setSpeed(int)       *
* +turnOn()            *
* +turnOff()           *
* +setRadius(double):  *
* +setColor(String):   *
* +getSpeed(): String  *
* +isOn(): boolean     *
* +getRadius(): double *
* +getColor(): String  *
* +toString(): String  *
***********************/

class Fan{
	//DInh nghia cac bien tinh trong lop
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	
	//Dinh nghia cac bien du lieu
	private int speed;
	private boolean on;
	private double radius;
	String color;
	
	//COnstructor no-arg that creates a default fan
	Fan(){
		speed = SLOW;
		on = false;
		radius = 5;
		color = "pink";
	}
	
	//Mutator methods
	//Sets speed
	public void setSpeed(int newSpeed){
		speed = newSpeed;
	}
	
	//Sets fan on
	public void turnOn(){
		on = true;
	}
	
	//Sets fan off
	public void turnOff(){
		on = false;
	}
	
	//Sets color
	public void setColor(String newColor){
		color = newColor;
	}
	
	//Sets radius
	public void setRadius(double newRadius){
		radius = newRadius;
	}
	
	//Access methods
	//Return speed
	public String getSpeed(){
		String s = "";
		switch (speed){
			case SLOW: s="SLOW"; break;
			case MEDIUM: s="MEDIUM"; break;
			case FAST: s="FAST"; break;
		}
		return s;
	}
	
	//return on
	public boolean isOn(){
		return on;
	}
	
	//return radius
	public double getRadius(){
		return radius;
	}
	
	//return color
	public String getColor(){
		return color;
	}
	
	//return a string description for the fan
	public String toString(){
		if (on == true){
			return "\nFan speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius()+ "\n";
		}
		else{
			return "\nFan color: " + getColor() +  ", radius: " + getRadius()+ "\nfan is off\n";
		}
	}
}
//Xong yeu cau 1

//Yeu cau 2
public class Tuan03_Bai03{
	public static void main (String[] args) {
		//Creat constant fan speed
		final int FAST = 3;
		final int MEDIUM = 2;
		final int SLOW = 1;
		//Create two Fan objects
		Fan fan01 = new Fan();
		Fan fan02 = new Fan();
		
		//Assige maximum speed, radius 10, color yellow,
		//and turn it on to the first object
		fan01.setSpeed(FAST);
		fan01.setRadius(10);
		fan01.setColor("yellow");
		fan01.turnOn();
		
		//Assige medium speed, radius 5, color pink,
		//and turn it off to the second
		fan02.setSpeed(MEDIUM);
		fan02.setRadius(5);
		fan02.setColor("blue");
		fan02.turnOff();
		
		//Display the objects by invoking their toString method
		System.out.println(fan01.toString());
		System.out.println(fan02.toString());
	}
}