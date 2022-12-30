package com.hoon.blog.DesignTest.factory.SimpleFactory;

public class SimplePhoneFactory {
	  public Phone orderPhone(String type) {
	        Phone phone = createPhone(type);
	        phone.complete();
	        return phone;
	    }
	    private Phone createPhone(String type) {
	        return switch (type) {
	            case "IPHONE" -> new IPhone();
	            case "ANDROID" -> new AndroidPhone();
	            default -> null;
	        };
	    }
}
