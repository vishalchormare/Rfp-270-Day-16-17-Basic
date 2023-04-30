package day16and17;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 45, 44, 67, 98, 66 };
		System.out.println("Print Before Bubble Sorting");
		AlogrithmUtility.printIntArr(arr);
		System.out.println("Print After Bubble Sorting");
		AlogrithmUtility.bubbleSort(arr);
		AlogrithmUtility.printIntArr(arr);

	}

}

