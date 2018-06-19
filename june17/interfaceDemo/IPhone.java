package june17.interfaceDemo;

public class IPhone extends MobileDevice{
	@Override
	public void replace() {
		System.out.println("replace with new phone");

	}

	@Override
	public void replaceAccessories() {
		System.out.println("replace with new accessories");

	}
}
