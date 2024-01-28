package org.problem_solving.sales_by_match;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Solution {

    public static void main(String[] args) throws  IOException {
//        int socks[] = {1, 2, 1, 2, 1, 3, 2, 1, 3};

        int nbrPairs = sockMerchant(
                15,
                List.of(6,5,2,3,5,2,2,1,1,5,1,3,3,3,5)
            );

        System.out.println("Number of Pairs = "+nbrPairs);
    }



    public static int sockMerchant(int n, List<Integer> ar) {
        ar.forEach(System.out::println);
        HashMap<Integer, Integer> socks = new HashMap<>();
        int nbrOfPairs = 0;

        for (int i = 0; i < n; i++) {
            int currentSocksNumber = ar.get(i);
            if (socks.containsKey(currentSocksNumber)) {
                int previousValue = socks.get(currentSocksNumber);
                socks.put(currentSocksNumber, ++previousValue);
            } else {
                socks.put(currentSocksNumber, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : socks.entrySet()) {
            nbrOfPairs += entry.getValue() / 2;
        }
        return nbrOfPairs;
    }



    public  int sockMerchant2(int n, List<Integer> ar){
        Collections.sort(ar);
        int count = 0, current = 0;

        for(int num: ar){
            if(num == current){
                count += 1;
                current = 0;
                continue;
            }
            current = num;
        }
        return count;
    }

}
