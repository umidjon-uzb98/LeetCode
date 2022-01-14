package com.company.easy;

public class E69_SqrtX {
//    Input: x = 8
//    Output: 2
//    Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

    public int mySqrt(int x) {
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ( mid <= x / mid ) {
                start = mid + 1;
            } else end = mid - 1;

        }
        return end;
    }
}
