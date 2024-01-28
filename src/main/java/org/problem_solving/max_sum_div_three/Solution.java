package org.problem_solving.max_sum_div_three;

public class Solution {


    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        int oneRemainder = 20000;
        int twoRemainder = 20000;

        for(int num : nums)
        {
            sum += num;

            if(num % 3 == 1)
            {
                twoRemainder = Math.min(twoRemainder, oneRemainder + num);
                oneRemainder = Math.min(oneRemainder, num);
            }

            if(num % 3 == 2)
            {
                oneRemainder = Math.min(oneRemainder, twoRemainder + num);
                twoRemainder = Math.min(twoRemainder, num);

            }
        }

        if(sum % 3 == 0)
            return sum;

        if(sum % 3 == 1)
            return sum - oneRemainder;

        if(sum % 3 == 2)
            return sum - twoRemainder;

        return 0;
    }


    // ------------------- 3 6 5 1 8
    // 3
    // 6
    // 5
    // 1
    // 8
    // 3 + 6
    // 3 + 5
    // 3 + 1
    // 3 + 8
    // 6 + 5
    // 6 + 1
    // 6 + 8
    // 5 + 1
    // 5 + 8
    // 3 + 6 + 5
    // 3 + 6 + 1
    // 3 + 6 + 8
    // 3 + 5 + 1
    // 3 + 5 + 8
    // 3 + 1 + 8
    // 6 + 5 + 1
    // 6 + 5 + 8
    // 5 + 1 + 8
    // 3 + 6 + 5 + 1 + 8


    // 3 6
    // 3
    // 6
    // 3 + 6


}
