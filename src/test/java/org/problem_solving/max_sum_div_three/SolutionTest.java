package org.problem_solving.max_sum_div_three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxSumDivThree() {
        int[] nums = {3,6,5,1,8};
        Solution solution = new Solution();
        int result = solution.maxSumDivThree(nums);
        assertEquals(result, 18);
    }
}