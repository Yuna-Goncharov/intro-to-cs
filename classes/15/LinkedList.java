
public class LinkedList {
	private Link head;

	public LinkedList() {
		head = null;
	}
	
	public void add (int data) {
		head = new Link(data, head);
	}
	
	@Override
	public String toString() {
		String str = "head==>";
		Link p = head;
		while(p != null) {
			str += p.getData() + "==>";
			p = p.getNext();
					
		}
		return str+"null";
	}
	
	public void addLast(int data) {
		Link newLink = new Link(data, null);
		if (head == null) {
			head = newLink;
		} else {
			Link p = head;
			while (p.getNext() != null) {
				p = p.getNext();
			}
			// p is the last link
			p.setNext(newLink);
		}
	}
	
	//add new link in position pos - 1 is the first 
	public boolean add(int data, int pos) {
		if (pos < 1) {
			return false;
		}
		if(pos == 1) {
			add(data);
			return true;
		}
		Link p = head;
		pos--;
		while (p!=null && pos>1) {
			p=p.getNext();
			pos--;
		}
		if (p == null) {
			return false;
		}
		Link tmp = new Link(data, p.getNext());
		p.setNext(tmp);
		return true;
	}
	
	//return the max data Link
	public Link max() {
		Link max = head;
		Link p = head;
		while (p!=null) {
			if (max.getData() < p.getData()) {
				max = p;
			}
			p = p.getNext();
		}
		return max;		
	}
	
	public int sumDiff() {
		if (head==null || head.getNext()==null) {
			return 0;
		}
		if(head.getNext().getNext()==null){
			return head.getNext().getData()-head.getData();
		}
		Link p = head;
		int sum = 0;
		while(p.getNext()!=null) {
			sum += p.getNext().getData() - p.getData();
			p = p.getNext();
		}
		sum += head.getData() - p.getData();
		return sum;
	}
	
	public int indexOf(int data) {
		int i = 1;
		Link p = head;
		while(p!=null) {
			if(p.getData()==data) {
				return i;
			}
			i++;
			p = p.getNext();
		}
		return -1;
	}
	
	public Link remove(int data) {
		if (head == null) {
			return null;
		}
		Link p = head;
		while (p.getNext() != null) {
			if (p.getNext().getData()==data) {
				Link tmp = p.getNext();
				p.setNext(tmp.getNext());
				return tmp;
			}
			p = p.getNext();
		}
		return null;
	}
	
	public String revToString() {
		return revToString(head);
	}

	private String revToString(Link p) {
		if(p == null) {
			return "null";			
		}
		String str = revToString(p.getNext());		
		str += "<==" + p.getData();
		if (p==head){
			str+= "<==head";
		}
		return str;
	}
	
}

















