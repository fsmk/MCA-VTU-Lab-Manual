/*Write a Menu Driven C Program to implement the following using recursion
a. Factorial of a number
b. Fibonacci series
*/
#include<stdio.h>
int main()
{
int fibo[10],i,ch,n,fact=1;
printf("1.Factorial of a number\n2.Fibonacci series\nenter your choice");
scanf("%d",&ch);
switch(ch){
case 1:
{
printf("Enter the number to factorial\n");
scanf("%d",&n);
//printf("n=%d",n);
for(i=n;i>0;i--)
fact*=i;
printf("Factorial of %d=%d\n",n,fact);
break;
}
case 2:
{
printf("Enter the number to fibonaci series\n");
scanf("%d",&n);
fibo[0]=0;fibo[1]=1;
for(i=2;i<=n;i++)
fibo[i]=fibo[i-2]+fibo[i-1];
printf("Fibonaci series\n");
for(i=0;i<n;i++)
printf("%d\n",fibo[i]);
break;
}
}
return 0;
}
