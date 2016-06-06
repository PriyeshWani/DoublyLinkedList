import java.util.Scanner;

public class DoublyLinkedList {
	
	Node root = null;
	
	public void insert(String str) {
		Node node = new Node(str);
		if(this.root == null) {
			this.root = node;
		}
		else {
			node.next = this.root;
			this.root.back = node;
			this.root = node;
		}
		
	}
	
	@Override
	public String toString() {
		String nodeList = "";
		Node curr = root;
		while(curr != null) {
			nodeList = nodeList+curr.val+" ";
			curr = curr.next;
		}
		return nodeList; 
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		System.out.println("Enter space separated String values");
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		for(String s : input ) {
			dll.insert(s);
		}
		System.out.println("Doubly Linkedlist formed:" + dll);
	}
	
	
}
