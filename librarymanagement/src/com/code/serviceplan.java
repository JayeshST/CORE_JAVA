package com.code;

public enum serviceplan {
SILVER(1000),GOLD(2000),DIAMOND(3000),PLATINUM(4000);
	
	private int cost;

	private serviceplan(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
