package day16and17;

import day14BasciA.LinkList;

public class StackImplementUsingLinkedList<T> {
	
	
	LinkList<T> stack = new LinkList<T>();
	public static int top = 0;
	
	public void push(T data) {

		stack.add(data);
		top++;

	}

	public void pop() {

		if (isEmpty()) {
			System.out.println("Stack is underflow");
		} else {
			stack.deleteAtEnd();
			top--;

		}
	}

		public T peek() {
			if (!isEmpty()) {
				T data;
				data = (T) stack.get(top);
				return data;
			}
			return null;

		}
		
		
	
	public boolean isEmpty() {

		return stack.isEmpty();
	}
	
	public int size() {
		return top;
	}
}
