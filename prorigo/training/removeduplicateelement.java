package assignment2;

public class removeduplicateelement {

	public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];

		for (int i = 0; i < j; i++) { // Changing original array
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 }; // inizilation array
		int length = arr.length;
		length = removeDuplicateElements(arr, length);// method calling 

		for (int i = 0; i < length; i++) // printing array elements
			System.out.print(arr[i] + " ");
	}
}
