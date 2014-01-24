//Write a C program to implement a magic square of size n.
#include<stdio.h>
int main()
{
int ord,i,j,a[10][10],dig1=0,dig2=0;
printf("enter order of matrix(should be square matrix)\n");
scanf("%d", &ord);
printf("Enter the elements\n");
for(i=0;i<ord;i++)
{
for(j=0;j<ord;j++)
{
scanf("%d",&a[i][j]);
}
}
//for 1st dialgonal
for(i=0;i<ord;i++)
{
for(j=0;j<ord;j++)
{
if(i==j)
dig1+=a[i][j];
if(i+j==ord-1)
dig2+=a[i][j];
}
}
if((dig1==dig2))
printf("Magic matrix");
else
printf("Not magic matrix");


return 0;
}
