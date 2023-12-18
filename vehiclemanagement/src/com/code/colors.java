package com.code;

public enum colors {

	WHITE(5000),BLACK(1000),BLUE(7500),SILVER(8000),RED(15000);
	private int cost;

	private colors(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
	
	
	
	
	
	
	
}
