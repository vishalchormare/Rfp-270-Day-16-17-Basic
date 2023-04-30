package day16and17;

public class MergeSort {

	public static void main(String[] args) {
		AlogrithmUtility alogrithmUtility = new AlogrithmUtility();

		String[] arr = { "Vishal", "Santosh", "Omkar", "Sawpanil", "Vinit", "Neha", "Astha", "Sagar", "Kirti",
				"Preeti" };
		int start = 0, end = arr.length - 1;

		alogrithmUtility.meregSort(arr, start, end);
		AlogrithmUtility.printStringArr(arr);

	}

}
