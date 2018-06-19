package june17.inheritanceDemo;

public class Animals extends LivingBeing {
	
	public void printAnimalDetails() {
		System.out.println("In the animal class.");
	}

	@Override
	public void eatAndSleep() {
		System.out.println("*****************");
		System.out.println("animals eat anything and will sleep in their caves.");
		System.out.println("*****************");
		
	}
	
}
