public class Polygon {
    private PointNode head;
    
    /**
     * Constructor for polygon class
     */
    public Polygon() {
        head = null;
    }
    
    /**
     * Retrive the highest vertex in the Polygon.
     * 
     * @return vertex - the highest point
     */
    public Point highestVertex() {
        if (head == null) {
            return null;
        }

        PointNode iterable = head;
        Point highest = head.getPoint();

        while (iterable != null) {
            if (iterable.getPoint().getY() > highest.getY()) {
                highest = iterable.getPoint();
            }

            iterable = iterable.getNext();
        }

        return highest;
    } 
    
    /**
     * Add Vertex to the polygon.
     * 
     * @param x - X coordinate of the new vertex
     * @param y - Y coordinate of the new vertex
     * 
     * @return true if the adding was successfull, false if the Points array is full.
     */
    public boolean addVertex(Point p, int pos) {
        if (pos < 1) {
            return false;
        }
        if (pos == 1) {
            add(p);
            return true;
        }
        PointNode iterable = head;
        pos--;

        while (iterable != null && pos > 1) {
            iterable = iterable.getNext();
            pos--;
        }

        if (iterable == null) {
            return false;
        }
        
        PointNode newPoint = new PointNode(p, iterable.getNext());
        iterable.setNext(newPoint);

        return true;
    }
    
    @Override
    public String toString() {
        int counter = 0;
        String str = "(";
        PointNode p = head;

        if (p == null) {
            return "\n The polygon has 0 vertices";
        }

        while(p != null) {
            str += p.getPoint().toString();
            
            if (p.getNext() != null) { 
                str += ",";
            }
            
            p = p.getNext();
            counter = counter + 1;
        }

        return "The polygon has " + counter + " vertices:\n" + str+")";
    }
    
    /**
     * retrive the Polygon perimeter.
     * 
     * @return perimeter
     */
    public double calcPerimeter() {
        double peri = 0;

        if (head.getNext() == null) {
            return peri;
        } else if (head.getNext().getNext() == null) {
            return head.getPoint().distance(head.getNext().getPoint());
        }

        PointNode iterable = head;

        while (iterable.getNext() != null) {
            peri += iterable.getPoint().distance(iterable.getNext().getPoint());
            
            iterable = iterable.getNext();
        }

        peri += iterable.getPoint().distance(head.getPoint());

        return peri;
    }
    
    /**
     * retrive the Polygon area.
     * 
     * @return area
     */
    public double calcArea() {
        double area = 0;
        PointNode iterable = head;

        while (iterable.getNext().getNext() != null) {
            area += heron(head.getPoint(), iterable.getPoint(), iterable.getNext().getPoint());

            iterable = iterable.getNext();
        }

        area += heron(head.getPoint(), iterable.getPoint(), iterable.getNext().getPoint());

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
        if (head == null) {
            return -1;
        }

        PointNode iterable = head;
        int counter = 1;


        while (iterable != null) {
            if (iterable.getPoint().equals(p)) {
                return counter;
            }
               
            counter = counter + 1;
            iterable = iterable.getNext(); 
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
        if (head.getNext() == null) {
            return new Point(head.getPoint());
        }

        PointNode iterable = head;
        
        while (iterable.getNext() != null) {
            if (iterable.getPoint().equals(p)) {
                return new Point(iterable.getNext().getPoint());
            }   

            iterable = iterable.getNext(); 
        }

        if (iterable.getPoint().equals(p)) {
            return new Point(head.getPoint());
        }

        return null;
    }
    
    /**
     * Retrive the square rectangle who block the polygon.
     * 
     * @return retangle
     */
    public Polygon getBoundingBox() {
        if (head.getNext() == null || head.getNext().getNext() == null || head.getNext().getNext() == null) {
            return null;
        }

        Polygon box;
        PointNode iterable = head;

        Point maxY = highestVertex();
        Point minY = head.getPoint();
        Point maxX = head.getPoint();
        Point minX = head.getPoint();

        while (iterable != null) {
            Point point = iterable.getPoint();

            if (point.isUnder(minY)) {
                minY = point;
            } else if (point.isRight(maxX)) {
                maxX = point;
            } else if (point.isLeft(minX)) {
                minX = point;
            }

            iterable = iterable.getNext();
        }

        box = new Polygon();

        box.addVertex(new Point(minX.getX(), minY.getY()), 1);
        box.addVertex(new Point(maxX.getX(), minY.getY()), 2);
        box.addVertex(new Point(maxX.getX(), maxY.getY()), 3);
        box.addVertex(new Point(minX.getX(), maxY.getY()), 4);

        return box;
        
    }
    
    private void add(Point point) {
        head = new PointNode(point, head);
    }

    private boolean isLessThen3Vertices() {
        return head.getNext() != null 
            || head.getNext().getNext() ==  null 
            || head.getNext().getNext().getNext() == null;
    }

    private double heron(Point a, Point b, Point c) {
        double AB = a.distance(b);
        double BC = b.distance(c);
        double CA = c.distance(a);
        
        double s = (AB + BC + CA) / 2;
        
        return Math.sqrt(s * (s - AB) * (s - BC) * (s - CA));
    }
}
