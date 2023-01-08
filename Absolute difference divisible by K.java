/**
Problem Definition - Given an array of integers of size n and an integer k, find all the pairs in the array whose absolute difference is divisible 
                     by k.

Example 1:

Input:
n = 3
arr[] = {3, 7, 11}
k = 4
Output:
3
Explanation:
(11-3) = 8 is divisible by 4
(11-7) = 4 is divisible by 4
(7-3) = 4 is divisible by 4

Example 2:

Input:
n = 4
arr[] = {1, 2, 3, 4}
k = 2
Output :
2
Explanation:
Valid pairs are (1,3), and (2,4).

*/

/***************************************************************************************************************************************************/

// Base Solution:

static long countPairs(int n, int[] arr, int k) {
    if ((k==0) || (arr==null) || (n==0)) {
        return 0;
    }
    int[] remainder = new int[k];
    long pairsCount = 0;
    for(int i = 0; i < n; i++) {
        arr[i] = arr[i]%k;
    }
    for(int i = 0; i < n; i++) {
        remainder[arr[i]]++;
    }
    for(int i = 0; i < remainder.length; i++) {
        pairsCount += (remainder[i]*(remainder[i]-1))/2;
    }
    return pairsCount;
}

/***************************************************************************************************************************************************/

// Optimized Solution:

static long countPairs(int n, int[] arr, int k) {
		if ((k==0) || (arr==null) || (n==0)) {
		    return 0;
		}
		int[] remainder = new int[k];
		long pairsCount = 0;
		for(int i = 0; i < n; i++) {
		    arr[i] = arr[i]%k;
		}
		for(int i = 0; i < n; i++) {
		    remainder[arr[i]]++;
		}
		for(int i = 0; i < remainder.length; i++) {
		    pairsCount += (remainder[i]*(remainder[i]-1))/2;
		}
	return pairsCount;
	}

/***************************************************************************************************************************************************/
