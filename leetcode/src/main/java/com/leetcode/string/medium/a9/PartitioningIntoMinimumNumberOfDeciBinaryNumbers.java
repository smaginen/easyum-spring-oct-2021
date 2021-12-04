package com.leetcode.string.medium.a9;

import java.util.Comparator;
import java.util.Optional;

public class    PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        return n.chars().mapToObj(ch -> ch - '0').max(Comparator.naturalOrder()).get();
    }
}
