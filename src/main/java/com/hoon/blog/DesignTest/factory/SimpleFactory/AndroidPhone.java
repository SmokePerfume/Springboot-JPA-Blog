package com.hoon.blog.DesignTest.factory.SimpleFactory;

//안드로이드 폰
public class AndroidPhone implements Phone{
    @Override
    public void complete() {
        System.out.println("안드로이드폰 완성");
    }

    @Override
    public void call() {
        System.out.println("안드로이드폰으로 전화를 한다");
    }
}