
public class Cities {

	public static void main(String[] args) {
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);

		System.out.println("**************");
		
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		
		System.out.println("I making some changes");
		
		
		
		do {
			System.out.println(states[i]);
			i = i + 1;
		} while (i < 5);
		
		System.out.println("**************");

		int n = 0;
		boolean statefound = false;
		while(!statefound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("STATE FOUND");
				statefound = true;
			}
			n++;
		}
		System.out.println("\n**************");

		for (int x = 0; x < 5; x++) {
		System.out.println(states[x]);
		}
	}
		
}
