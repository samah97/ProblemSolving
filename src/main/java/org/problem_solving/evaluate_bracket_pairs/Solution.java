package org.problem_solving.evaluate_bracket_pairs;

import java.util.HashMap;
import java.util.List;

public class Solution {

    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        knowledge.forEach(strings -> map.put(strings.get(0), strings.get(1)));

        StringBuilder stringBuilder = new StringBuilder();
        boolean shouldAppend = false;
        for(Character character:s.toCharArray()){
            if('(' == character){
                shouldAppend = true;
                continue;
            }else if (')' == character){
                shouldAppend = false;
                String replacement = "?";
                if(map.containsKey(stringBuilder.toString())){
                    replacement = map.get(stringBuilder.toString());
                }
                s = s.replace("("+stringBuilder+")", replacement);
                stringBuilder = new StringBuilder();
            }
            if(shouldAppend){
                stringBuilder.append(character);
            }
        }
        return s;
    }

}
