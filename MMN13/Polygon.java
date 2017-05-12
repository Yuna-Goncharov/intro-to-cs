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
        Point highestPoint = _vertices[0];
        
        for (int index = 0; index < _noOfVertices; index++) {
            if (_vertices[index].isAbove(highestPoint)) {
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
        if (_noOfVertices == VERTICES_MAX) {
            return false;
        } 
        
        _vertices[_noOfVertices++] = new Point(x, y);
        
        return true;
    }
    
    @Override
    public String toString() {
        String string = "";
        if ( _noOfVertices > 0 ) {
            string = "The polygon has " + _noOfVertices + " vertices:\n(" + _vertices[0];
            
            for ( int i = 0; i < _noOfVertices; i++ ) { 
                string += "," + _vertices[i];  
                if (i == (_noOfVertices - 1)) {
                    string += ")";
                }
            }
        } else {
            string = "The polygon has 0 vertices.";
        }
        return string;     
    }
    
    /**
     * retrive the Polygon perimeter.
     * 
     * @return perimeter
     */
    public double calcPerimeter() {
        double peri = 0;
        Point[] vertices = getVertices();
        
        if (_noOfVertices <= 1) {
            return peri;
        }
        
        if (_noOfVertices == 2) {
            return vertices[0].distance(vertices[1]);
        }
        
        for (int i = 0; i < vertices.length - 1; i++) {
            peri += vertices[i].distance(vertices[i+1]);
        }
        
        return peri;
    }
    
    /**
     * retrive the Polygon area.
     * 
     * @return area
     */
    public double calcArea() {
        double area = 0;
        Point[] vertices = getVertices();
            
        if (_noOfVertices > 3) {
            for (int i = 0; i < _noOfVertices; i++) {
                if (vertices[i] != null) { 
                    area += heron(vertices[0], vertices[i], vertices[i + 1]);
                }
            }
        }
        
        return area;
    }
    
    /**
     * Check if this Polygon bigger from another Polygon.
     * 
     * @param other - The other polygon to compare to
     * @retrun true if this is bigger, false if other is bigger.
     */
    public boolean isBigger(Polygon other) {
        return calcArea() > other.calcArea();
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
     * @return vertex - the next vertex in the polygon or null if no vertices
     */
    public Point getNextVertex(Point p) {
        Point nextVertex = null;
        int index = findVertex(p);
        
        if (index > -1) {
            int nextIndex = index + 1;
            
            if (nextIndex == _noOfVertices) {
                nextVertex = _vertices[0];
            } else {
                nextVertex = _vertices[nextIndex];
            }
            
            nextVertex = new Point(nextVertex);
        }
        
        return nextVertex;
    }
    
    /**
     * Retrive the square rectangle who block the polygon.
     * 
     * @return retangle
     */
    public Polygon getBoundingBox() {
        if (_noOfVertices < 3) {
            return null;
        }
        
        Polygon box;
        Point maxY =  highestVertex();
        Point minY = _vertices[0];
        Point maxX = _vertices[0];
        Point minX = _vertices[0];
        
        for (int i = 0; i < _noOfVertices; i++) {
            Point point = _vertices[i];
           if (point.isUnder(minY)) {
                minY = point;
            } else if (point.isRight(maxX)) {
                maxX = point;
            } else if (point.isLeft(minX)) {
                minX = point;
            }
        }
        
        box = new Polygon();
        box.addVertex( minX.getX(), minY.getY() );
        box.addVertex( minX.getX(), maxY.getY() );
        box.addVertex( maxX.getX(), maxY.getY() );
        box.addVertex( maxX.getX(), minY.getY() );
        
        return box;
    }
    
    private Point[] getVertices() {
        if (_noOfVertices <= 1) {
            return new Point[0];
        } 
        
        Point[] vertices = new Point[_noOfVertices + 1];
        
        for (int i = 0; i < _noOfVertices; i++) {
            vertices[i] = _vertices[i];
        }
        vertices[_noOfVertices] = _vertices[0]; // Connect the last one with the first one
        
        return vertices;
    }
    
    private double heron(Point a, Point b, Point c) {
        double AB = a.distance(b);
        double BC = b.distance(c);
        double CA = c.distance(a);
        
        double s = (AB + BC + CA) / 2;
        
        return Math.sqrt(s * (s - AB) * (s - BC) * (s - CA));
    }
}