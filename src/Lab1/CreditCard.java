package Lab1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CreditCard {

	public static void main(String[] args) {
		
		List<String[]> payment = new ArrayList<String[]>();
		
		String filename = "C:\\Users\\Gergõ\\OneDrive - Office 365\\JAVA\\creditcards.csv";
		String dataRow;
		double balance = 1500;
		DecimalFormat dec = new DecimalFormat("#0.00");
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			while((dataRow = br.readLine()) != null) {
				String[] line = dataRow.split(",");
				payment.add(line);
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(String[] pay : payment) {
			String date = pay[0];
			String type = pay[1];
			String vendor = pay[2];
			double amount = Double.parseDouble(pay[3]);
			System.out.print(date + " " + type + " " + vendor + " $" + amount + " ");
			
			if(type.equalsIgnoreCase("debit")) {
				//System.out.println("Add to balance");
				balance = balance + amount;
			}
			else if(type.equalsIgnoreCase("credit")) {
				//System.out.println("Subctract from balance");
				balance = balance - amount;
			}
			else {
				//System.out.println("Other payment");
			}
			System.out.println("New balance: $" + dec.format(balance) + "\n");
			
		}
		
		
		
		if(balance > 0) {
			System.out.println("\n\n");
			System.out.println("You have a balnce of " + dec.format(balance));
			System.out.println("You are charged 10% fee of " + balance * .10);
			System.out.println("Your new balance is: " + balance * 1.1);
		}
		else if (balance < 0) {
			System.out.println("Thank for your payment");
			System.out.println("You have overpayment of -$" + dec.format(balance));
		}
		else {
			System.out.println("Thanks for payment");
		}
		
		
		
	}

}
