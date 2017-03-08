package youtube.java.library.project;

import junit.framework.TestCase;

public class BookTest extends TestCase 
{
	public void testBook() 
	{
		Book b1 = new Book("Great Expectations");
		assertEquals("Great Expectations", b1.title);
		assertEquals("unknown author", b1.author);
		
	}
	
	public void testGetPerson()
	{
		Book b2 = new Book("War And Peace");
		Person p2 = new Person();
		p2.setName("Elvis");
		
		// method to say book is loaned to this person
		b2.setPerson(p2);
		
		// get the name of the person who had the book
//		Person testPerson = b2.getPerson();
//		String testName = testPerson.getName();
		
		// this one line does the same as the two lines of code above
		String testName = b2.getPerson().getName();
		assertEquals("Elvis", testName);
	
	}
	
	public void testToString()
	{
		Book b2 = new Book("War And Peace");
		Person p2 = new Person();
		p2.setName("Elvis");
		
		assertEquals("War And Peace by unknown author ; Available", b2.toString());
		
		b2.setPerson(p2);
		assertEquals("War And Peace by unknown author ; Checked out to Elvis", b2.toString());
	}

}
