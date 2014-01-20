/******************************************************************************
*File		: HeapSort.c
*Description	: Program to sort an array using Heap Sort
*Author		: Prabodh C P
*Compiler	: gcc compiler 4.6.3, Ubuntu 12.04
*Date		: Friday 22 November 2013
******************************************************************************/

#include <stdio.h>
#include <stdlib.h>
#include <sys/time.h>
#include <time.h>

void fnGenRandInput(int[], int);
void fnDispArray(int[], int);
int fnBinSearch(int[],int,int,int,int);
int fnLinSearch(int[],int,int);
void fnSort(int[],int);

/******************************************************************************
*Function	: main
*Input parameters: no parameters
*RETURNS	:	0 on success
******************************************************************************/
int main(void)
{

	FILE *fp1,*fp2;
	struct timeval tv;
	double dStart,dEnd;
	int iaArr[500000],iNum,iPos,iKey,i,iChoice;

    for(;;)
    {
        printf("\n1.Plot the Graph \n2.Binary Search");
        printf("\n3.Linear Search\n4.Exit");
        printf("\nEnter your choice\n");
        scanf("%d",&iChoice);

        switch(iChoice)
        {
            case 1:
                fp1 = fopen("BSearch.dat","w");
                fp2 = fopen("LSearch.dat","w");
				srand(time(NULL));

                for(i=100;i<10000;i+=100)
                {
                    fnGenRandInput(iaArr,i);
					iKey = iaArr[0];

                    gettimeofday(&tv,NULL);
                    dStart = tv.tv_sec + (tv.tv_usec/1000000.0);

					fnLinSearch(iaArr,i,iKey);

                    gettimeofday(&tv,NULL);
                    dEnd = tv.tv_sec + (tv.tv_usec/1000000.0);

                    fprintf(fp1,"%d\t%lf\n",i,dEnd-dStart);

					fnSort(iaArr,i);

                    gettimeofday(&tv,NULL);
                    dStart = tv.tv_sec + (tv.tv_usec/1000000.0);

					fnBinSearch(iaArr,i,iKey,0,i-1);

                    gettimeofday(&tv,NULL);
                    dEnd = tv.tv_sec + (tv.tv_usec/1000000.0);

                    fprintf(fp2,"%d\t%lf\n",i,dEnd-dStart);

                }
                fclose(fp1);
                fclose(fp2);

                printf("\nData Files generated and stored in files < BSearch.dat > and < LSearch.dat >.");
				printf("\n Use a plotting utility\n");
            break;

            case 2:
                printf("\nEnter the number of elements to Search\n");
                scanf("%d",&iNum);
                printf("\nSearch Array\n");
                fnGenRandInput(iaArr,iNum);
				fnSort(iaArr,iNum);
                fnDispArray(iaArr,iNum);
                printf("\nEnter the key element to Search\n");
                scanf("%d",&iKey);

				iPos = fnBinSearch(iaArr,iNum,iKey,0,iNum-1);
				if(iPos == -1)
				{
				    printf("\nElement not found \n");
				}
				else
				{
				    printf("\nElement found at %d position\n",iPos+1);
				}

            break;

            case 3:
                printf("\nEnter the number of elements to Search\n");
                scanf("%d",&iNum);
                printf("\nSearch Array\n");
                fnGenRandInput(iaArr,iNum);
                fnDispArray(iaArr,iNum);
                printf("\nEnter the key element to Search\n");
                scanf("%d",&iKey);

				iPos = fnLinSearch(iaArr,iNum,iKey);
				if(iPos == -1)
				{
				    printf("\nElement not found \n");
				}
				else
				{
				    printf("\nElement found at %d position\n",iPos+1);
				}
            break;

            case 4:
                exit(0);
        }
    }

	return 0;
}


/******************************************************************************
*Function	: fnBinSearch
*Description	: Function to perform recursive Binary Search
*Input parameters:
*	int a[] - Array to hold integers
*	int n	- count of elements in the array
*	int key	- element to be searched
*	int low	- start index of the search space
*	int high	- end index of the search space
*RETURNS	: index if present or -1 other wise
******************************************************************************/
int fnBinSearch(int a[],int n,int key,int low, int high)
{
	int mid;

	mid = (low + high)/2;
	if(key == a[mid])
		return mid;
	else if(low > high)
		return -1;
	else if(key < a[mid])
		return 	fnBinSearch(a,n,key,low,mid-1);
	else
		return 	fnBinSearch(a,n,key,mid+1,high);
}
/******************************************************************************
*Function	: fnBinSearch
*Description	: Function to perform recursive Binary Search
*Input parameters:
*	int a[] - Array to hold integers
*	int n	- count of elements in the array
*	int key	- element to be searched
*RETURNS	: index if present or -1 other wise
******************************************************************************/

int fnLinSearch(int a[],int n,int key)
{
	if(a[n-1] == key)
		return n-1;
	else if(n == 0)
		return -1;
	else
		return fnLinSearch(a,n-1,key);
}

/******************************************************************************
*Function	: fnHeapSort
*Description	: Function to sort an array using Bubble Sort
*Input parameters:
*	int a[] - Array to hold integers
*	int n	- number of elements in the Array
*RETURNS	: no value
******************************************************************************/
void fnSort(int a[],int n)
{
	int temp,i,j;

	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i] > a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
}

/******************************************************************************
*Function	: GenRandInput
*Description	: Function to generate a fixed number of random elements
*Input parameters:
*	int X[] - array to hold integers
*	int n	- no of elements in the array
*RETURNS	:no return value
******************************************************************************/

void fnGenRandInput(int X[], int n)
{
	int i;

	srand(time(NULL));
	for(i=0;i<n;i++)
	{
		X[i] = rand()%1000;
	}

}

/******************************************************************************
*Function	: DispArray
*Description	: Function to display elements of an array
*Input parameters:
*	int X[] - array to hold integers
*	int n	- no of elements in the array
*RETURNS	: no return value
******************************************************************************/

void fnDispArray( int X[], int n)
{
	int i;

	for(i=0;i<n;i++)
		printf(" %5d \n",X[i]);

}

