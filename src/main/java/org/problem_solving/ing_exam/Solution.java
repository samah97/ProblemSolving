package org.problem_solving.ing_exam;

public class Solution {

    public static int[] solution(String R, int[] V) {
        int[] balances = new int[2];
        int[] initials = new int[2];
        if(R==null){
            return initials;
        }
        if(R.length() != V.length || V.length > 100000)
            return initials;

        for (int i=0;i<R.toCharArray().length;i++){
            char recipient = R.charAt(i);
            int transferAmount = V[i];

            if(transferAmount < 0 || transferAmount > 10000) return new int[2];

            if(recipient == 'A'){
                performTransfer(initials, balances, 1,0, transferAmount);
            }else if (recipient=='B'){
                performTransfer(initials, balances, 0,1, transferAmount);
            }else{
                return new int[2];
            }
        }
        return initials;
    }

    public static void performTransfer(int[] initials, int[] balances,int from,int to, int amount){
        if(balances[from] - amount < 0){
            initials[from] += Math.abs(balances[from] - amount);
            balances[from] = 0;
        }else{
            balances[from] -= amount;
        }
        balances[to] += amount;
    }


}
