package org.fsmk.mca.example7.shape;

public class Square implements IShape {

	private int m_side;

	public Square(int side)
	{
		m_side =side;
	}
	
	@Override
	public double calcArea() {
		return m_side*m_side;
	}

	
	@Override
	public double calcPerimeter() {
		return 4*m_side;
	}
	
	@Override
	public String getName() {
		return "Square";
	}

}
