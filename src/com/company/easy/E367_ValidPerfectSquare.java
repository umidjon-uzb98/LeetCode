package com.company.easy;

public class E367_ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        int right = num/2+1;
        int left =1;
        if(num==1) return true;

        while(left < right){
            int mid  = left + (right - left)/2;

            if((long)mid*mid==num) return true;
            else if((long)mid*mid > num) right = mid;
            else left = mid + 1;
        }

        return false;
    }

}

