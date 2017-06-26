public class CharListTesting {
    public static void main(String[] args) {
        CharList list = new CharList();
        CharList sublist = new CharList();
        CharList sublist2 = new CharList();

	    // We add to the add, so it may be the problem - the sublist should be reverse
        list.add(new CharNode('a'));
        list.add(new CharNode('b'));
        list.add(new CharNode('c'));
        list.add(new CharNode('d'));

        sublist.add(new CharNode('a'));
        sublist.add(new CharNode('b'));

        sublist2.add(new CharNode('c'));
        sublist2.add(new CharNode('d'));

        int counter = list.subList(sublist);
	    System.out.println(counter);

        int counter2 = list.subList(sublist2);
        System.out.println(counter2);

    }
}
