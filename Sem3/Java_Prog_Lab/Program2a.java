//2. a. Write a JAVA Program to demonstrate Inheritance.
import java.io.*;
class a
{
int i,j;
a(){}
void set(int a,int b)
{
i=a;
j=b;
}
void disp()
{
System.out.println(i+j);
}
}
class b extends a
{
int k;
void set(int c)
{
//super(i,j);
k=c;
}
void sum(a ob)
{
System.out.println((ob.i+ob.j+k));
} }
class Program2a
{
public static void main(String[]args)
{
a ob=new a();
ob.set(10,20);
ob.disp();
b ob1=new b();
ob1.set(20);
ob1.sum(ob);}}
