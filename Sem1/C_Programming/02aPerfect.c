#include <stdio.h>
#include <stdlib.h>

int main()
{
    int iNum,iSum=0,i;


    printf("\nEnter a number\n");
    scanf("%d",&iNum);

    i=1;
    while(i<iNum)
    {
        if(iNum % i == 0)
            iSum += i;
        i++;
    }

    if(iSum == iNum)
        printf("\nGiven number is a Perfect Number\n");
    else
        printf("\nGiven number is not a Perfect Number\n");

    return 0;
}

