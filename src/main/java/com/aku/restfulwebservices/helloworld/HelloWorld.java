package com.aku.restfulwebservices.helloworld;

public class HelloWorld {
	private String message;
	
	
	public HelloWorld(String msg) {
		this.message = msg;  
	}

	public String getMsg() {
		return message;
	}


	public void setMsg(String msg) {
		this.message = msg;
	}
	
	@Override
	public String toString() {
		return "HelloWorld," + message + "!!!";
	}

}
