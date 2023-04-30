package day16and17;

import java.util.Scanner;

import day14BasciA.LinkList;

public class OrderedList {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 4, 54, 67, 54 };
		AlogrithmUtility alogrithmUtility = new AlogrithmUtility();
		LinkList<Integer> linkList = new LinkList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			linkList.add(arr[i]);
		}

		int size = arr.length;
		System.out.println(linkList.show1());
		linkList.sort(size);
		System.out.println(linkList.show1());

		System.out.println("\nEnter key to search in list:");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		size = linkList.searchNode(key, size);

		scanner.close();

		System.out.println("\nSorting");
		linkList.sort(size);

		System.out.println(linkList.show1());

	}

}
