
public class Stringa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Ring";
		
		if(bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word: " + wordChoice);
		}
		String browser = "Chrome";
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("The browser is Chrome");
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "936284186";
		
		
		System.out.println("There are " + SSN.length() + " digits in your SSN");
		
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 3));
		System.out.print(SSN.substring(5));

	}

}
