package getSetValue;

public class Main {

	private static int a = 0;
	public static void main(String[] args) {
		System.out.println(a);

		Value1 v1 = new Value1();
		//v1.changeValue();
		Value1.changeValue();
		System.out.println(v1.a);
	}

}
