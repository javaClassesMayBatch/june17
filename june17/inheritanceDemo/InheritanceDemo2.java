package june17.inheritanceDemo;

public class InheritanceDemo2 {
	public static void main(String a[]) {
		Employee emp = new Employee();
		HumanBeing arun = new Employee();
		LivingBeing shubham = new Employee();
			
		emp.eatAndSleep();
		arun.eatAndSleep();
		shubham.eatAndSleep();
		
	}

}
