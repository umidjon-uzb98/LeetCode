package com.company.easy;

public class E202_HappyNumber {
    public boolean isHappy(int n) {
        int sum=0;
        while (true)
        {
            while (n>0)
            {
                sum+=(n%10)*(n%10);
                n/=10;
            }
            if (sum==1 || sum==10 || sum==100)
                return true;
            if (sum==4)
                return false;
            n=sum;
            sum=0;
        }
    }

   /* public boolean isHappy(int n) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer,Integer>();
        while(true) {
            int sum = 0;
            if(n == 1) { return true; }
            if(hmap.containsKey(n)) { return false; }
            hmap.put(n,1);
            while(n > 0) {
                sum += (n%10) * (n%10);
                n = n/10;
            }
            n = sum;
        }
    }*/
}


