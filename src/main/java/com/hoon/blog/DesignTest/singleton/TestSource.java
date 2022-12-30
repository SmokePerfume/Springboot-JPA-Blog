package com.hoon.blog.DesignTest.singleton;


public class TestSource {

    public static void main(String[] args) {
    	//싱글톤 패턴 : 객체를 메모리에 올려 단한번만 사용
        // Singleton s1 = new Singleton();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1 == s2)
            System.out.println("동일함"); 
        else 
            System.out.println("다름");
        s1.doSomething();
        // 결과  : 동일함 	,why? 메모리에 올라간 동일 객체이므로
        
    }

}