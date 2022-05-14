package com.java;

public class Human {
	private Heart heart;//Autowire bytype Heart and value in xml file must be same.

	//generate setter and getter method
	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	//generate method
	public void human_function()
	{
		if(heart!=null)
		{
			heart.pump();
		}
		else
		{
			System.out.println("Not Alive");
		}
	}

}
