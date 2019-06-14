package com.jarades.musiletra.models;

public enum Reputation {
	
	VERY_BAD  (1),
	BAD		  (2),
	NOT_BAD	  (3),
	GOOD	  (4),
	VERY_GOOD (5);
	
	private final int stars;
	
	private Reputation (int stars) {
		this.stars = stars;
	}

}
