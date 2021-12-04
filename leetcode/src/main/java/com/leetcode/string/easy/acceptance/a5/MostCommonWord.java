package com.leetcode.string.easy.acceptance.a5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.
 *
 * The words in paragraph are case-insensitive and the answer should be returned in lowercase.
 */
public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Function<String, String> unaryOperator = s1 -> s1.replaceAll("[^A-Za-z]+", "");
        String[] split = paragraph.split("\\s+");
        List<String> collect1 = Arrays.stream(split).map(s -> s.split(",")).flatMap(Arrays::stream).collect(Collectors.toList());
        Map<String, Long> collect = collect1.stream().map(unaryOperator).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Map.Entry<String, Long>> sortedList = collect.entrySet()
                .stream().sorted((e1, e2) -> (-1)*Long.compare(e1.getValue(), e2.getValue()))
                .collect(Collectors.toList());
        Set<String> bannedSet = Arrays.stream(banned).collect(Collectors.toSet());
         return sortedList.stream()
                 .filter(e -> !bannedSet.contains(e.getKey())).collect(Collectors.toList())
                 .stream().findFirst().get().getKey();

    }

    public static void main(String[] args) {
        String s = new MostCommonWord()
                .mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"});
    }
}
