package Array;

public class App5 {

	public static void main(String[] args) {
		String[] names = {"Chaand", "John", "Steeve", "Pooja", "Rahul"};
		App5 app = new App5();
		app.displayNames(names);
		System.out.println("***********");
		System.out.println(names[0]);
		
	}
	
	void displayNames(String[] names) {
		names[0] = "Salim";
		for(String name: names) {
			System.out.println(name);
		}
		
	}

}
