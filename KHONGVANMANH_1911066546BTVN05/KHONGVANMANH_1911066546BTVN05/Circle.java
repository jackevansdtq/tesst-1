/**
 * @(#)Circle.java
 *
 *
 * @author KhongVanManh
 * @version 1.00 2021/4/16
 */

import java.lang.Math;
interface GeometricObject{
	public double getPerimeter();
	public double getArea();
}
interface Resizable{
	public void resize(int percent);
}	
public class Circle implements GeometricObject {
	protected double radius;
    public Circle() {
    }
    public Circle(double r){
    	radius = r;
    }
    public String toString(){
    	return "Circle[radius=" + radius + "]";
    }
    public double getPerimeter(){
    	return Math.PI * 2 * radius;
    }
    public double getArea(){
    	return Math.PI * radius * radius;
    }
}
class ResizableCircle extends Circle implements Resizable{
	public ResizableCircle(double r){
		super(r);
	}
	public String toString(){
		return "ResizableCircle[Circle[radius=" + radius + "]]";
	}
	public void resize(int percent){
		radius *= percent/100;
	}
}