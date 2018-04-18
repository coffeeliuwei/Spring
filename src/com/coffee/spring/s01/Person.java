package com.coffee.spring.s01;

public class Person {
private IHello helloMessage;

public IHello getHelloMessage() {
	return helloMessage;
}

public void setHelloMessage(IHello helloMessage) {
	this.helloMessage = helloMessage;
}

public String sayHello() {
	return this.helloMessage.sayHello();
}
}
