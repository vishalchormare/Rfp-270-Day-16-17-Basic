package day16and17;

public class PrimeNumber {
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			if (AlogrithmUtility.prime(i)) {
				System.out.println(i + "  ");
			}
		}
	}

}
