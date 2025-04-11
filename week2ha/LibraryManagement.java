package week2ha;

public class LibraryManagement {

	public static void main(String[] args) {
		
		
		Library L2 = new Library();
		String book = L2.addBook("Automation testing");
		System.out.println(book);
		L2.issueBook();
		
		
	}

}
