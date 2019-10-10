
public class Node {
	Node next;
	Node last;
	Employee employee;
	
	public Node() {
		next = new Node();
		last = new Node();
		employee = new Employee();	
	}
	
	public Employee returnData() {
		return employee;
	}
	public void setData(Employee inEmployee) {
		
	}
}
