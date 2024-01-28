package org.problem_solving;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        doThePrint();
        doThePrint();
        doThePrint();

    }

    private static void doThePrint() {
        System.out.println("|--------TRIAL 1-------------");
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        listOfNumbers.parallelStream().forEach(number ->
                System.out.println("|"+number + " " + Thread.currentThread().getName()+"|")
        );
        System.out.println("|------END TRIAL 1-----------|");
    }

}