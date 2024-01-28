package org.problem_solving.array_manipulation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void arrayManipulation() {
        long maxValue = Solution.arrayManipulation(10,createList());
        System.out.println("max Value = "+maxValue);;
    }

    List<List<Integer>> createList(){
        return  new ArrayList<>(){{
            add(Arrays.asList(1,5,3));
            add(Arrays.asList(4,8,7));
            add(Arrays.asList(6,9,1));
        }};
    }
}