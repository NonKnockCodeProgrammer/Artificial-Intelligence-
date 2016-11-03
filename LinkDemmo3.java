package demo2;

class Link {

	class Node {// Node start

		private String data;

		private Node next;

		public Node(String data) {
			this.data = data;
		}

		public void add(Node newNode) {
			if (this.next == null) {
				this.next = newNode;
			} else {
				this.next.add(newNode);
			}
		}

		public void print() {
			System.out.print(this.data + "  ");
			if (this.next != null) {
				this.next.print();
			}
		}
	}// Node end

	private Node root=null;
	public void addNode(String data) {
		Node newNode = new Node(data);
		if (this.root == null) {
			this.root = newNode;
		} else {
			this.root.add(newNode);
		}
	}

	public void printNode() {
		if (this.root != null) {
			this.root.print();
		}
	}
}// LinkDemo3 end

public class LinkDemmo3 {
	public static void main(String[] args) {
		Link l = new Link();
		l.addNode("A");
		l.addNode("B");
		l.addNode("C");
		l.addNode("D");
		l.addNode("E");
		System.out
				.println("==============================================================  ");
		System.out
				.println("                                                 É¾³ýÇ°          ");
		System.out
				.println("==============================================================  ");
		l.printNode();

		System.out.println(" ");
		System.out
				.println("================================================================ ");
		System.out
				.println("                                                  É¾³ýºó");
		System.out
				.println("================================================================ ");
		l.printNode();
		System.out.println(" ");

	}
}
