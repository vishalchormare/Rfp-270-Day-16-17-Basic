package day16and17;

import java.util.Scanner;

import day14BasciA.LinkList;

public class UnorderList {

	public static void main(String[] args) {
		AlogrithmUtility alogrithmUtility = new AlogrithmUtility();
		LinkList linkList = new LinkList();

		String strArr[] = { "Vishal",  "Omakr",  "Vinit",   "Sawapanil"  };

		int size = strArr.length;
		for (int i = 0; i < strArr.length; i++) {
//			System.out.print(strArr[i] + " ");
			linkList.add1(strArr[i]);
		}

		
		System.out.println(linkList.show1() + " ");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter key to search");
		String key = scanner.next();
		size = linkList.searchNode(key, size);
		System.out.println(linkList.show1());
	}

}
