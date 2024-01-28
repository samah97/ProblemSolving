package org.problem_solving.array_manipulation;

import java.util.List;

public class Solution {


    private Solution(){}

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        long maxValue = 0L;

        long[] array = new long[n+1];

        for(int i=0;i<queries.size();i++){
            List<Integer> subQuery = queries.get(i);
            int from = subQuery.get(0) -1 ;
            int to = subQuery.get(1);
            int toAdd = subQuery.get(2);



            array[from]+=toAdd;
            array[to]-=toAdd;
/*            for(int j=from;j<to;j++){
                long sum = array[j]+(long)value;
                array[j] = (int) sum;
                maxValue = Math.max(maxValue, sum);
            }*/
        }

        long max =0,sum=0;
        for(long j: array)
        {
            sum += j;
            max = Math.max( sum,max);
        }
        return max;
    }


}
