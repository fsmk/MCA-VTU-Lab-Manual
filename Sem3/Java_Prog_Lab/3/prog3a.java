class Parentclass
{
	final int x;
	Parentclass(int a)
	{
		x=a;
	}
	void display()
	{
		System.out.println("Base class x is " + x);
	}
}

class Childclass extends Parentclass
{
	int y;
	Childclass(int a, int b)
	{
		super(a);
		y=b;
	}
	void display()
	{
		System.out.println("Access base class x from Derived class "+super.x);
		System.out.println("Derived class y is " + y);
	}

}

class prog3a  
{
	public static void main(String args[])	
	{
		Parentclass obj1 = new Parentclass(10);
		obj1.display();
		Childclass obj2 = new Childclass(20,30);
		obj2.display();
		obj1.display();
	}
}	
