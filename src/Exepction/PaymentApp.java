package Exepction;

import java.util.Scanner;

public class PaymentApp {

	public static void main(String[] args) {
		
		double payment = 0;
		boolean positivepym = true;
		
		do {
			positivepym = true;
			
			System.out.print("Enter the amount: ");
			
			Scanner in = new Scanner(System.in);
			try {
			payment = in.nextDouble();
			if(payment < 0) {
				throw new NegativPaymentExeption(payment);
			}
			}catch (NegativPaymentExeption e) {
				System.out.println(e.toString());
				positivepym = false;
			}
		}while(!positivepym);
		
		System.out.println("Thank you for your payment: $" + payment);
	}
	

}
