package edu.mu;

public enum Genre {
	ROCK,
    POP,
    JAZZ,
    CLASSICAL,
    HIP_HOP,
    ELECTRONIC,
    CHILDREN;
	public static String toString(Genre genre) {
	    switch (genre) {
	        case ROCK:
	            return "ROCK";
	        case POP:
	            return "POP";
	        case JAZZ:
	            return "JAZZ";
	        case CLASSICAL:
	            return "CLASSICAL";
	        case HIP_HOP:
	        	return "HIP_HOP";
	        case ELECTRONIC:
	        	return "ELECTRONIC";
	        case CHILDREN:
	        	return "CHILDREN";
	        default:
	            return null;
	    }
	}
}