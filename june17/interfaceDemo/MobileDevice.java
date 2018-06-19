package june17.interfaceDemo;

public abstract class MobileDevice implements ElectronicAppliance{

	@Override
	public void checkWarrenty() {
		System.out.println("the device has only one year warrenty.");	
	}
	
	public abstract void replaceAccessories();

}
