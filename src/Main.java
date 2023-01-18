// Part 1

//Create a program with a class called Book, that contains at least two constructors (things you might want to initialize in your constructor include book title, author, genre, pages, etc. - you decide!)
//Create a class Main in which you house your main method.
//Create at least 4 different book objects, 2 using each constructor
//Give each book at least 3 ratings using an addRatings method (ratings should be between 0 and 5 stars). Meaning you have to create that addRatings method yourself!
//Print out all the information for each book in a neatly formatted manner
//Add comments to your code describing what is happening

// Part 2

//All the stuff above, plus:
//Instead of selecting ratings, use Math.random to assign random ratings to books (still between 0 and 5)

// Part 3

//All the stuff above, plus:
//Calculate and print the following data about the book objects that you created in your Book program/class:
//The total pages in all of your books combined
//The total number of characters (letters, symbols, and spaces) in all the book titles combined
//The first letter of each author's name, concatenated together 
//The last letter of each book's title, concatenated together 
//The average rating of all the books' average ratings 
//Comment your new code
//Ensure your output is neatly formatted

import java.lang.Math;

public class Main {

	public static void main(String[] args) {
//		Initialization of 4 books
		Book lordOfTheRings = new Book("The Lord Of The Rings");
		Book harryPotter = new Book("Harry Potter");
		Book theAlchemist = new Book("The Alchemist", "Paulo Coelho", 200);
		Book mockingbird = new Book("To Kill a Mockingbird", "Harper Lee", 300);
//		Adding random ratings
		for (int i=0; i<3;i++) {
			lordOfTheRings.addRating(random(0, 5));
			harryPotter.addRating(random(0, 5));
			theAlchemist.addRating(random(0, 5));
			mockingbird.addRating(random(0, 5));
		}
//		Display total recorded pages
		System.out.println("total pages: " + Book.totalPages);
		String names = theAlchemist.author.substring(0, 1) + mockingbird.author.substring(0, 1);
		System.out.println("First letter of names: " + names);
		String titles = lastIndexOf(lordOfTheRings.title) + lastIndexOf(harryPotter.title) + lastIndexOf(theAlchemist.title) + lastIndexOf(mockingbird.title);
		System.out.println("Last Index Of Titles: " + titles);
//		Average Ratings
		System.out.println("=== Average Ratings ===");
		System.out.println("Rings: " + lordOfTheRings.averageRating());
		System.out.println("Harry Potter: "+ harryPotter.averageRating());
		System.out.println("The Alchemist: " + theAlchemist.averageRating());
		System.out.println("Mockingbird: " + mockingbird.averageRating());
	}
	
	
	
	
	
	
	public static int random(int low, int high) {
		return (int) (Math.random() * (high - low + 1) + low);
	}
	public static String lastIndexOf(String str) {
		return str.substring(str.length() - 1);
	}
}
