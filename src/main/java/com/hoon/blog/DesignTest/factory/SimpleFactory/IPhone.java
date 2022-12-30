package com.hoon.blog.DesignTest.factory.SimpleFactory;

//아이폰
public class IPhone implements Phone{
	
    @Override
    public void complete() {
        System.out.println("아이폰 완성");
    }

    @Override
    public void call() {
        System.out.println("아이폰으로 전화를 한다");
    }
}
