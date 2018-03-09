package in.co.number;

public class Armst {
	public static void main(String[] args) {
		int num = 371;
		int temp = 0;
		int s = 0, r;
		temp = num;

		while (num != 0) {

			r = num % 10;
			num = num / 10;
			s = s + (r * r * r);

		}

		if (s == temp) {
			System.out.println("Arm");
		} else {
			System.out.println("NARM");
		}
	}
}
