package com.demo.designpattern.singleton.after.threadsafe.enums;

import java.util.Arrays;
import java.util.HashSet;

public class ThreadTestDrive {
    public static void main(String... args) {
        int size = 100;
        var threads = new ThreadTest[size];

        for (int i = 0; i < size; i++) {
            threads[i] = new ThreadTest();
        }

        for (ThreadTest thread : threads) {
            thread.start();
        }

        System.out.println("result size = " +
                new HashSet<>(Arrays.stream(threads).map(ThreadTest::getInstanceResult).toList()).size()
        );
    }
}
