package day16and17;

import java.util.Arrays;
import java.util.HashMap;

public class AlogrithmUtility {

	public static int intBinarySearch(String arr[], String key) {
		int l = 0, r = arr.length - 1;

		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = key.compareTo(arr[m]);

			// Check if x is present at mid
			if (res == 0)
				return m;

			// If x greater, ignore left half
			if (res > 0)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		return -1;
	}

	public static void stringInsertionSort(Comparable[] objArray) {
		for (int i = 1; i < objArray.length; i++) {
			Comparable objectToSort = objArray[i];
			int j = i;
			while (j > 0 && objArray[j - 1].compareTo(objectToSort) > 1) {
				objArray[j] = objArray[j - 1];
				j--;
			}
			objArray[j] = objectToSort;
		}

	}

	public static int[] bubbleSort(int arr[]) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}

		}
		return arr;

	}

	public static void printStringArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static void meregSort(String arr[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			meregSort(arr, start, mid);
			meregSort(arr, mid + 1, end);

			mereg(arr, start, mid, end);
		}
	}

	private static void mereg(String arr[], int start, int mid, int end) {
		int p = start, q = mid + 1;

		String[] newArr = new String[end - start + 1];
		int j = 0;
		for (int i = start; i <= end; i++) {
			if (p > mid)
				newArr[j++] = arr[q++];
			else if (q > end)
				newArr[j++] = arr[p++];
			else if (arr[p].compareTo(arr[q]) < 0)
				newArr[j++] = arr[p++];

			else
				newArr[j++] = arr[q++];
		}

		for (int k = 0; k < j; k++) {
			arr[start++] = newArr[k];
		}
	}

	public boolean anagramDetction(String str1, String str2) {

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}

		return false;
	}

	public static boolean prime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isPalindrome(int num) {
		int r, sum = 0;
		int temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			return true;
		} else {
			return false;
		}
	}

	// Generic implementation of selection sort
	public static <T extends Comparable<T>> void selectionSort(T arr[]) {

		int n = arr.length;
		// One by one move boundary of unsorted subarray

		for (int i = 0; i < n - 1; i++) {

			// find the minimum element in unsorted array
			int mid = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j].compareTo(arr[mid]) < 0) {
					mid = j;

					// Swap the found minimum element with the first
					// element
					T temp = arr[mid];
					arr[mid] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static <T extends Comparable<T>> int linearSearch(T[] array, T value, int lo, int hi) {
		for (int i = lo; i <= hi; i++) {
			if (array[i].compareTo(value) == 0)
				return i;
		} // for
		return -1;
	} // linearSearch

	public static void printIntArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}
}
