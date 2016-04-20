//
// Created by Darshan Modh on 4/20/16.
//

#include <stdio.h>

#define MAX 100000

int countPairsWithDiffK(int arr[], int n, int k);

int main()
{
    int arr[] = {8, 12, 16, 4, 0, 20};
    int k = 4;
    int n = sizeof(arr) / sizeof(int);
    int result = countPairsWithDiffK(arr, n, k);
    printf(" %d \n", result);
}

int countPairsWithDiffK(int arr[], int n, int k)
{
    int count = 0;  // Initialize count

    // Initialize empty hashmap.
    int hashmap[MAX] = {0};

    // Insert array elements to hashmap
    for (int i = 0; i < n; i++)
        hashmap[arr[i]] = 1;

    for (int i = 0; i < n; i++)
    {
        int x = arr[i];
        if (x - k >= 0 && hashmap[x - k])
            count++;
        if (x + k < MAX && hashmap[x + k])
            count++;
        hashmap[x] = 0;
    }
    return count;
}

