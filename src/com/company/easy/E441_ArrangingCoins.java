package com.company.easy;

public class E441_ArrangingCoins {

    public int arrangeCoins(int n) {
        if (n <= 3) {
            return n == 3 ? 2 : 1;
        }

        long left = 2; // n minimum 4 boladi yuqoridagi if dan o'tsa
        long right = n/2;

        while(left <= right){
            long mid = left + (right - left)/2;
            long sum = mid*(mid+1)/2;

            if(sum == n) return (int) mid;
            if(sum < n) left = mid+1;
            else right = mid-1;

        }
        return (int) right;
    }

}

