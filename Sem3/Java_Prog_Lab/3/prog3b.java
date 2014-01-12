import java.util.Scanner;
public class prog3b implements Rectangle,Triangle
{
	public void rect(int width , int height )
	{
		int area =  width * height ;
		System.out.println("The Area of Rectangle is  " + area);
	}	
	public void triarea(float a,float b,float c)
	{	
		double s = (a+b+c/2.0f);
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The Area of Triangle is  " + area);
	}
	

	public static void main(String args[])
	{
		prog3b obj = new prog3b();
		System.out.println("Enter the Width and Height of the Rectangle");
		Scanner scan = new Scanner(System.in);
		int width = scan.nextInt();
		int breadth = scan.nextInt();
		obj.rect(width,breadth);
		System.out.println("Enter sides of  Triangle");
		float a = scan.nextFloat();
		float b = scan.nextFloat();		
		float c = scan.nextFloat();		
		obj.triarea(a,b,c);
	}
} 
