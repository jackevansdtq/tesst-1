//Dinh nghia lop Point trong tap tin Point.java
public class Point extends Object implements Shape
{
	protected int x, y; //toa do x, y cua mot diem
	
	//constructor khong tham so
	public Point()
	{
		setPoint(0,0);
	}
	//constructor co tham so
	public Point(int xCoordinate, int yCoordinate)
	{
		setPoint(xCoordinate, yCoordinate);
	}
	
	//gan toa do x, y cho 1 diem
	public void setPoint(int xCoordinate, int yCoordinate)
	{
		x=xCoordinate;
		y=yCoordinate;
	}
	
	//lay toa do x cua 1 diem
	public int getX()
	{
		return x;
	}
	
	//lay toa do y cua 1 diem
	public int getY()
	{
		return y;
	}
	
	//the hien toa do cua mot diem duoi dang chuoi
	public String toString()
	{
		return "["+x+", "+y+"]";
	}
	
	//tính di?n tích 
	public  double area()
	{
		return 0.0;
		
	}
	
	//tính the tich
	public double volume()
	{
		return 0.0;
	}
	
	//tra ve ten cua doi tuong shape
	public String getName()
	{
		return "Point";
	}
}