package org.fsmk.mca.example7.shape;

public class Circle implements IShape {

	int m_radius;
	
	public Circle(int radius)
	{
		m_radius = radius;
	}
	
	@Override
	public double calcArea() {
		//Area of circle = PI * Square of radius of the circle
		return Math.PI*m_radius*m_radius;
	}

	@Override
	public double calcPerimeter() {
		//Perimeter of circle = 2 * PI * radius of the circle
		return 2*Math.PI*m_radius;
	}

	@Override
	public String getName() {
		return "Circle";
	}

}
