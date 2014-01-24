#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    char Str[30],encStr[30],decStr[30];
    int i,iKey,iChoice;
    while(1)
    {
        printf("\nMENU\n=====\n1.Input\n2.Encode\n3.Decode\n4.Exit");
        printf("\nEnter your choice\n");
        scanf("%d",&iChoice);
        getchar();
        switch(iChoice)
        {
            case 1:
                printf("\nEnter a str\n");
                gets(Str);
                break;
            case 2:
                printf("\nEnter a key\n");
                scanf("%d",&iKey);

                for(i=0;Str[i]!='\0';i++)
                {
                    encStr[i] = Str[i] + iKey;
                }

                printf("\nEncoded String :\n");
                puts(encStr);
                break;
            case 3:
                for(i=0;Str[i]!='\0';i++)
                {
                    decStr[i] = encStr[i] - iKey;
                }
                decStr[i] = '\0';
                printf("\nDecoded String :\n");
                puts(decStr);
                break;
            default:
                exit(0);
        }
    }
    return 0;
}

