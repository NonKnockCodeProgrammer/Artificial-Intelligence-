package demo2;

import java.awt.print.Printable;

class Node{
	
	private String data;
	private Node next;
	
	public Node(String data){
		this.data = data;
		addNode(this.next);
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getData() {
		return data;
	}
	public void addNode(Node next){
		if(this.next !=null){
			
		}
	}
}


public class LinkDemo{
	public static void main(String[] args) {
		Node root = new Node("»ð³µÍ·");
		Node n1 = new Node("A");
		Node n2 = new Node("B");
		Node n3 = new Node("C");
		Node n4 = new Node("D");
		root.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		printNode(root);
		
	}
	public static void printNode(Node node){
		System.out.println(node.getData()+"\t");
		if(node.getNext() != null){
			printNode(node.getNext());		}
	}
}