package in.co.singleimmutable;

public class TestImmutableSingleton extends Thread {

	public static void main(String[] args) {

		MImmutableSingleton n = MImmutableSingleton.getInstance();
		System.out.println("First Object" + n);

		MImmutableSingleton n1 = MImmutableSingleton.getInstance();
		System.out.println("Second Object" + n1);

	}
}
