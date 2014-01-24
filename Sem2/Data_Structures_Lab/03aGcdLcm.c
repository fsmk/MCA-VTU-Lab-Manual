#include <stdio.h>
#include <stdlib.h>

int fnGCD(int, int);

int main(void)
{
	int iVal1,iVal2,iVal3,iGcd,iLcm;

	printf("\nEnter three values\n");
	scanf("%d%d%d",&iVal1,&iVal2,&iVal3);

	iGcd = fnGCD(fnGCD(iVal1,iVal2),iVal3);
	iLcm = (iVal1 > iVal2 )? (iVal1 > iVal3 ? iVal1 : iVal3) : (iVal2 > iVal3 ? iVal2 : iVal3);

	while((iLcm % iVal1) || (iLcm % iVal2) || (iLcm % iVal3))
        iLcm++;

	printf("\nGCD of %d %d and %d : %d",iVal1,iVal2,iVal3,iGcd);
	printf("\nLCM of %d %d and %d : %d",iVal1,iVal2,iVal3,iLcm);

	return 0;
}

int fnGCD(int m, int n)
{
    if(n==0)
        return m;
    else
        return fnGCD(n, m%n);
}

