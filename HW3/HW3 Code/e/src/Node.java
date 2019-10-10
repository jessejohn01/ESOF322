
public class Node {

	int content;
	
	public Node() {
		Node left = new Node();
		Node right = new Node();
	}
	
	public int returnContent() {
		
		return content;
	}
	
	public void setContent(int in) {
		content = in;
	}
}
