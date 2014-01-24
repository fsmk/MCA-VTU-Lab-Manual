#include <stdio.h>
#include <stdlib.h>

int fnRecSum(int);

int main(void)
{
	int iVal1,iVal2,iVal3,iSum,iLcm;

	printf("\nEnter a value\n");
	scanf("%d",&iVal1);

	iSum = fnRecSum(iVal1);

	printf("\nSum from 1 to %d is %d",iVal1,iSum);

	return 0;
}

int fnRecSum(int n)
{
    if(n==1)
        return 1;
    else
        return n + fnRecSum(n-1);
}

