#include <stdio.h>
#include <stdlib.h>

int main()
{
    int iNum,iNum2,iSum=0,iDig;


    printf("\nEnter a number\n");
    scanf("%d",&iNum);

    iNum2 = iNum;
    while(iNum)
    {
        iDig = iNum % 10;
        iSum += iDig*iDig*iDig;
        iNum = iNum/10;
    }

    if(iSum == iNum2)
        printf("\nGiven number is a Armstrong Number\n");
    else
        printf("\nGiven number is not a Armstrong Number\n");

    return 0;
}

