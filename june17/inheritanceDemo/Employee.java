package june17.inheritanceDemo;

public final class Employee extends HumanBeing implements Cloneable{
	public int id;
	
	public void printEmployeeDetails() {
		System.out.println("In the employee class.");
	}
	
	public Employee(int id, int aadharNumber) {
		super(aadharNumber);
		this.id = id;
	}

	@Override
	public void whatDoYouDo() {
		System.out.println("i am employed at an mnc");
		
	}

	@Override
	public void eatAndSleep() {
		System.out.println("employee can eat at lunch time and will sleep after working hours only.");
	}

	/*public void eatAndSleep() {
		System.out.println("==========================");
		System.out.println("employee can eat at lunch time and will sleep after working hours only.");
		super.eatAndSleep();
		System.out.println("==========================");
		
	}*/
	
	/*public void breathe() {
		//Cannot override the final method from HumanBeing
	}*/
	
	public Object clone() throws CloneNotSupportedException	{
		return super.clone();
	}
}
