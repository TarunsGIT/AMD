package in.co.array;

public class LargestINArr {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int greatest = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > greatest) {
				greatest = arr[i];
			}

		}
		System.out.println(greatest);

	}
}
