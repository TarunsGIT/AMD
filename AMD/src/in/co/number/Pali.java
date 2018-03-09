package in.co.number;

public class Pali {
	public static void main(String[] args) {
		int num = 1231;
		int s = 0, r;
		int temp;
		temp = num;
		while (num != 0) {

			r = num % 10;
			s = (s * 10) + r;
			num = num / 10;

		}

		if (s == temp) {
			System.out.println("Pali");
		} else {
			System.out.println("Not Pali");
		}

	}

}
