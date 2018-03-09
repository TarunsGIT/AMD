package in.co.number;

public class ReNumber {
	public static void main(String[] args) {
		int n = 120;
		int r = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			System.out.print(r);

		}

	}

}
