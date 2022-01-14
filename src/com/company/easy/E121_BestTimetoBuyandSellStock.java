package com.company.easy;

import java.util.ArrayList;
import java.util.List;

public class E121_BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;

        for(int i =0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }else if(prices[i] - min > profit){
                profit = prices[i] - min;
            }

        }

        return profit;
    }

}
