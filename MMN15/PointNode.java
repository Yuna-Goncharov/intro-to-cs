public class PointNode {
    Point _point;
    PointNode _next;
    
    public PointNode(Point p, PointNode n) {
        _point = new Point(p);
        _next = n;
    }

    public PointNode(Point p) {
        _point = new Point(p);
    }

    public PointNode(PointNode n) {
        _next = n;
    }

    public Point getPoint() {
        return new Point(_point);
    }

    public PointNode getNext() {
        return _next;
    }

    public void setPoint(Point p) {
        _point = new Point(p);
    }

    public void setNext(PointNode next) {
        _next = next;
    }
}