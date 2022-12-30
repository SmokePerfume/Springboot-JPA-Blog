package com.hoon.blog.DesignTest.singleton;

public class Singleton {

    // 생성자 호출되지 않도록 private으로 
    private static Singleton instance;

    private Singleton() {
        System.out.println("객체 생성됨");
    }
    // new Singleton().getInstance() -> Singleton 객체 반환 
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    // 객체.doSomething()
    public void doSomething() {
        System.out.println("Something is Done.");
    }
}