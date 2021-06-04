///khai bao thu vien
import java.text.DecimalFormat;

public class Test
{
	public static void main(String args[])
	{
		//tao ra cac doi tuong hinh hoc
		Point point = new Point(7,11);
		Circle circle = new Circle(3.5, 22, 8);
		Cylinder cylinder = new Cylinder(10,3.3,10,10);
		
		//tao mang cac doi tuong hinh hoc
		Shape arrayOfShapes[] = new Shape[3];
		
		arrayOfShapes[0] = point;
		arrayOfShapes[1] = circle;
		arrayOfShapes[2] = cylinder;
		
		//lay ten va bieu dien cua moi doi tuong hinh hoc
		String output = point.getName()+": "+point.toString()+"\n"+circle.getName()+": "+circle.toString()+"\n"+cylinder.getName()+": "+cylinder.toString();
		
		DecimalFormat precision2=new DecimalFormat("0.00");
		
		//duyet mang arrayOfShapes lay ten, dien tich, the tich
		for (int i= 0; i<arrayOfShapes.length; i++)
		{
			output+= "\n\n" +arrayOfShapes[i].getName()+": "+arrayOfShapes[i].toString()+"\n Area = " + precision2.format(arrayOfShapes[i].area())+"\nVolume = "+ precision2.format(arrayOfShapes[i].volume());
		}
			System.out.println(output);
		System.exit(0);
	}
}