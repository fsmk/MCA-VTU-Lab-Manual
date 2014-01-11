import java.util.*;
import java.io.*;
class cons
{
int i,c;
float d;
cons()
{
System.out.println("NO arg constructor");
} cons(int a)
{
i=a;
System.out.println("one arg constructor"+i);
}
cons(int a,int b)
{
c=a+b;
System.out.println("two arg constructor"+c);
}
int opr(int a,int b)
{
c=a+b;
return c;
}
float opr(float a,float b)
{
d=a+b;
return d;
} }
class program1
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter m and n values");
int m=s.nextInt();
int n=s.nextInt();
cons ob=new cons();
cons ob1=new cons(m);
cons ob2=new cons(m,n);
System.out.println("enter the int m and n values");
int p=s.nextInt();
int q=s.nextInt();
int a=ob.opr(p,q);
System.out.println("a - integer functon"+a);
System.out.println("enter the float m and n values");
float g=s.nextFloat();
float h=s.nextFloat();
float b=ob.opr(g,h);
System.out.println("b -float function"+b);
}}
