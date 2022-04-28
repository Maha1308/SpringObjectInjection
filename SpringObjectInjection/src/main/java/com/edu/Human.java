package com.edu;

public class Human {
	private Heart Heart;

	public Heart getHeart() {
		return Heart;
	}

	public void setHeart(Heart heart) {
		Heart = heart;
	}
	public void humanFunction()
	{
		if(Heart!=null)
		{
			Heart.pumb();
		}
		else {
			System.out.println("not alive");
		}
	}
	

}
