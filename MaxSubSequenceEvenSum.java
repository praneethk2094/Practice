package practice.microsoft;

import java.util.ArrayList;
import java.util.Collections;

public class MaxSubSequenceEvenSum {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 10, 3, 5 };
        int N = arr.length;
        int K = 3;
 
        System.out.println(evenSumK(arr, N, K));
	}
	
	static int evenSumK(int arr[], int N, int K)
    {
        if (K > N) {
            return -1;
        }
        int maxSum = 0;
 
        ArrayList<Integer> Even = new ArrayList<Integer>();
        ArrayList<Integer> Odd = new ArrayList<Integer>();
 
        for (int i = 0; i < N; i++) {
            // If current element
            // is an odd number
            if (arr[i] % 2 == 1) {
                Odd.add(arr[i]);
            }
            else {
                Even.add(arr[i]);
            }
        }
 
        Collections.sort(Odd);
        Collections.sort(Even);
 
        int i = Even.size() - 1;
        int j = Odd.size() - 1;
 
        while (K > 0) {
 
            // If K is odd
            if (K % 2 == 1) {
 
                // If count of elements
                // in Even[] >= 1
                if (i >= 0) {
 
                    // Update maxSum
                    maxSum += Even.get(i);
 
                    // Update i
                    i--;
                }
 
                // If count of elements
                // in Even[] array is 0.
                else {
                    return -1;
                }
 
                // Update K
                K--;
            }
 
            // If count of elements
            // in Even[] and odd[] >= 2
            else if (i >= 1 && j >= 1) {
                if (Even.get(i) + Even.get(i - 1)
                    <= Odd.get(j) + Odd.get(j - 1)) {
 
                    // Update maxSum
                    maxSum += Odd.get(j) + Odd.get(j - 1);
 
                    // Update j
                    j -= 2;
                }
                else {
 
                    // Update maxSum
                    maxSum += Even.get(i) + Even.get(i - 1);
 
                    // Update i
                    i -= 2;
                }
 
                // Update K
                K -= 2;
            }
 
            // If count of elements
            // in Even[] array >= 2.
            else if (i >= 1) {
 
                // Update maxSum
                maxSum += Even.get(i) + Even.get(i - 1);
 
                // Update i
                i -= 2;
 
                // Update K
                K -= 2;
            }
 
            // If count of elements
            // in Odd[] array >= 1
            else if (j >= 1) {
 
                // Update maxSum
                maxSum += Odd.get(j) + Odd.get(j - 1);
 
                // Update i.
                j -= 2;
 
                // Update K.
                K -= 2;
            }
        }
        return maxSum;
    }

}
