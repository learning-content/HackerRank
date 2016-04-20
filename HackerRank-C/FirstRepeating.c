#include<stdio.h>

void printRepeating(char* str);

int main()
{
    printRepeating("DARSHAN");
}

/*
void printRepeating(char* str)
{
    int i,j;
    // Boundary check
    if(str == NULL || str[0] == '\0')
    {
        printf("EMPTY STRING");
        return;
    }
 
    for(i = 0; str[i] != '\0';  i++)
    {
        for(j=i+1; str[j] != '\0'; j++)
        {
            if(str[i] == str[j])
            {
                printf(" %c \n", str[i]);
                return;
            }
        }
    }
}
*/

void printRepeating(char* str)
{
    int i,j;
    // Boundary check
    if(str == NULL || str[0] == '\0')
    {
        printf("EMPTY STRING");
        return;
    }
 
    // Count Array. All elements are zeros
    int cntArr[256] = {0};
 
    // Populating the Count Array
    for(i = 0; str[i] != '\0';  i++)
        cntArr[str[i]]++;
 
    // Getting the index of Maximum count in the Array
    int maxCntIdx = 0;
    for(i=0; str[i] != '\0';  i++)
        if(cntArr[str[i]] > 1)
        {
            printf(" %c \n", str[i]);
            return;
        }
}