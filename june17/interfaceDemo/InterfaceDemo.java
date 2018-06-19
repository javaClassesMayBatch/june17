package june17.interfaceDemo;

public class InterfaceDemo {
	
	public static void main(String a[]) {
		MotoG motoG = new MotoG();
		IPhone iPhone = new IPhone();
		motoG.checkWarrenty();
		motoG.replace();
		motoG.replaceAccessories();
		iPhone.checkWarrenty();
		iPhone.replace();
		iPhone.replaceAccessories();
	}

}
