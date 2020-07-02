package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		String filename = "C:\\Users\\Gergõ\\OneDrive - Office 365\\JAVA\\FileReadInJAVA.txt";
		
		File file = new File(filename);
		String text = null;
		
		
		try {
			BufferedReader br = new BufferedReader(new  FileReader(filename));
			
			text = br.readLine();
			
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the data " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Finish reading the file");
		}
		
		System.out.println(text);
		
		
	}

}
