package june17.protectedInDetail.package2;

import june17.protectedInDetail.package1.ParentClass;

public class DifferentPackageNonChildClass {
	public static void main(String a[]) {
		ParentClass obj = new ParentClass();
		System.out.println("protected variable inside DifferentPackageNonChildClass : "+ obj.getProtectedVarible());
	}
}
