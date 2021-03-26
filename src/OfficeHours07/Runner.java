package OfficeHours07;

import OfficeHours06.Movie;

public class Runner {
	//2. Create another class: Runner and do the followings
	//Create main method
	//Create 3 Movie objects and assign values of your choice.

	//Example:
	//Movie name=starWars
	//duration=120
	//isGood=true
	//And print the movie info

	public static void main(String[] args) {
		Movie starWars = new Movie();
		starWars.setName("Star Wars");
		starWars.setDuration(120);
		starWars.setGood(true);
		starWars.movieInfo();
		System.out.println("=====================");
		
		Movie braveHeart = new Movie();
		braveHeart.setName("Brave Heart");
		braveHeart.setDuration(180);
		braveHeart.setGood(false);
		braveHeart.movieInfo();
		System.out.println("=====================");
		
		Movie batman = new Movie("Batman", 100, true);
		batman.movieInfo();
		
		
		
		
	}

}