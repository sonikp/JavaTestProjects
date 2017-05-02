package youtube.java.library.project;

public class MyLibraryMain
{
	public static void main(String[] args) 
	{
		// create a new MyLibrary
		MyLibrary testLibrary = new MyLibrary("Test Drive Library");
		Book b1 = new Book("War And Peace");
		Book b2 = new Book("Great Expectations");
		b1.setAuthor("Tolstoy");
		b2.setAuthor("Dickens");
		Person jim = new Person();
		Person sue = new Person();
		jim.setName("Jim");
		sue.setName("Sue");
		
		testLibrary.addBook(b1);
		testLibrary.addBook(b2);
		testLibrary.addPerson(jim);
		testLibrary.addPerson(sue);
		
		System.out.println("\nAction: Create new library");
		testLibrary.printStatus();
		
		System.out.println("\nAction: Check out War And Peace to Sue");
		testLibrary.checkOut(b1, sue);
		testLibrary.printStatus();
		
		System.out.println("\nAction: Check in War And Peace from Sue"
				+ " Check out Dickens to Jim");
		testLibrary.checkIn(b1);
		testLibrary.checkOut(b2, jim);
		testLibrary.printStatus();
	}
}