package com.gmail.giacomo;

public class ListNode<T> {

	private T data;
	private ListNode<T> next;
	
	ListNode(T data) {
		this.data = data;
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ListNode<T> getNext() {
		return next;
	}

	public void setNext(ListNode<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "[data=" + data + ", next=" + next + "]";
	}

}
