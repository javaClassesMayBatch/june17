package june17.inheritanceDemo;

public abstract class HumanBeing extends LivingBeing {
	private int aadharNumber;
	public void printHumanDetails() {
		System.out.println("In the human class.");
	}
	
	public int getAadharNumber() {
		return this.aadharNumber;
	}
	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public HumanBeing(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	
	public abstract void whatDoYouDo();
	
	public final void breathe() {
		System.out.println("take in O2");
		System.out.println("Release CO2");
	}
	
	/*@Override
	public void eatAndSleep() {
		System.out.println("*****************");
		System.out.println("human eat veg and non veg and will sleep at their homes.");
		System.out.println("*****************");
		
	}*/
}
