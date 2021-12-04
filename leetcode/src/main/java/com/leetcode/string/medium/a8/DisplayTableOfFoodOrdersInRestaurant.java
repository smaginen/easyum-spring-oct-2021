package com.leetcode.string.medium.a8;

import java.util.*;

public class DisplayTableOfFoodOrdersInRestaurant {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Map<String, Integer>> table = new TreeMap<>((s1, s2) -> Integer.parseInt(s1) - Integer.valueOf(s2));
        for (List<String> order : orders) {
            String num = order.get(1);
            String dish = order.get(2);
            Map<String, Integer> numOrderMap = table.getOrDefault(num, new TreeMap<>());
            numOrderMap.merge(dish, 0, (old, newV) -> old + 1);
            table.put(num, numOrderMap);
        }
        List<String> temp = new ArrayList<>();
        temp.add("Table");
        Set<String> dishes = new TreeSet<>();
        table.entrySet().forEach(e -> dishes.addAll(e.getValue().keySet()));
        List<String> finalTemp = temp;
        dishes.forEach(d -> finalTemp.add(d));
        res.add(temp);
        temp = new ArrayList<>();
        for (Map.Entry<String, Map<String, Integer>> e : table.entrySet()) {
            temp.add(e.getKey());
            List<String> finalTemp1 = temp;
            dishes.forEach(d -> finalTemp1.add(String.valueOf(e.getValue().getOrDefault(d, 0))));
            res.add(temp);
            temp = new ArrayList<>();

        }
        return res;
    }

    public static void main(String[] args) {
        List<List<String>> input = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        temp.add("David");
        temp.add("3");
        temp.add("Ceviche");
        input.add(temp);
        temp = new ArrayList<>();
        temp.add("Corina");
        temp.add("10");
        temp.add("Beef Burrito");


        List<List<String>> lists = new DisplayTableOfFoodOrdersInRestaurant().displayTable(input);
    }
}
