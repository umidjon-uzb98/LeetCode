package com.company.easy;

public class E167_TwoSumIIInputArrayIsSorted {
//    Input: numbers = [2,7,11,15], target = 9
//    Output: [1,2]
//    Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].


    public int[] twoSum(int[] numbers, int target) {

        int left =0;
        int right=numbers.length-1;

        while(left < right){
            int sum = numbers[left] + numbers[right];

            if(sum>target) right--;
            else if(sum < target) left++;
            else return new int[]{left+1,right+1};
        }

        return new int[]{left+1,right+1};
    }
}

