package Lab1;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSV {

	public static void main(String[] args) {
		
		List<String[]> data = new ArrayList<String[]>();
		
		String filename = "C:\\Users\\Gerg�\\OneDrive - Office 365\\JAVA\\CSVFile.csv";
		String datarow;
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			while ((datarow = br.readLine()) != null) {
				String[] line = datarow.split(",");
				data.add(line);
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		for(String[] account : data) {
			System.out.print("[ ");
			for(String field : account) {
				System.out.print(field + " ");
			}
			System.out.println(" ]");
		}
	}

}
