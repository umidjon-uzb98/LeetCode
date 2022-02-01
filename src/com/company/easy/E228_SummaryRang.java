package com.company.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E228_SummaryRang {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> ans = new ArrayList<>();
        int i = 0;

        while (i < nums.length) {
            int j = i;
            StringBuilder build = new StringBuilder();

            while (j < nums.length - 1 && nums[j+1] - nums[j] == 1) {
                j++;
            }

            if (nums[i] == nums[j]) {
                build.append(nums[i]);
            }       else {
                build.append(nums[i]);
                build.append("->");
                build.append(nums[j]);
            }

            ans.add(build.toString());
            i = i != j ? j + 1 : i + 1;
//            or
//            if(i!=j) i = j+1;
//            else i = i+1;
        }

        return ans;
    }
}

