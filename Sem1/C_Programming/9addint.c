/*Write a Menu driven C program to
a. Accept two numbers n and m
b. Sum of all integers ranging from n to m
c. Sum of all odd integers ranging from n to m
d. Sum of all even integers ranging from n to m
Display an error message if n > m. Create functions for each of the options
*/
#include<stdio.h>
void sum1(int m,int n);
void sum2(int m,int n);
void sum3(int m,int n);
int i;
int main()
{
int m,n,ch;
printf("1.sum of all integers\n2.sum of all odd integers\n3.sum of all even integers\nenter your choice\n");
scanf("%d",&ch);
read:
printf("enter m and n values\n");
scanf("%d %d",&m,&n);
if(m>n)
{
printf("please re-enter values\n");
goto read;
}
switch(ch)
{
case 1:
sum1(m,n);
break;
case 2:
sum2(m,n);
break;
case 3:
sum3(m,n);
break;
default:
printf("invalid choice");
break;
}

return 0;
}

void sum1(int m, int n)
{ int sum=0;
for(i=m;i<=n;i++)
sum=sum+i;
printf("Sum of all integers are %d\n",sum);
}
void sum2(int m, int n)
{
int sum=0;
for(i=m;i<=n;i++)
{if(i%2==1)
sum=sum+i;}
printf("Sum of all odd integers are %d\n",sum);
}
void sum3(int m, int n)
{
int sum=0;
for(i=m;i<=n;i++)
{if(i%2==0)
sum=sum+i;}
printf("Sum of all even integers are %d\n",sum);
}
