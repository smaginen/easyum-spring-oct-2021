package com.smagin.my_spring;


public class BenchmarkCleanerImplWrapper implements Cleaner { //or extends CleanerImpl

    @InjectByType
    private CleanerImpl cleaner;

    @Override
    public void clean() {
        long start = System.nanoTime();
        cleaner.clean();
        long end = System.nanoTime();
        System.out.println(end-start);
    }
}
