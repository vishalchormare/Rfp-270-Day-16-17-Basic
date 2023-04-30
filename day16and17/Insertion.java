package day16and17;

public class Insertion {

	
	public static void main(String[] args) {
		String strArr[] = { "Vishal","Omakr","Vinit","Sawapanil"};
		System.out.println("Print Before Sort");
		AlogrithmUtility.printStringArr(strArr);
		System.out.println("Print Before After Sort");
		AlogrithmUtility.stringInsertionSort(strArr);
		AlogrithmUtility.printStringArr(strArr);
	}
}
