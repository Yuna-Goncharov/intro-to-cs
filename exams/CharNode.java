public class CharNode {

    private char _data;

    private CharNode _next;

    public CharNode(char dat) {
	    _data = dat;
    }

    public CharNode(char dat, CharNode n) {
        _data = dat;
        _next = n;
    }
    public char getData() {
        return _data;
    }

    public CharNode getNext() {
        return _next;
    }

    public void setData(char d) {
        _data = d;
    }

    public void setNext(CharNode node) {
        _next = node;
    }

}
