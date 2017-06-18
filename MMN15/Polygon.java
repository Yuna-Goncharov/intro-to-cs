public class Polygon {
    private PointNode head;
    
    /**
     * Constructor for polygon class
     */
    public Polygon() {
    }
    
    /**
     * Retrive the highest vertex in the Polygon.
     * 
     * @return vertex - the highest point
     */
    public Point highestVertex() {
    } 
    
    /**
     * Add Vertex to the polygon.
     * 
     * @param x - X coordinate of the new vertex
     * @param y - Y coordinate of the new vertex
     * 
     * @return true if the adding was successfull, false if the Points array is full.
     */
    public boolean addVertex(double x, double y) {
    }
    
    @Override
    public String toString() {
    }
    
    /**
     * retrive the Polygon perimeter.
     * 
     * @return perimeter
     */
    public double calcPerimeter() {
    }
    
    /**
     * retrive the Polygon area.
     * 
     * @return area
     */
    public double calcArea() {
    }
    
    /**
     * Check if this Polygon bigger from another Polygon.
     * 
     * @param other - The other polygon to compare to
     * @retrun true if this is bigger, false if other is bigger.
     */
    public boolean isBigger(Polygon other) {
    }
    
    /**
     * Retrive the index of Point p in the Polygon List.
     * 
     * @param p - the point to search for
     * @return index - the index of the point
     */
    public int findVertex(Point p) {
    }
    
    /**
     * Retrive copy of the next vertex in the polygon
     * 
     * @param p - the point before the desired point
     * @return vertex - the next vertex in the polygon or null if no vertices
     */
    public Point getNextVertex(Point p) {
    }
    
    /**
     * Retrive the square rectangle who block the polygon.
     * 
     * @return retangle
     */
    public Polygon getBoundingBox() {
    }
    
    private Point[] getVertices() {
    }
    
    private double heron(Point a, Point b, Point c) {
        double AB = a.distance(b);
        double BC = b.distance(c);
        double CA = c.distance(a);
        
        double s = (AB + BC + CA) / 2;
        
        return Math.sqrt(s * (s - AB) * (s - BC) * (s - CA));
    }
}
