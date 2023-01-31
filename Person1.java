package CoreConcept;

public abstract class Person1 implements IsAlive,LiveLife {

	public void speak() {
		System.out.println("Shares his/her thoughts.");
	}
	@Override
	public void breathe() {
		System.out.println("Be alive; remain living.");
	
}
	@Override
	public void message() {
		System.out.println("Life is a journey, keep moving and meet new people.");
		
	}
	public abstract void eat();
}

