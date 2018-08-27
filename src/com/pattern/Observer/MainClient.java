package com.pattern.Observer;

public class MainClient {

	public static void main(String[] args) {
	
		ConcreateSubject subject = new ConcreateSubject();
		subject.register(new ConcreateObserver());
		subject.publish(25, 90);

	}

}
