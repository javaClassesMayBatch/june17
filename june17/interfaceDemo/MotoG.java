package june17.interfaceDemo;

public class MotoG extends MobileDevice {

	@Override
	public void replace() {
		System.out.println("replace the faulty part");

	}

	@Override
	public void replaceAccessories() {
		System.out.println("replace with new accessories only in first 6 months");

	}

}
