package com.leetcode.string.medium.a8;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
    public static int minSteps(String s, String t) {
        Map<Character, Long> sMap =  s.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Long> tMap =  t.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int count = 0;
        for (Map.Entry<Character, Long> e : sMap.entrySet()) {
            Long aLong = tMap.get(e.getKey());
            if(aLong != null  && e.getValue() != null){
                long min = Math.min(e.getValue(), aLong);
                long max = Math.max(e.getValue(), aLong);
                count += max - min;
                continue;
            }
            boolean b = tMap.get(e.getKey()) == e.getValue();
            if(b){
                count+= e.getValue();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = new MinimumNumberOfStepsToMakeTwoStringsAnagram().minSteps("anagram",
                "mangaar");
        System.out.println(i);
    }
}
