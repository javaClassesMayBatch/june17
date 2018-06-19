package june17;

public class VarargsDemo {
	
	public static int acceptVarArgs(int ... v) {		
		for(int number: v) {
			System.out.println(number+" ");
		}
		return v.length;
	}
	
	public static void main(String a[]) {
		int totalArguments = acceptVarArgs(11,113,111,112,423);
		System.out.println("totalArguments: "+totalArguments);
	}

}
