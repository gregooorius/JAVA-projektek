package Lab1;

public class StudentDatabase {

	public static void main(String[] args) {
		
		Student stud1 = new Student("Joe", "24345691");
		
		stud1.showCourses();
		
		stud1.enroll("HTML");
		stud1.enroll("JAVA");
		stud1.enroll("HTTP");
		stud1.enroll("CSS");

		stud1.showCourses();
		
		stud1.checkBalance();
		
		stud1.pay(3000);
		
		System.out.println("\n");
		
		stud1.setCity("Budapest");
		stud1.setPhone("+345589238");
		stud1.setState("Pest");
		
		System.out.println(stud1.getCity() +"\n"+ stud1.getPhone() +"\n"+ stud1.getState());
		
		System.out.println("\n");
		
		System.out.println(stud1.toString());

	}

}

class Student {
	private String name;
	private static int ID = 99;
	private String email ;
	private String SSN;
	private String userID;
	private double balance;
	//private String[] courses = {"JAVA","HTML", "CSS"};
	private String course="";
	private static final int costofCourse = 800;
	
	private String phone;
	private String city;
	private String state;
	
	
	//Constructor
	public Student (String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		ID++;
		setEmail();
		setUserID(SSN, ID);
	}
	private void setEmail() {
		email = name.toLowerCase() + "@shcool.com";
		System.out.println("Email: " + email);
	}
	public String getEmail() {
		return email;
	}
	
	private void setUserID(String SSN, int ID) {
		int min = 1000;
		int max = 9000;
		int random = (int) (Math.random() * (max-min));
		random = random + min;
		userID = ID + "" + random + SSN.substring(4,8);
		System.out.println("YOUR UserID: " + userID);
	}
	
	//set and get
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
	//Methods
	public void enroll(String subject) {
		/*boolean exist = true;
		for ( int i = 0; i<courses.length; i++) {
			if(subject == courses[i]) {
				exist = false;
				balance = balance + 500;
				checkBalance();
				System.out.println("Thank for Enroll " + subject );
			}
			
		}	
		if(exist)
			System.out.println("We don't have this course " + subject);*/
		this.course = this.course + "\n" + subject;
		balance = balance + costofCourse;
		
	}
	
	public void pay(int deposit) {
		balance = balance - deposit;
		System.out.println("Payment accepted");
		checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("Your balance is: $" + balance);
	}
	
	public void showCourses() {
		/*for (int i = 0; i<courses.length; i++) {
			System.out.println(courses[i]);
			
		}*/
		System.out.println(course);
	}
	
	@Override
	public String toString() {
		return "[NAME: " + name + "]\n" + "[Email: " + email + "]\n" + "[UserID: " + userID + "]\n" + "[Balance: $" + balance + "]";
	}
	
	
}
