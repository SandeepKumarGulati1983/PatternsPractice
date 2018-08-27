package com.pattern.Observer;

public interface Subject {

	public void register (Observer o);
	public void deRegister(Observer o);
	public void notifyObserver();
}
