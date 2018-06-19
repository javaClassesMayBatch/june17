package june17;

public class NestedClassDemo {
	
	private int outerClassInstanceVarible = 10;
	
	public void printDetails(){
		System.out.println(" Outer class details");
		System.out.println("outer varible: "+ outerClassInstanceVarible);
		System.out.println("inner varible: "+ new InnerClass().innerClassInstanceVarible);
	}
	
	static class InnerClass{
		
		int innerClassInstanceVarible = 20;
		
		public void printDetails() {
			System.out.println(" Inner class details");
			System.out.println("inner varible: "+innerClassInstanceVarible);
			System.out.println("outer varible: "+new NestedClassDemo().outerClassInstanceVarible);
		}
		
	}
	
	public static void main(String a[]) {
		NestedClassDemo outer = new NestedClassDemo();
		outer.printDetails();
		InnerClass innerClass = new InnerClass();
		innerClass.printDetails();
		//InnerClass.printDetails();
	}

}
