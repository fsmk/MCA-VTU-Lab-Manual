//1b. Write a JAVA Program to implement Inner class and demonstrate its Access Protections.
import java.io.*;
class outcls
{
int sum=0,prod=1,i;
void sum()
{
for(i=1;i<=5;i++)
{
sum+=i;
}
System.out.println("sum is="+sum);
}
class inner
{
void pro()
{
for(i=1;i<=5;i++)
{
prod=prod*i;
}
System.out.println("product is="+prod);
} }
}
class Program1b
{
public static void main(String []args)
{ outcls o=new outcls();
outcls.inner n=o.new inner();
o.sum();
n.pro();
}
}
