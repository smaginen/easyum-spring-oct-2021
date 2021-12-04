package com.leetcode.string.easy.acceptance.a5;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * You are given two strings s1 and s2 of equal length.
 * A string swap is an operation where you choose two indices in a string
 * (not necessarily different) and swap the characters at these indices.
 *
 * Return true if it is possible to make both strings equal by performing
 * at most one string swap on exactly one of the strings. Otherwise, return false.
 * https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
 * */

//TODO not done
public class CheckIfOneStringSwapCanMakeStringsEqual {

    public boolean areAlmostEqual(String s1, String s2) {
        int diff = 0;
        Map<Character, Long> charsToMap1 = s1.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        Map<Character, Long> charsToMap2 = s2.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i) && (charsToMap1.getOrDefault((char) i, 0l)==1l && charsToMap2.getOrDefault((char) i, 0l)==1l)) diff++;
        }
        return diff ==2  || diff == 0 ;
    }

    public static void main(String[] args) {
        boolean b = new CheckIfOneStringSwapCanMakeStringsEqual().areAlmostEqual("bank", "kanb");
    }

}
