package demo5;
class Binarytree{
	class Node{
		private Comparable data;
		private Node left;
		private Node right;
		
		public void addNode(Node newNode){
			if(newNode.data.compareTo(this.data)<0){
				if(this.left == null){
					this.left=newNode;
				}else{
					this.left.addNode(newNode);
				}			
			}//�Ƚ��Ƿ���ڸ��ڵ�  С�ڵķ���������   ���ڻ���ڵķ���������
			
			if(newNode.data.compareTo(this.data)>0){
				if(this.right == null){
					this.right = newNode;
				}else{
					this.right.addNode(newNode);
				}
			}			
		}
		
		public void printNode(){
			if(this.left != null){  //���������
			this.left.printNode();
			}
			
			System.out.print(this.data+"  ");//������ڵ�i
			
			if(this.right !=null){//���������
			this.right.printNode();
			}
		}		
	}
	private Node root;
	public void add(Comparable data){
		Node newnode = new Node();
		newnode.data = data;
		if(root == null){
		root = newnode;
		}else{
			root.addNode(newnode);
		}		
	}
	public void proot(){
		this.root.printNode();
	}
}


public class TestComparableDemo {
	public static void main(String[] args) {
		Binarytree bt = new Binarytree();
		bt.add(18); bt.add(1);
		bt.add(8);	bt.add(7);
		bt.add(20);	bt.add(28);
		bt.add(4);	bt.add(7);
		bt.add(1);	bt.add(36);
		System.out.println("�����Ľ��");
		bt.proot();
		
	}
}
