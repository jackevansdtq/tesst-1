public class Cylinder extends Circle
{
	//chieu cao cua cylinder
	protected double height;
	
	//constructor khong co tham so
	public Cylinder()
	{
		//ngam goi den constructor cua lop cha
		setHeight(0);
	}
	
	//constructor co tham so
	public Cylinder(double cylinderHeight, double cylinderRadius, int xCoordinate, int yCoordinate)
	{
		//goi constructor cua lop cha
		super(cylinderRadius, xCoordinate, yCoordinate);
		setHeight(cylinderHeight);
	}
	
	//gan chieu cao cua cylinder
	public void setHeight(double cylinderHeight)
	{
		height = (cylinderHeight>=0)? cylinderHeight:0;
	}
	
	//lay chieu cao cua cylinder
	public double getHeight()
	{
		return height;
	}
	
	//tinh dien tich xung quanh cylinder
	public double area()
	{
		return 2*super.area()+2*Math.PI*radius*height;
	}
	
	//tinh the tich cua cylinder
	public double volume()
	{
		return super.area()*height;
	}
	
	//bieu dien cylinder bang mot chuoi
	public String toString()
	{
		return super.toString()+"; Height: "+height;
	}
	
	//tra ve ten shape
	public String getName()
	{
		return "Cylinder";
	}
}//end class cylinder