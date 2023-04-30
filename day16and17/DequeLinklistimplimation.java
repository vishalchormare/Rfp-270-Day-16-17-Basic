package day16and17;

import day14BasciA.LinkList;

public class DequeLinklistimplimation<T> {
	LinkList<T> deque = new LinkList<T>();
	int size=0;

	public void insertFront(T data) {
		deque.addAtStart(data);
		size++;
	
	}

	public void insertRear(T data) {
		deque.add(data);
		size++;
		
	}
	
	public void removeFront() {
		deque.deleteAtStart();
		size++;
	}
	
	public void removeRear() {
		deque.deleteAtEnd();
		size--;
		
	}
	
	public T getFront() {
		return deque.get(--size);
	}

	/**
	 * Purpose: getting value from rear
	 * 
	 * @return returns the value
	 */
	public T getRear() {
		return deque.get(size-1);
	}
}
