package Exepction;

public class NegativPaymentExeption extends Exception {
	
	double payment;
	
	public NegativPaymentExeption(double payment) {
		//System.out.println("ERROR: Negative payment");
		this.payment = payment;
	}
	
	
	public String toString() {
		return "ERROR: Cannot use negative Payment " + payment;
	}
	
}
