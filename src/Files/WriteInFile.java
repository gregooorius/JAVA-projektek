package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

	public static void main(String[] args) {
		String filename = "C:\\Users\\Gergõ\\OneDrive - Office 365\\JAVA\\WriteInFromJAVA.txt";
		String msg = "I writing something in this File";
		
		File file = new File (filename);
		
		
		try {
			
			FileWriter fw = new FileWriter(filename);
			
			fw.write(msg);
			
			fw.close();
		} catch (IOException e) {
			System.out.println("ould not read file");
			e.printStackTrace();
		}finally {
			System.out.println("ClosedFile");
		}
		
		
	}

}
