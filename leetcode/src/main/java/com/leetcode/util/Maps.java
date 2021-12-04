package com.leetcode.util;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class Maps {
    public static Map<Character, Long> characterLongMap(String s) {
        return s.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
