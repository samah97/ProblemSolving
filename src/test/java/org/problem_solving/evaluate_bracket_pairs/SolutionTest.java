package org.problem_solving.evaluate_bracket_pairs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionTest {

    @Test
    void evaluate() {
        String sentence1 = "(name)is(age)yearsold(age)";
        String sentence = "(name)is(age)yearsold(age)here is (samah) 3aw";
        List<List<String>> knowledge = new ArrayList<>();
        knowledge.add(0, Arrays.asList("name","bob"));
        knowledge.add(0, Arrays.asList("age","two"));

        Solution solution = new Solution();
        String result = solution.evaluate(sentence, knowledge);
        System.out.println("RESULT = "+result);
    }
}