public class CharList {
	private CharNode _head;

	public CharList( ) {
		_head = null;
	}

	public CharList (CharNode node) {
		_head = node;
	}

	public void add(CharNode p) {
		CharNode temp = _head;
		p.setNext(temp);
		_head = p;
	}


	public int subList(CharList list) {
		CharNode listIterable = _head;
		CharNode sublistIterable = list._head;
		int counter = 0;
		int innerCounter = 0;
		while (listIterable != null && sublistIterable != null) {

			if (listIterable.getData() == sublistIterable.getData()) { 
				sublistIterable = sublistIterable.getNext();
				listIterable = listIterable.getNext();

				while (sublistIterable != null) {
					if (listIterable.getData() == sublistIterable.getData()) {
						if (sublistIterable.getNext() == null) {
							counter = counter + 1;
						}
					}
					sublistIterable = sublistIterable.getNext();
				}
			}
			listIterable = listIterable.getNext();
		}	
		return counter;
	}
}
