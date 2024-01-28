package org.problem_solving.vowel_substring;

public class Solution {



    public int solve(String word){
        int subStringCounters = 0;
        int n = word == null?0: word.toCharArray().length;
        for (int i=0;i<n;i++){
//            if (isVowel())
        }
        return subStringCounters;
    }

    boolean isVowel(Character character){
        return 'a' == character || 'e' == character || 'i' == character || 'o' == character || 'u' == character;
    }

}
