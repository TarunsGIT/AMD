package in.co.number;

public class Prime {
	public static void main(String[] args) {
		int num = 11;
		int c;
		for (c = 2; c <= num - 1; c++) {

			if (num % c == 0) {
				System.out.println("N PRIME");
				break;
			}

		}
		if (c == num) {
			System.out.println("Prime");

		}
	}

}
