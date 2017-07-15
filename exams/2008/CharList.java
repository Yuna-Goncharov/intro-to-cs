public class CharList {
    private CharNode _head;

    public CharList() {
        _head = null;
    }

    public CharList(CharNode head) {
        _head = head;
    }
    
    // Check if list2 is a transform list of list 1. 
    // List is tranformed if every one of the chars in list2 
    // exists in list 1 at least once. 
    // If a char is found in list1 more than once (say K times), its should also
    // exists in list2 at least K times.
    public static boolean isTrans(CharList list1, CharList list2) {
        return isTrans(list1._head, list2._head);
    }

    private static boolean isTrans(CharNode list1, CharNode list2) {
        if (list1 == null) { return true; }
        if (list2 == null) { return false; }

        if (list1.getValue() == list2.getValue()) {
            return isTrans(list1.getNext(), list2.getNext());
        }

        return isTrans(list1, list2.getNext());
    }
}