package june17.protectedInDetail.package1;

public class SamePackageNonChildClass {

	public static void main(String a[]) {
		ParentClass obj = new ParentClass();
		System.out.println("protected variable inside SamePackageNonChildClass : "+ obj.protectedVarible);
	}
}
