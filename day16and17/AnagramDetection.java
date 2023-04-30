package day16and17;

public class AnagramDetection {
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "dcba";

		AlogrithmUtility alogrithmUtility = new AlogrithmUtility();
		boolean isAnagram = alogrithmUtility.anagramDetction(str1, str2);

		if (isAnagram) {
			System.out.println("Two String are anagram");

		} else {
			System.out.println("Two String are not anagram");

		}
	}

}
