
class Node {
	int data = 0;
	Node nextElement;

	Node(int input) {
		data = input;
		nextElement = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
