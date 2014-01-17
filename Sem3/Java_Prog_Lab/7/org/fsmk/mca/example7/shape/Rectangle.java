package org.fsmk.mca.example7.shape;

public class Rectangle implements IShape {

	private int m_breadth;
	private int m_length;

	public Rectangle(int length, int breadth)
	{
		m_length = length;
		m_breadth = breadth;
		
	}
	
	@Override
	public double calcArea() {
		return m_length*m_breadth;
	}

	@Override
	public double calcPerimeter() {
		return 2*(m_length*m_breadth);
	}
	
	@Override
	public String getName() {
		return "Rectangle";
	}

}
