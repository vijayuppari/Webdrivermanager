import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


// Broken Links


public class interviewpractice {

	public static void main(String[] args) {

		int a[] = new int[] { 2, 3, 4, 2, 3, 5, 1,5};
		// reveseofnum(123);
		// reveseofnum(123);
		// Armstrong(123);
		// printprimenumbers(50);
		printduplcates(a);

	}

	// revere of num
	public static void reveseofnum(int num) {

		int reminder, sum = 0;

		while (num > 0) {

			reminder = num % 10;
			num = num / 10;
			sum = sum * 10 + reminder;
		}

		System.out.println(sum);
	}

	// Armstrong num
	public static void Armstrong(int num) {

		int reminder, sum = 0;

		while (num > 0) {

			reminder = num % 10;
			num = num / 10;
			sum = sum + (reminder * reminder * reminder);
		}

		System.out.println(sum);
	}

	// Sum of num
	public static void sumofnum(int num) {

		int reminder, sum = 0;

		while (num > 0) {

			reminder = num % 10;
			num = num / 10;
			sum = sum + reminder;
		}

		System.out.println(sum);
	}

	public static boolean IsPrime(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void printprimenumbers(int num) {

		for (int i = 2; i <= num; i++) {
			if (IsPrime(i)) {
				System.out.println(i + " ");
			}
		}

	}

	// Remove values in an Array
	public static void removeduplicates(int arr[]) {

		Set<Integer> hset = new HashSet<>();
		for (Integer it : arr) {
			if (!hset.contains(it)) {
				hset.add(it);
			}
		}
		System.out.println(hset);

	}

	// Print duplicate values in an Array
	public static void printduplcates(int arr[]) {

		List<Integer> ls= new ArrayList<Integer>();
		Set<Integer> hset = new HashSet<>();
		for (Integer it : arr) {
			if (hset.add(it)==false) {
				ls.add(it);
			}
		}
		System.out.println(ls);
	}

}
