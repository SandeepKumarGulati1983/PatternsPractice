package com.pattern.Observer;

import java.util.ArrayList;

public class ConcreateSubject implements Subject {

	ArrayList<Observer> observerList = new ArrayList<Observer>();
	int temp;
	int humedity;

	@Override
	public void register(Observer o) {

		observerList.add(o);
	}

	@Override
	public void deRegister(Observer o) {
		if (observerList.size() >= 0) {
			observerList.remove(o);
		}

	}

	@Override
	public void notifyObserver() {

		for (Observer o : observerList) {
			o.update(temp, humedity);
		}

	}

	
	
	public void publish (int temp , int humadity) {
		this.temp = temp;
		this.humedity = humadity;
		notifyObserver();
	}

}
