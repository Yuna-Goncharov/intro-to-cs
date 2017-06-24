public class PointNode {
    Point _point;
    PointNode _next;
	
    /** 
     * Constructor For PointNode class, instanciate both point and next
     *
     * @param p - the point to store at PointNode	
     * @param n - the next PointNode	
     */    
    public PointNode(Point p, PointNode n) {
        _point = new Point(p);
        _next = n;
    }


    /** 
     * Constructor For PointNode class, instanciate point only
     * @param p - the point to store at PointNode	
     *
     */
    public PointNode(Point p) {
        _point = new Point(p);
    }

	
    /** 
     * Constructor For PointNode class, instanciate next only
     *
     * @param n - the next PointNode
     *
     */
    public PointNode(PointNode n) {
        _next = n;
    }


    /** 
     * Retrive the point
     *
     * @return Point 
     */
    public Point getPoint() {
        return new Point(_point);
    }


    /** 
     * Retrive the next PointNode
     *
     * @return PointNode 
     */
    public PointNode getNext() {
        return _next;
    }

	
    /** 
     * Set the point
     *
     */
    public void setPoint(Point p) {
        _point = new Point(p);
    }
    
    /** 
     * Set the next
     *
     */
    public void setNext(PointNode next) {
        _next = next;
    }
}