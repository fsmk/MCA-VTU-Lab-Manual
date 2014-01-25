#include<stdio.h>
void add();
void sub();
struct compl
{
int img;
int real;
};
void main()
{

 int i;
printf("enter the real & img no\n");
struct compl cn[2];
for(i=0;i<2;i++)
{
scanf("%d%d",&cn[i].real,&cn[i].img);
}
add(cn);
sub(cn);
}
void add(struct compl cn[])
{
int real1,img1;
real1=cn[0].real+cn[1].real;
img1=cn[0].img+cn[1].img;
printf("sum of complex no:%d+%di\n",real1,img1);
}
void sub(struct compl cn[])
{
int real1,img1;
real1=cn[0].real-cn[1].real;
img1=cn[0].img-cn[1].img;
printf("diff of complex no:%d+%di\n",real1,img1);
}
