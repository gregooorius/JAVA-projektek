package Lab1;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("374261425", 1000);
		BankAccount acc2 = new BankAccount("789162758", 500);
		BankAccount acc3 = new BankAccount("619152825", 700);
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		
		System.out.println(acc1.toString());
		
	}
}

class BankAccount implements IInteres{
	//properties
	private static int iD = 999;
	private String accountNumber;
	private static final String routingNumber = "005700783";
	private String SSN;
	private String name;
	private double balance;
	
	
	
	
	//constructor
	public BankAccount (String SSN, double  initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0,2);
		System.out.println(accountNumber);
	}
	
	
	 //set and get name
	public void setName(String name) {
		this.name = name;
	}
	public String getName () {
		return name;
	}
	
	
	//methodes
	public void payBill(double amount) {
		System.out.println("Paying bill: $" + amount);
		balance = balance - amount;
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making deposit: $" + amount);
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing NUmber: " + routingNumber + "]\n" + "[Balance " + balance + "]";
	}
	 
	
 }


