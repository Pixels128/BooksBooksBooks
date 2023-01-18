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



public class Book {
//	Initialize the internal variables.
	String title;
	String author;
	int[] ratings = new int[0];
	public static int totalPages = 0;
//	Create constructors for books initialized with titles or titles and authors.
	public Book(String title){
		this.title = title;
	}
	
	public Book(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		Book.totalPages += pages;
	}
//	AddRating will append a new integer rating to the end of the ratings list.
	public void addRating(int number) {
//		Calculate the new length of the ratings list.
		int newLength = this.ratings.length + 1;
		int[] temp = new int[newLength];
//		Copy all of the old ratings into a temp array that is longer.
		for (int i=0; i<this.ratings.length; i++) {
			temp[i] = this.ratings[i];
		}
//		Set the last element of the temp array to the newest rating
		temp[newLength-1] = number;
//		Set the ratings equal to the modified temp array.
		this.ratings = temp;
	}
	
	public String toString() {
//		Return the string that represents the Book.
		return "Title: " + this.title + "\nAuthor: " + this.author;
	}
	public double averageRating() {
		double sum = 0;
		double total = 0;
		for (int i=0; i<this.ratings.length;i++) {
			total += 1;
			sum += this.ratings[i];
		}
		return sum / total;
	}
	
	
}
