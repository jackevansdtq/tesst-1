//Lop Circle la lop con cua lop Point, va cai dat/hien thuc gian tiep interface ten shape
//Dinh nghia lop circle trong tap tin circle.java
public class Circle extends Point
{
	//Dan xuat tu lop Point
	protected double radius;
	
	//constructor khong tham
	public Circle()
	{
		//ngam goi den construc tor cua lop cha
		setRadius(0);
	}
	
	//constructor co tham so
	public Circle(double circleRadius, int xCoordinate, int yCoordinate)
	{
		//goi constructor cua lop cha
		super(xCoordinate,yCoordinate);
		
		setRadius(circleRadius);
	}
	
	//Gan ban kinh cua duong tron
	public void setRadius(double circleRadius)
	{
		radius = (circleRadius>=0)? circleRadius:0;
		
	}
	
	//lay ban kinh cua duong tron
	public double getRadius()
	{
		return radius;
	}
	
	//tinh dien tich duong tron circle
	public double area()
	{
		return Math.PI*radius*radius;
	}
	
	//bieu dieen duong tron bang mot chuoi
	public String toString()
	{
		return "Center = " +super.toString()+"; Radius = "+radius;
	}
	
	//tra ve ten cua shape
	public String getName()
	{
		return "Circle";
	}
}//end class circle

