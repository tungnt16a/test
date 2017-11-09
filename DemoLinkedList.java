
public class DemoLinkedList {
	Node head;

	// Question 1: append an element into linkedlist
	public void appendElement(int element) {
		Node node = new Node(element);
		if (head == null) {
			head = new Node(element);
			return;
		}
		node.nextElement = null;

		Node last = head;
		while (last.nextElement != null){
			last = last.nextElement;
		}
		last.nextElement = node;
		return;
	}
	
	private void deleteNode(int key) {
		Node temp = head; 
		Node preNode = null;
		if (temp != null && temp.data == key) {
			head = temp.nextElement; 
			return;
		}
		while (temp != null && temp.data != key) {
			preNode = temp;
			temp = temp.nextElement;
		}

		if (temp == null){
			return;
		}
		preNode.nextElement = temp.nextElement;
	}


	//Question 3
	public void deleteElementGreaterThan(int input) {
		if (head == null || head.nextElement == null) {
			   return;
			  }
		Node node = head;
		while (node != null) {
			if (node.data > input) {
				this.deleteNode(node.data);
				node = node.nextElement;
			} else {
				node = node.nextElement;
			}
		}
	}
//2. Remove the tail element from a linkedlist
	public void deleteLast() {
		Node node = head;
		int a = 0;
		while(node !=null) {
			a=node.data;
			if(node.nextElement != null) {
				node = node.nextElement;
			} else {
				this.deleteNode(a);
				return;
			}
		}
	}

	public void printList() {
		Node node = head;
		while (node != null) {
			System.out.println(node.data + " ");
			node = node.nextElement;
		}
	}

	public static void main(String[] args) {
		DemoLinkedList lst = new DemoLinkedList();
		// question 1: append element into linkedlist
		lst.appendElement(1);
		lst.appendElement(2);
		lst.appendElement(3);
		lst.appendElement(4);
		lst.appendElement(5);
		System.out.println("Question1");
		lst.printList();
		//2. Remove the tail element from a linkedlist
		lst.deleteLast();
		System.out.println("Question2");
		lst.printList();
		//3. Remove all element in the linkedlist that is great than a target value
		lst.deleteElementGreaterThan(2);
		System.out.println("Question3");
		lst.printList();
	}
}
