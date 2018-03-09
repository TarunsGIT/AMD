package in.co.string;

public class StringRee {

	public static void main(String[] args) {

		String input = "Ashwini";
		String reverse = "";

		for (int i = input.length() - 1; i >= 0; i--) {

			reverse = reverse + input.charAt(i);

		}
		System.out.println(reverse);
	}

}
