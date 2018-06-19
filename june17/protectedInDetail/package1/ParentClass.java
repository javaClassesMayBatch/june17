package june17.protectedInDetail.package1;

public class ParentClass {
	static protected int protectedVarible = 10;
	
	public int getProtectedVarible() {
		return this.protectedVarible;
	}
	public void setProtectedVariable(int protectedVarible) {
		this.protectedVarible = protectedVarible;
	}
	
	public static void main(String a[]) {
		ParentClass obj = new ParentClass();
		System.out.println("protected variable inside same class : "+ obj.protectedVarible);
	}
}
