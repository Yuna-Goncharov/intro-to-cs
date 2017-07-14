public class Exam {

 public static void main(String[] args) {
    CharNode d  = new CharNode('d', null);
    CharNode c = new CharNode('c', d);
    CharNode b2 = new CharNode('b', c);
    CharNode b1 = new CharNode('b', b2);
    CharNode a  = new CharNode('a', b1);
    CharList list1 = new CharList(a);

    CharNode d1  = new CharNode('d', null);
    CharNode b4 = new CharNode('b', c);
    CharNode b3 = new CharNode('b', b4);
    CharNode c1 = new CharNode('c', d);
    CharNode a2  = new CharNode('a', b3);
    CharNode a1  = new CharNode('a', a2);
    CharList list2 = new CharList(a1);
     

    System.out.println(list1.isTrans(list1, list2));
 }   
}