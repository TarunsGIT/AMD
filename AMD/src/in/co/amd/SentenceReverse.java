package in.co.amd;

public class SentenceReverse {

	public static String Reverse(String str) {

		String input = str;
		String rev = "";

		for (int i = input.length() - 1; i >= 0; i--) {

			rev = rev + input;

		}

		return rev;

	}

	public static void main(String[] args) {

		/* String s1 = */ 
		System.out.println(Reverse("Java is programming language"));
	}
}
