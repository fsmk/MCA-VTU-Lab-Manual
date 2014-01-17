package org.fsmk.mca.example7.shape;

public class Triangle implements IShape {

	int m_s1;
	int m_s2;
	int m_s3;
	
	public Triangle(int s1, int s2, int s3)
	{
		m_s1 = s1;
		m_s2 = s2;
		m_s3 = s3;
	}
	
	@Override
	public double calcArea() {
		//Heron's formula
		float semi_perimeter = (m_s1+m_s2+m_s3)/2;
		float s = semi_perimeter * (semi_perimeter -m_s1) * (semi_perimeter -m_s2) * (semi_perimeter -m_s3);
		double area = Math.sqrt(s);
		return area;
	}

	@Override
	public double calcPerimeter() {
		return m_s1+m_s2+m_s3;
	}
	
	@Override
	public String getName() {
		return "Triangle";
	}

}
