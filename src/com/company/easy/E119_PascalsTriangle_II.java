package com.company.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E119_PascalsTriangle_II {
//    Input: rowIndex = 3
//    Output: [1,3,3,1]

        public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<rowIndex+1; i++) result.add(1);

        for(int i=1; i<rowIndex; i++)
            for(int j=i; j>0; --j)
                result.set(j, result.get(j) + result.get(j-1));
        return result;

    }

}
