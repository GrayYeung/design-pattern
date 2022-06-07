package com.demo.designpattern.singleton.after.threadsafe.synchronizedmethod;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
