public class CharListTesting {
    public static void main(String[] args) {
        CharList list = new CharList();
        CharList sublist = new CharList();

        list.add(new CharNode('a'));
        list.add(new CharNode('b'));
        list.add(new CharNode('c'));
        list.add(new CharNode('d'));

        sublist.add(new CharNode('a'));
        sublist.add(new CharNode('b'));

        int counter = list.subList(sublist);
	System.out.println(counter);
    }
}
