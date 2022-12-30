package com.hoon.blog.DesignTest.factory.SimpleFactory;

public class FactoryTestSource {
    //클라이언트는 휴대폰 공장에 휴대폰을 주문한다.
    public static void main(String[] args){
    	
    	//심플 팩토리 패턴 : 객체 생성 클래스를 따로 두는것 
    	/*패토리 메소드 패턴 : 객체를 생성하기 위한 인터페이스를 정의하는 과정에서 
    									어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정 즉, 
    									클래스의 인스턴스를 만드는 일을 서브클래스에게 맡기는 것*/
        SimplePhoneFactory simplePhoneFactory = new SimplePhoneFactory();
        Phone phone = simplePhoneFactory.orderPhone("ANDROID");
        phone.call();
    }
}
