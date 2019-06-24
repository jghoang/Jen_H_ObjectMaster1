package com.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human ninja = new Human();
		Human samurai = new Human();
		Human wizard = new Human();
		
		//this is implementing the attack method
		ninja.attack(samurai);
		wizard.attack(ninja);
		samurai.attack(wizard);
		ninja.attack(wizard);
		
		//this will display their current health after attacks
		ninja.displayHealth();
		samurai.displayHealth();
		wizard.displayHealth();
	}

}
