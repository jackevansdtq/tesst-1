//Hoan thanh ca 2 yeu cau hoan chinh - 1 diem
///Bai 01: Yeu cau 01 -Xay dung 2 lop rieng biet
                  //UML diagram                  
/********************************************
*                    Circle                 *
*-------------------------------------------*
* radius: double                            *
* Circle()                                  *
* Circle(double)                            *
* getArea(): double                         *
* getPerimeter(): double                    *
* setRadius(double): double                 *
********************************************/
//Lop Circle
class Circle {
	/** Ban kinh hinh tron */
	double radius;
	/** Xay dung doi tuong hinh tron, noi cach khac, tao phuong thuc khoi tao  khong tham so */
	Circle() {
		radius = 1;
	}
	/** Xay dung doi tuong hinh tron */
	Circle(double newRadius) {
		radius = newRadius;
	}
	/** Phuong thuc tra ve dien tich hinh tron */
	double getArea() {
		return radius * radius * Math.PI;
	}
	/** tra ve chu vi */
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	/** cai dat bn kinh - setter */
	void setRadius(double newRadius) {
		radius = newRadius;
	}
}

//Lop chua ham main
public class Tuan03_Bai01{
	public static void main(String[] args){
		System.out.println("This is circle from Circle class: ");
		// Create a circle with radius 1
		Circle circle1 = new Circle();
		System.out.println("The area of the circle of radius "
		+ circle1.radius + " is " + circle1.getArea());
		
		// Create a circle with radius 25
		Circle circle2 = new Circle(25);
		System.out.println("The area of the circle of radius "
		+ circle2.radius + " is " + circle2.getArea());
		
		// Create a circle with radius 125
		Circle circle3 = new Circle(125);
		System.out.println("The area of the circle of radius "
		+ circle3.radius + " is " + circle3.getArea());
		
		// Modify circle radius
		circle2.radius = 100; // or circle2.setRadius(100)
		System.out.println("The area of the circle of radius "
		+ circle2.radius + " is " + circle2.getArea());
		
		System.out.println("\nThis is circle from OnlyCircle class: ");
		OnlyCircle.excute();
	}
}


//Yeu cau 02 -Xay dung mot lop duy nhat
//Do xay dung class duy nhat nay trong cung file nen minSh se khong tao public class ma chi la class
class OnlyCircle{
	//Xay dung tuong tu xay dung class Circle tren
	double radius;
	
	//Constructor no-arg
	OnlyCircle(){
		radius = 1;
	}
	
	//Constructor with a specified radius
	OnlyCircle(double newRadius){
		radius = newRadius;
	}
	
	/** Phuong thuc tra ve dien tich hinh tron */
	double getArea() {
		return radius * radius * Math.PI;
	}
	/** tra ve chu vi */
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	/** cai dat bn kinh - setter */
	void setRadius(double newRadius) {
		radius = newRadius;
	}
	//Day la phuong thuc main() khi ban thuc thi trong file khac
	//Do minh khoi tao trong cung file Bai01 nay, nen minh se chuyen no thanh phuong thuc excute() de goi trong phuong thuc main() cua file nay
	public static void excute(){
		// Create a circle with radius 1
		OnlyCircle circle1 = new OnlyCircle();
		System.out.println("The area of the circle of radius "
		+ circle1.radius + " is " + circle1.getArea());
		
		// Create a circle with radius 25
		OnlyCircle circle2 = new OnlyCircle(25);
		System.out.println("The area of the circle of radius "
		+ circle2.radius + " is " + circle2.getArea());
		
		// Create a circle with radius 125
		OnlyCircle circle3 = new OnlyCircle(125);
		System.out.println("The area of the circle of radius "
		+ circle3.radius + " is " + circle3.getArea());
		
		// Modify circle radius
		circle2.radius = 100; // or circle2.setRadius(100)
		System.out.println("The area of the circle of radius "
		+ circle2.radius + " is " + circle2.getArea());
	}
}

