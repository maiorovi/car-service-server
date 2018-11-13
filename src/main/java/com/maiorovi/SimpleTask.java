package com.maiorovi;

public class SimpleTask {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 3 ,2,1};
        int p = arr.length - 1;
        int q = 0;

        if (arr.length < 2) {
            throw new IllegalArgumentException("Array should be longer then 2 symbols");
        }

        int maxSumSoFar = - 1;

        while(q < p) {
            int sum = count(arr, p, q);
            maxSumSoFar = Math.max(sum, maxSumSoFar);

            if (arr[q] >= arr[p]) {
                p--;
            } else{
                q++;
            }
        }

        System.out.println(maxSumSoFar);
    }


    private static int count(int[] arr, int p, int q) {
        return arr[p] + arr[q] + p - q;
    }
}
