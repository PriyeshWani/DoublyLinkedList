
public class Node {
	Node next, back;
	String val;
	Node(String val) {
		this.val = val;
		this.next = null;
		this.back = null;
	}
	
	@Override
	public String toString() {
		return this.val;
	}

	
}
