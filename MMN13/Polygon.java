public class Polygon {
    Point[] _vertices;
    int _noOfVertices;
    final int VERTICES_MAX = 10;
    
    /**
     * Constructor for polygon class
     */
    public Polygon() {
        _vertices = new Point[VERTICES_MAX];
        _noOfVertices = 0;
    }
    
    /**
     * Retrive the highest vertex in the Polygon.
     * 
     * @return vertex - the highest point
     */
    public Point highestVertex() {
        Point highestPoint = _noOfVertices > 0 ? _vertices[0] : null;
        for (int index = 0; index < _noOfVertices; index++) {
            if (_vertices[index] != null && _vertices[index].isAbove(highestPoint)) {
                highestPoint = _vertices[index];
            }
        }
        
        return new Point(highestPoint);
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
        for (int index = 0; index < _noOfVertices; index++) {
            if (_vertices[index] == null) {
                _vertices[index] = new Point(x, y);
                _noOfVertices += 1;
                
                return true;
            } 
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return "";
    }
    
    /**
     * retrive the Polygon perimeter.
     * 
     * @return perimeter
     */
    public double calcPerimeter() {
        return 0;
    }
    
    /**
     * retrive the Polygon area.
     * 
     * @return area
     */
    public double calcArea() {
        return 0;
    }
    
    /**
     * Check if this Polygon bigger from another Polygon.
     * 
     * @param other - The other polygon to compare to
     * @retrun true if this is bigger, false if other is bigger.
     */
    public boolean isBigger(Polygon other) {
        return false;
    }
    
    /**
     * Retrive the index of Point p in the Polygon List.
     * 
     * @param p - the point to search for
     * @return index - the index of the point
     */
    public int findVertex(Point p) {
        for (int index = 0; index < _vertices.length; index++) {
               if (_vertices[index] != null && p.equals(_vertices[index])) {
                   return index;
               }
        }
        
        return -1;
    }
    
    /**
     * Retrive copy of the next vertex in the polygon
     * 
     * @param p - the point before the desired point
     * @return vertex - the next vertex in the polygon
     */
    public Point getNextVertex(Point p) {
        return new Point(5.0, 1.0);
    }
    
    /**
     * Retrive the square rectangle who block the polygon.
     * 
     * @return retangle
     */
    public Polygon getBoundingBox() {
        return new Polygon();
    }
}