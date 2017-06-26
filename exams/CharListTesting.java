public class CharListTesting {
    public static void main(String[] args) {
        CharList list = new CharList();
        CharList sublist = new CharList();

	// We add to the add, so it may be the problem - the sublist should be reverse
        list.add(new CharNode('a'));
        list.add(new CharNode('b'));
        list.add(new CharNode('c'));
        list.add(new CharNode('d'));

        sublist.add(new CharNode('b'));
        sublist.add(new CharNode('a'));

        int counter = list.subList(sublist);
	System.out.println(counter);
    }
}
