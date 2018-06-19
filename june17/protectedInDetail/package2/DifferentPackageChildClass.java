package june17.protectedInDetail.package2;

import june17.protectedInDetail.package1.ParentClass;

public class DifferentPackageChildClass extends ParentClass{
	public static void main(String a[]) {
		System.out.println("protected variable inside DifferentPackageChildClass : "+ protectedVarible);
	}
}
