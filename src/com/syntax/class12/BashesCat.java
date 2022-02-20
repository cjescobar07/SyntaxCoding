package com.syntax.class12;

public class BashesCat {

	String name; 
	String color;
	String breed; 
	char gender;
	int age;
	int weight;
	
	void printCompleteInfo() {
		System.out.println("The name of the cat is " + name);
		System.out.println("The color of the cat is " + color);
		System.out.println("The breed of the cat is " + breed);
		System.out.println("The gender of the cat is " + gender);
		System.out.println("The age of the cat is " + age);
		System.out.println("The weight of the cat is " + weight + "lbs");
		}
	
	public static void main(String[] args) {
		
		BashesCat marinette = new BashesCat();
		marinette.name = "Marinette";
		marinette.color = "yellow";
		marinette.breed = "Cheetah";
		marinette.gender = 'F';
		marinette.age = 5;
		marinette.weight = 10;
		marinette.printCompleteInfo();
		
		

	}
}
