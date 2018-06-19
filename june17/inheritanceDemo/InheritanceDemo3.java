package june17.inheritanceDemo;

public class InheritanceDemo3 {
	public static void main(String a[]) {
		//LivingBeing lb = new LivingBeing();//not possible to create object of an abstract class
		//HumanBeing hb = new HumanBeing(123);
		HumanBeing emp = new Employee(12, 123456);
		emp.eatAndSleep();
		emp.whatDoYouDo();
		LivingBeing emp2 = new Employee(12, 123456);
		emp2.eatAndSleep();
		System.out.println(emp.getClass());
		System.out.println(emp.toString());
		System.out.println(emp.hashCode());
		//emp2.whatDoYouDo();
		Employee shubham = new Employee(123, 123456);
		Employee shubhamCopy  = shubham;
		System.out.println("shubham.hashCode() : "+shubham.hashCode());
		System.out.println("shubhamCopy.hashCode() : "+shubhamCopy.hashCode());
		try {
			Employee shubhamClone = (Employee) shubham.clone();
			System.out.println("shubhamClone.hashCode() : "+shubhamClone.hashCode());
			System.out.println(shubham.id);
			} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
