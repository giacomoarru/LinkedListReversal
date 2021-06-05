package com.gmail.giacomo;


/**
 * Java implementation of an algorithm to reverse a LinkedList
 * @author giaarr
 *
 */
public class LinkedListReversal {

	public static void main(String[] args) {
		String[] sourceData = {"apple", "banana", "cherry", "fig", "grapefruit", "kiwi", "lime"};
		
		ListNode<String> listNode = buildLinkedList(sourceData);	
		System.out.println(listNode);
		System.out.println(reverseLinkedList(listNode));

		
	}

	static <T> ListNode<T> buildLinkedList(T[] sourceData) {
		ListNode<T> head = null;
		ListNode<T> tail = null;
		
		for (T element : sourceData) {
			ListNode<T> node = new ListNode<>(element);
			if (head == null) {
				head = node;
			} else {
				tail.setNext(node);
			}
			tail = node;
		}
		return head;
	}
	
	static <T> ListNode<T> reverseLinkedList(ListNode<T> listNode) {
		ListNode<T> previous = null;
		ListNode<T> current = listNode;
		while (current != null) {
			ListNode<T> next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}
		return previous;
		
	}
	
}
