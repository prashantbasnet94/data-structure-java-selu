
public class Node {
	int value;
	 Node left;
	Node right;
	
	
	
	public Node(int value) {
		this.value=value;
		this.left =null;
		this.right =null;
	}
	
//	public String toString() {
//		return "value: "+value+ "left: "+left+"right: "+right;
//		
//	}
	@Override
	public String toString() {
		
		
		return " {value=" + value + ", left=" + left + ", right=" + right + "}";
	}
	 
}
