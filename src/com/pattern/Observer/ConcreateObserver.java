package com.pattern.Observer;

public class ConcreateObserver implements Observer{

	@Override
	public void update(int temp, int humadity) {
		
		System.out.println( "Published temperature is : "+ temp + " degree.  " + "And published humedity is : "+ humadity + " %");
		
	}

}
