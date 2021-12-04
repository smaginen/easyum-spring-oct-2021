package com.leetcode.string.medium.a7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSortString {
    public String customSortString(String order, String s) {

        Comparator<Character> comparator = (o1, o2) -> {
            if(order.indexOf(o1) < order.indexOf(o2)) return -1;
            if(order.indexOf(o1) == order.indexOf(o2)) return 0;
            if(order.indexOf(o1) > order.indexOf(o2)) return 1;
            return -1;
        };
        List<Character> collect = s.chars().mapToObj(i -> (char) i).collect(Collectors.toList());
        collect.sort(comparator);
        return collect.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
