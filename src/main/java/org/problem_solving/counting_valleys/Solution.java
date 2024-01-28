package org.problem_solving.counting_valleys;

public class Solution {

    public static void main(String[] args) {
//        int nbrValleys = countingValleys(8,"UDDDUDUU");
        int nbrValleys = countingValleys(14,"UDDDUDUUDDUDUU");
        System.out.println(nbrValleys);
    }

    public static int countingValleys(int steps, String path) {
        int seaLevel = 0;
        int nbrValleys = 0;
        boolean isInValley = false;
        for(int i=0;i<steps;i++){
            char stepNotation = path.charAt(i);
            if(stepNotation == 'D'){
                seaLevel --;
                if(! isInValley && seaLevel < 0){
                    isInValley = true;
                    nbrValleys++;
                }
            }else{
                seaLevel++;
            }

            if(seaLevel == 0){
                isInValley = false;
            }

        }
        return nbrValleys;
    }

}
