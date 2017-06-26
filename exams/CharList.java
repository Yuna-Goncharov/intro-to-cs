public class CharList {
	private CharNode _head;

	public CharList( ) {
		_head = null;
	}

	public CharList (CharNode node) {
		_head = node;
	}

	public void add(CharNode node) {
		CharNode iterable = _head;

		while (iterable.getNext() != null) {
			iterable = iterable.getNext();
		}
		
		iterable.setNext(node);
	}

	public int subList(CharList list) {
		CharNode listIterable = _head;
		CharNode sublistIterable = list._head;
		int counter = 0;

		while (listIterable != null) {
			if (listIterable.getData() == sublistIterable.getData()) { 
				sublistIterable = sublistIterable.getNext();
				listIterable = listIterable.getNext();

				while (sublistIterable != null) {
					if (listIterable.getData() == sublistIterable.getData()) {
						sublistIterable = sublistIterable.getNext();

						if (sublistIterable.getNext() == null) {
							counter = counter + 1;
						}
					}
				}
			}
			listIterable = listIterable.getNext();
		}	
		return counter;
	}
}