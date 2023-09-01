package com.catcafe;


public class Cat {
	    // private instance variables to store the cat's name, breed, and age
	    private String name;
	    private String breed;
	    private int age;
	    

	    
	    // constructor to set up the cat's name, breed, and age
	    public Cat(String name, String breed, int age) {
	        this.name = name;
	        this.breed = breed;
	        this.age = age;
	    }
	   

	    // accessor to return the cat's name
	    public String getName() {
	        return this.name;
	    }

	    // accessor to return the cat's breed
	    public String getBreed() {
	        return this.breed;
	    }

	    // accessor to return the cat's age
	    public int getAge() {
	        return this.age;
	    }
	
}
	
