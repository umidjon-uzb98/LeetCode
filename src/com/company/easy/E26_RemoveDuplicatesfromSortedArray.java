package com.company.easy;

public class E26_RemoveDuplicatesfromSortedArray {
//   1 2 3 5 6 7 6 7 7
/*
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int k = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[k]) {
            k++;
            nums[k] = nums[j];
        }
    }
    return k + 1;
}
*/

/*
    public int removeDuplicates(int[] nums) {

        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(index==0 || nums[index-1]!=nums[i]){
                nums[index]=nums[i];
                index++;
            }
        }

        return index;
    }
*/

}
