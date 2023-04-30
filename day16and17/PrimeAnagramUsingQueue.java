package day16and17;

public class PrimeAnagramUsingQueue {
	public static void main(String[] args) {
		int start = 0;
		int end = 1000;
		QueueImplementedUsingLinkedList<Integer> queue = new QueueImplementedUsingLinkedList<Integer>();
		// putting values in array

		for (int j = start; j <= end; j++) {
			if (AlogrithmUtility.prime(j)) {
				for (int k = j + 1; k < end; k++) {
					if (AlogrithmUtility.prime(k)) {
						if (AlogrithmUtility.isAnagram(String.valueOf(j), String.valueOf(k))) {
							queue.enQueue(j);
							queue.enQueue(k);

						}
					}
				}

			}

		}

		int tempSize = queue.size();
		for (int i = 0; i < tempSize; i++) {
			System.out.print(queue.get(i) + " ");
		}
	}
}
