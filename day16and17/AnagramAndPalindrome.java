package day16and17;

public class AnagramAndPalindrome {

	public static void main(String[] args) {

		AlogrithmUtility alogrithmUtility = new AlogrithmUtility();

		for (int i = 0; i < 1000; i++) {
			if (alogrithmUtility.prime(i)) {
				for (int j = i; j < 1000; j++) {
					if (i != j) {
						if (AlogrithmUtility.prime(j)) {
							if (alogrithmUtility.isPalindrome(j)) {
								if (alogrithmUtility.anagramDetction(String.valueOf(i), String.valueOf(j))
										&& alogrithmUtility.isPalindrome(j)) {
									System.out.println(i + " " + j + " is prime and anagram and palindrome");

								}
							}
						}
					}
				}
			}
		}
	}

}
