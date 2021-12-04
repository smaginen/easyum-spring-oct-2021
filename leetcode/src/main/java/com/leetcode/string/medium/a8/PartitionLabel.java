package com.leetcode.string.medium.a8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
* You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.

Return a list of integers representing the size of these parts.



Example 1:

Input: s = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
*
* @href https://leetcode.com/problems/partition-labels/
* */
public class PartitionLabel {
    public static List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int prev = -1;
        Set<String> prevSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i));
            prevSet.add(ch);
            if(i+1< s.length()){
                int finalI = i;
                boolean contains = prevSet.stream()
                        .allMatch(p -> !s.substring(finalI +1).contains(p));
                if(contains){
                    res.add(i-prev);
                    prevSet = new HashSet<>();
                    prev = i;
                }
            } else{
                res.add(s.length()-1-prev);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> ababcbacadefegdehijhklij = new PartitionLabel().partitionLabels("ababcbacadefegdehijhklij");
        System.out.println(ababcbacadefegdehijhklij);
    }
}
