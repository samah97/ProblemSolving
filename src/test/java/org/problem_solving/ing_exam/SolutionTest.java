package org.problem_solving.ing_exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        int[] result = Solution.solution("BAABA",new int[]{2,4,1,1,2});
        System.out.println(result[0]+"- "+result[1]);

    }
}