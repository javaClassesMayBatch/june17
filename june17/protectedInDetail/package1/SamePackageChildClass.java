package june17.protectedInDetail.package1;

import june17.protectedInDetail.package1.ParentClass;

public class SamePackageChildClass extends ParentClass{

	public static void main(String a[]) {
		ParentClass obj = new ParentClass();
		System.out.println("protected variable inside SamePackageChildClass : "+ obj.protectedVarible);
	}
}
