//package com.leetcode.string.medium.a8;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LetterCasePermutation {
//    public List<String> letterCasePermutation(String s) {
//        List<String> res =  new ArrayList<>();
//        for (int i = 0; i < s.length(); i++) {
//            Character c = s.charAt(i);
//            if(Character.isAlphabetic(c)){
//                if(i == s.length()-1){
//                    continue;
//                }
//                StringBuilder builder  = new StringBuilder();
//                initBuilder(i, s, builder);
//                for (int j = i+1; j < s.length() ; j++) {
//
//                }
//                changeCase(c);
//            }
//        }
//    }
//
//    private void initBuilder(int i, String s, StringBuilder builder) {
//        for (int j = 0; j < i; j++) {
//            builder.append(s.charAt(i));
//        }
//    }
//}
