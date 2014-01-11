//2b.Write a JAVA Program to demonstrate Exception Handling (Using Nested try catch and finally).
import java.lang.*;
class Program2b
{
public static void main(String args[])
{
try
{
int a=2,b=0,c;
try
{
int a1[]={0,1,2};
int x[]={0};
System.out.println("Inner try-catch block\n");
for(int i=0;i<10;i++)
{
x[i]=a1[i]/2;
}
}
catch(Exception e)
{
System.out.println("exception :" +e);
}
System.out.println("outer try-catch block\n");
c=a/b;
}
catch(Exception e2)
{
System.out.println("exception :"+e2);
}
finally
{
System.out.println("exception caught");
}
}
}
