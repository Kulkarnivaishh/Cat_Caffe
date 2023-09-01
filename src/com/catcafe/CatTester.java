package com.catcafe;

public class CatTester {
	 public static void main(String[] args) {
	        Cat cat = new Cat("Tom", "Persian", 5);
	        System.out.println("Cat Name: " + cat.getName());
	        System.out.println("Cat Breed: " + cat.getBreed());
	        System.out.println("Cat Age: " + cat.getAge());
	 }
}