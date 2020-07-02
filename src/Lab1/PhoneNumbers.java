package Lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumbers {

	public static void main(String[] args) {
		
		String filename = "C:\\Users\\Gergõ\\OneDrive - Office 365\\JAVA\\PhoneNumbers.txt";
		
		File file = new File(filename);
		
		String[] phoneNums = new String[10];
		String PhoneNum = null;
		int i = 0;
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			for (i=0; i<phoneNums.length; i++) {
				
				phoneNums[i] = br.readLine();
			}
			br.close();
			} catch (FileNotFoundException e) {
				System.out.println("ERROR: File not found");
			} catch (IOException e) {
				System.out.println("ERROR: Cannot read data");
			}
		
		
		for(i=0; i<phoneNums.length; i++) {
			PhoneNum = phoneNums[i];
			try {
				if(PhoneNum.length() != 10) {
					throw new TenDigitsException(PhoneNum);
				}
				if(PhoneNum.substring(0, 1).equals("0") || PhoneNum.substring(0, 1).equals("9")) {
					throw new AreaCodeException(PhoneNum);
				}
				
				for(int n =0; n<PhoneNum.length()-2; n++ ) {
					if(PhoneNum.substring(n, n+1).equals("9")) {
						if(PhoneNum.substring(n+1, n+3).equals("11")) {
							throw new EmergencyCodeException(PhoneNum);
						}
					}
				}
				
				System.out.println(PhoneNum);
				}catch(TenDigitsException e) {
					System.out.println("ERROR: Phone Number is not 10 digits");
					System.out.println(e.toString());
				} catch (AreaCodeException e) {
					System.out.println("ERROR: Area Code is right");
					System.out.println(e.toString());
				} catch (EmergencyCodeException e) {
					System.out.println("ERROR: There is an Emergeny Code in the Phone Number");
					System.out.println(e.toString());
				}
		}
	}

}

class TenDigitsException extends Exception{
	String num;
	TenDigitsException(String num){
		this.num = num;
	}
	public String toString() {
		return "TenDigitsException: " + num;
	}
}

class AreaCodeException extends Exception{
	String Num;
	AreaCodeException( String Num){
		this.Num = Num;
	}
	public String toString() {
		return "AreaCodeException: " + Num;
	}
}

class EmergencyCodeException extends Exception{
	String Num;
	EmergencyCodeException( String Num){
		this.Num = Num;
	}
	public String toString() {
		return "EmergencyCodeException: " + Num;
	}
}

