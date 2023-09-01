package com.catcafe;

public class Membership {
	
	    // private instance variable to store the member's name
	    private String name;
	    // private instance variable to store the remaining number of visits
	    private int visits;

	    
	    // constructor to set up the member's name and the initial number of visits allowed
	    public Membership(String name, int visits) {
	        this.name = name;
	        // initialize the number of visits to 0 if visits is not positive
	        this.visits = visits > 0 ? visits : 0;
	    }

	    // accessor to return the member's name
	    public String getName() {
	        return this.name;
	    }

	    // accessor to return the number of remaining visits
	    public int getRemainingVisits() {
	        return this.visits;
	    }

	    // method to decide if one's membership is still valid
	    public boolean isValid() {
	        // return true if the number of remaining visits is greater than 0
	        return this.visits > 0;
	    }

	    // method to add additional visits to the remainingVisits
	    public boolean topUp(int additionalVisits) {
	        // the top-up succeeds only if the given additionalVisits is non-negative
	        if (additionalVisits >= 0) {
	            this.visits += additionalVisits;
	            return true;
	        }
	        return false;
	    }

	    // method that deducts 1 from the number of remaining visits when the membership is valid
	    public boolean charge() {
	        // the charge succeeds only if the membership is valid before charging
	        if (this.visits > 0) {
	            this.visits--;
	            return true;
	        }
	        return false;
	    }
	}
