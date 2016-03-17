/*
 * ITC 115 W16 - 3182
 * Assignment 5
 * 
 * Thomas Karchesy
 * February 15, 2016
 */
/*
 * Circle.java holds the code for the Circle class.
 * 
 * The circle class is called from the main class. It uses the radius property 
 * and provides the circumference, area, and diameter of the circle object.
 * 
 * @package assignment6
 * @author Thomas Karchesy <tkarch01@seattlecentral.edu> 
 * @version 1.0 2016/02/12 
 * @see main.java
 * @todo documentation
 */

package assignment6;


/*
 * Circle Class
 * 
 * @property: Radius double private
 * @method: Area (radius double) returns double public
 * @method: Diameter (radius double) returns double public
 * @method: Circumference (radius double) returns double public
 * @constructor: Circle c = new Circle(radius double);
 *  
 *  @todo none
 */
public class Circle 
{

	private double radius;
	
	public Circle(double r) 
	{
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	 
	public double diameter(){
		double diameter = 2 * radius;
		return diameter;
	}
	
	public double circumference(){
		double circumference  = 3.14159 * this.diameter();
		return circumference ;
	}
	
	public double area(){
		double area  = 3.14159 * Math.pow(radius,2);
		return area ;
	}

}
