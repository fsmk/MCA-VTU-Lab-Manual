#include <stdio.h>

int main(void)
{
	float bsc,hra,ta,it,gross,nets;

	printf("\nEnter basic salary:");
	scanf("%f",&bsc);

	hra=.1*bsc;
	ta=.05*bsc;
  	it=.025*bsc;
	nets=bsc+hra+ta-it;

	printf("\nBasic Salary = %.2f\nHRA = %.2f\nTA = %.2f\nIT = %.2f",bsc,hra,ta,it);
	printf("\nNet Salary = %.2f\n",nets);

	return 0;
}



