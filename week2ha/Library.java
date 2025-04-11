package week2ha;

public class Library {
	
	private static String bookname;

	public String addBook(String bookname) {
		System.out.println("book added successfully");
		return bookname;
			
			}
    
     public void issueBook () {
		
		System.out.println("Book issued Successfully"); 
		
	}
		
	public static void main(String[] args) {
		Library L1 = new Library();
		String book = L1.addBook("Automation testing");
		System.out.println(book);
		L1.issueBook();
		
		
		
	}

		
	}


