package june17.inheritanceDemo;

public class InheritanceDemo {
	public static void main(String a[]) {
		//parent class ke reference variable mein 
		//child class ki reference id store kar sakte hai
		LivingBeing lb = new LivingBeing();
		HumanBeing hb = new HumanBeing();
		Employee emp = new Employee();
		Animals animal = new Animals();
		//hb is a reference vaible
		//hb is storing the reference id of object created by new HumanBeing();
		//HumanBeing arun = new LivingBeing(); // cannot assign parent class refId to child class refVar
		HumanBeing arun = new Employee();
		LivingBeing shubham = new Employee();
		
		emp.printEmployeeDetails();
		emp.printHumanDetails();
		emp.printLivingDetails();
		
		arun.printHumanDetails();
		arun.printLivingDetails();
		
		shubham.printLivingDetails();
		System.out.println();
		System.out.println();
		
		emp.eatAndSleep();
		hb.eatAndSleep();
		lb.eatAndSleep();
		animal.eatAndSleep();
		
	}
}
