package com.company.easy;

public class E283_MoveZeroes {

    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i =0; i<nums.length;i++){

            if(nums[i] !=0)
            {
                int temp = nums[k];
                nums[k++]=nums[i];
                nums[i]=temp;
            }
        }
    }


  /*  public void moveZeroes(int[] nums) {
        int p = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0 && p==-1){
                p = i;
            }
            if(nums[i]!=0 && p>-1){
                nums[p] = nums[i];
                nums[i] = 0;
                if(nums[p+1]!=0){
                    p=-1;
                }else p++;
            }
        }*/


}

