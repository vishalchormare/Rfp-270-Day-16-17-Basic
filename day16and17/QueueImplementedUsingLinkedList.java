package day16and17;

import day14BasciA.LinkList;

public class QueueImplementedUsingLinkedList<T> {

	LinkList<T> queue = new LinkList<T>();
	int index = 0;

	public void enQueue(T data) {
		queue.add(data);
		index++;
	}

	public int size() {
		return index;
	}

	public T get() {
		return queue.get(index);
	}
	
	public T get(int ind) {
		return queue.get(ind);
	}
}
