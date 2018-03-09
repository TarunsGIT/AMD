package in.co.array;

public class OddINArr {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 0 };

		for (int ele : arr) {

			if (ele % 2 == 0) {
				continue;

			}
			System.out.print(" " + ele);

		}
	}

}
