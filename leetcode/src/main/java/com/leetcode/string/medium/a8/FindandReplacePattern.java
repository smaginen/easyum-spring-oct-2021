package com.leetcode.string.medium.a8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *Given a list of strings words and a string pattern, return a list of words[i]
 *  that match pattern. You may return the answer in any order.
 *
 * A word matches the pattern if there exists a permutation of letters
 * p so that after replacing every letter x in the pattern with p(x), we get the desired word.
 *
 * Recall that a permutation of letters is a bijection from letters to letters: every letter maps
 * to another letter, and no two letters map to the same letter.
 *
 * https://leetcode.com/problems/find-and-replace-pattern/
 * */
public class FindandReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if(word.length()!= pattern.length()){
                continue;
            }
            Map<Character, Character > map = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                Character character = map.get(word.charAt(i));
                if(character == null){
                    map.put(word.charAt(i), pattern.charAt(i));
                    continue;
                }
                if(character != pattern.charAt(i)){
                    break;
                }
                if(i== word.length()-1){
                    res.add(word);
                }
            }
        }
        return res;
    }
}
