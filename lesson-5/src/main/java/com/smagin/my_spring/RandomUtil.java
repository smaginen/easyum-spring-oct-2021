package com.smagin.my_spring;

import java.util.List;
import java.util.Random;

public class RandomUtil {
    private static Random random = new Random();


    public static <T> T getRandomElement(List<T> list) {
        int i = RandomUtil.between(0, list.size() - 1);
        return list.get(i);
    }

    public static int between(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }


}
