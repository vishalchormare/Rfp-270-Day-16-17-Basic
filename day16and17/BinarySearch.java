package day16and17;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String strArr[] = { "Vishal","Omakr","Vinit","Sawapanil"};

		AlogrithmUtility.stringInsertionSort(strArr);
		AlogrithmUtility.printStringArr(strArr);

		System.out.println("Enter key to search");
		String key = sc.next();

		int index = AlogrithmUtility.intBinarySearch(strArr, key);
		if (index >= 0) {
			System.out.println("Key found at index : " + index + " which is : " + strArr[index]);
		} else if (index == -1) {
			System.out.println("Key not found");
		}

		sc.close();
	}
}
