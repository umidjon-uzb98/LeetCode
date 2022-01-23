package com.company.easy;

public class E414_ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        boolean minIsMin = true;
        int flag = 0;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i : nums){
            if(i > first){
                flag++;
                third = second;
                second = first;
                first = i;
            }
            else if (i > second && i < first){
                flag++;
                third = second;
                second = i;
            }
            else if (i > third && i < second ) {
                flag++;
                third = i;
            }
            else if(i == Integer.MIN_VALUE && minIsMin){
                flag++;
                minIsMin = false;
            }
        }

        return flag < 3 ? first : third;
    }

}

