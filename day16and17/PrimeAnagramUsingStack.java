package day16and17;

public class PrimeAnagramUsingStack {
	public static void main(String[] args) {
		int start = 0;
		int end = 1000;

		StackImplementUsingLinkedList<Integer> stack = new StackImplementUsingLinkedList<Integer>();

		// putting values in array

		for (int j = start; j <= end; j++) {
			if (AlogrithmUtility.prime(j)) {
				for (int k = j + 1; k < end; k++) {
					if (AlogrithmUtility.prime(k)) {
						if (AlogrithmUtility.isAnagram(String.valueOf(j), String.valueOf(k))) {
							stack.push(j);
							stack.push(k);

						}
					}
				}

			}

		}
		// stack.show();

		int tempSize = stack.size();
		for (int i = 0; i < tempSize; i++) {
			System.out.print(stack.peek() + " ");
			if (!stack.isEmpty()) {
				stack.pop();
			}
		}

	}

}
