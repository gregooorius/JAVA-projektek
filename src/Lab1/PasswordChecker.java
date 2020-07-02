package Lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordChecker {

	public static void main(String[] args) {
		
		String filename ="C:\\Users\\Gergõ\\OneDrive - Office 365\\JAVA\\Passwords.txt";
		String[] passwords = new String[13];
		File file = new File(filename);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));

			for(int i=0; i<passwords.length; i++) {
				passwords[i] = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found");
		} catch (IOException e) {
			System.out.println("ERROR: Data cannot be read");
		}
		
		for (String password : passwords) {
			System.out.println("*****\n" + password);
			boolean hasLetter = false;
			boolean hasNumber = false;
			boolean hasSpecChar = false;
			boolean hasInvalidChar = false;
			
			for(int n=0; n<password.length();n++) {
				if("0123456789".contains(password.substring(n, n+1))) {
					hasNumber = true;
				}
				else if("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n, n+1).toLowerCase())) {
					hasLetter = true;
					//System.out.println("Position " + n + "letter");
				}
				else if("@[]{}/><=()+-_.;,".contains(password.substring(n, n+1))) {
					hasSpecChar = true;
				}
				else {
					try {
						throw new InvalidCharException(password.substring(n, n+1));
					}catch(InvalidCharException e) {
						e.toString();
					}
				}
			}
			
			try {
				if (!hasNumber) {throw new NumberCriterisException(password); }
				else if (!hasLetter) {throw new LetterCriterisException(password); }
				else if (!hasSpecChar) {throw new SpecCharCriterisException(password); }
				else {System.out.println("Valid password");}
				}catch(NumberCriterisException  | LetterCriterisException  | SpecCharCriterisException e ) {
					System.out.println("Invalid Password");
					System.out.println(e.toString());
				}
				
			}
		}
		
	}


class InvalidCharException extends Exception {
	String ch;
	public InvalidCharException(String ch){
		this.ch = ch;
	}
	public String toString() {
		return "InvalidCharException " + ch;
	}
}

class NumberCriterisException extends Exception {
	String password;
	public NumberCriterisException(String password){
		this.password = password;
	}
	public String toString() {
		return "NumberCriterisException " + password;
	}
}

class LetterCriterisException extends Exception {
	String password;
	public LetterCriterisException(String password){
		this.password = password;
	}
	public String toString() {
		return "LetterCriterisException " + password;
	}
}

class SpecCharCriterisException extends Exception {
	String password;
	public SpecCharCriterisException(String password){
		this.password = password;
	}
	public String toString() {
		return "SpecCharCriterisException " + password;
	}
}






