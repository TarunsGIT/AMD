package in.co.string;

public class SFirstLast {

	public static void main(String[] args) {
		String input = "Arunima";
		String reverse = "";
		String ainput = input.substring(1, input.length() - 1);
		System.out.println(ainput);

		for (int i = ainput.length() - 1; i >= 0; i--) {
			reverse = reverse + ainput.charAt(i);
		}
		System.out.println(reverse);

	}
}
