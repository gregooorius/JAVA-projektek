package DataStructor;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = {"a","b","c","d","e","f"};
		
		for (String letter : alphabet) {
			System.out.print(letter + " ");
		}
		
		System.out.println("\n");
		
		String [][] users = {
				{"Sarah","Parker", "sp@gmail.com", "51768687"},
				{"Joe", "Snow", "js@gmail.com", "91648513"},
				{"James", "Courtes","jc@gmail.com","6192429"} 
		};
		
		int numOfusers = users.length;
		int numOffields = users[0].length;
		
		System.out.println(numOfusers);
		System.out.println(numOffields);
		
		for(int i=0; i<numOfusers;i++) { 
			String firstname = users[i][0];
			String lastname = users[i][1];
			String email = users[i][2];
			String phone = users[i][3];
			System.out.println(firstname + " " + lastname + " " + email + " " + phone);
			
		}
		
		System.out.println("\n\n");
		
		for(String[] user : users) {
			System.out.print("[ ");
			for(String field : user) {
				System.out.print(field + " ");
			}
			System.out.println(" ]");
		}
	}
}

