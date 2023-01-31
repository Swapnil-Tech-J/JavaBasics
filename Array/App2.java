package Array;

public class App2 {

	public static void main(String[] args) {
		
		String[] stringArray = {"Chaand", "John", "Pooja", "Mia", "Salim","Angel"};
		
		for(int i=0; i<stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		for(String name: stringArray) {
			System.out.println(name);
		}
		

	}

}
