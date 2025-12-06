package com.vipul;

public class SingleLinkedList {
	
	Node headNode;
	
	SingleLinkedList() {}
	
	SingleLinkedList(Node headNode) {
		this.headNode = headNode;
	}
	
	class Node {
		Integer data;
		Node next;
		
		Node () {}
		
		Node (Node next, Integer data) {
			this.next = next;
			this.data = data;
		}
		
		@Override
		public String toString() {
			return String.valueOf(data.intValue());
		}
	}
	
	void addElementToLinkedList (Node n) {
		if (n == null) {
			throw new NullPointerException();
		}
		if (headNode == null) {
			headNode = n;
		} else {
			// create a temporary reference to the head node
			Node lastNode = headNode;
			
			// Use the temporary reference to transverse to the last element 
			// of the Linked list by updating it. 
			while(lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = n;
		}
	}
	
	void iterateOverLinkedList() {
		if(this.headNode == null) {
			throw new IllegalArgumentException("Empty Linked List");
		}
		
		Node n = headNode;
		while (n != null) {
			System.out.print(n);
			n = n.next;
		}
		System.out.println();
		
		
		
	}
	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList(new SingleLinkedList(). new Node(null, 1));
		linkedList.addElementToLinkedList(new SingleLinkedList(). new Node(null, 2));
		linkedList.addElementToLinkedList(new SingleLinkedList(). new Node(null, 3));
		linkedList.addElementToLinkedList(new SingleLinkedList(). new Node(null, 4));
		linkedList.iterateOverLinkedList();
		
		SingleLinkedList emptyLinkedList = new SingleLinkedList();
		emptyLinkedList.iterateOverLinkedList();
		
	}
	
	
	
}
