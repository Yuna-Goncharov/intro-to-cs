

public class Link {
	private int data;
	private Link next;
	
	public Link(int data, Link next) {
		super();
		this.data = data;
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Link getNext() {
		return next;
	}
	public void setNext(Link next) {
		this.next = next;
	}
	
	
}
