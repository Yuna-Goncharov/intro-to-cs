/**
 * Segment2 represents a line (parallel to the x-axis) using a center point and length.
 *
 * @author Eyal Cohen
 * @version 1.0.0
 */
public class Segment2 {
    private Point _poCenter;
    private double _length;
    
    /**
     * Constructs a new segment using 4 specified x y coordinates: 
     * Two coordinates for the left point,
     * and two coordinates for the right point.
     * 
     * @param leftX X value of left point
     * @param leftY Y value of left point
     * @param rightX X value of right point
     * @param rightY Y value of right point
     */
    public Segment2(double leftX, double leftY, double rightX, double rightY) {
        if (leftY != rightY) {
            rightY = leftY;
        }
        double x = (leftX + rightX) / 2;
        double y = (leftY + rightY) / 2;
        _length = leftX + rightX;
        _poCenter = new Point(x, y);
    }

    /**
     * Constructs a new segment using a center point and the segment length.
     * 
     * @param poCenter the Center Point
     * @param length the segment length
     */
    public Segment2(Point poCenter, double length) {
       _poCenter = poCenter;
       _length = length;
    }
    
    /**
     *  Constructs a new segment using a center point and the segment length.
     * 
     * @param left The left point of the segment 
     * @param right The right point of the segment
     */
    public Segment2(Point left, Point right) {
        double x, y;
        
        if (left.getY() != right.getY()) {
            y = left.getY();
            right.setY(y);
        } else {
            y = (left.getY() + right.getY()) / 2;
        }
  
        x = (left.getX() + right.getX()) / 2;

        _length = right.getX() - left.getX();
        _poCenter = new Point(x, y);
    }
    
    /**
     * Copy Constructor
     * 
     * @param other the reference segment
     */
    public Segment2(Segment2 other) {
        _poCenter = other._poCenter;
        _length = other._length;
    }
    
    /**
     * Change the segment size by moving the right point by delta. 
     * Will be implemented only for a valid delta: only if the new right point remains the right point.
     * 
     * @param delta The length change
     */
    public void changeSize(double delta) {
       
    }
    
    /**
     * Check if the reference segment is equal to this segment.
     * 
     * @params Segment2 other - the reference segment
     * @return The segment length 
     */
    public boolean equals(Segment2 other) {
        if (other._poCenter == _poCenter && other._length == _length) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Returns the segment length
     * 
     * @return The segement length
     */
    public double getLength() {
        return _length;
    }
    
    /**
     * Returns the left point of the segment.
     * 
     * @return The left point of the segment
     */
    public Point getPoLeft() {
        double x, y;
        x = _poCenter.getX() - (_length / 2);
        y = _poCenter.getY();
        return new Point(x, y);
    }
    
    /**
     * Returns the right point of the segment.
     * 
     * @return The right point of the segment
     */
    public Point getPoRight() {
        double x, y;
        x = _poCenter.getX() + (_length / 2);
        y = _poCenter.getY();
        return new Point(x, y);
    }
        
    /**
     * Check if this segment is above a reference segment.
     * 
     * @param other the reference segment 
     * @return True if this segment is above the reference segment
     */
    public boolean isAbove(Segment2 other) {
        if (other.getPoLeft().getY() < getPoLeft().getY()) {
            return true;
        } else {
            return false;
        }
    }
        
    /**
     * Check if this segment is bigger than a reference segment.
     * 
     * @param other the reference segment 
     * @return True if this segment is bigger than the reference segment
     */
    public boolean isBigger(Segment2 other) {
        if (getLength() > other.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Check if this segment is left of a received segment.
     * 
     * @param other - the reference segment 
     * @return True if this segment is left to the reference segment
     */
    public boolean isLeft(Segment2 other) {
        if (other._poCenter.getX() > _poCenter.getX()) {
            return true;
        } else {
            return false;
        }
    }
        
    /**
     * Check if this segment is right of a received segment.
     * 
     * @param other the reference segment 
     * @return True if this segment is right to the reference segment
     */
    public boolean isRight(Segment2 other) {
        if (other._poCenter.getX() < _poCenter.getX()) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Check if this segment is under of a received segment.
     * 
     * @param other the reference segment 
     * @return True if this segment is under to the reference segment
     */
    public boolean isUnder(Segment2 other) {
        if (other.getPoLeft().getY() > getPoLeft().getY()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Move the segment horizontally by delta.
     * 
     * @param delta the displacement size
     */
    public void moveHorizontal(double delta) {

    }
        
    /**
     * Move the segment vertically by delta.
     * 
     * @param delta the displacement size
     */
    public void moveVertical(double delta) {
      
    }
        
    /**
     * Returns the overlap size of this segment and a reference segment.
     * 
     * @param other the reference segment
     * @return The overlap size
     */
    public double overlap(Segment2 other) { 
      return 0;
    }
    
    /**
     * Check if a point is located on the segment.
     * 
     * @param p a point to be checked
     * @return True if p is on this segment
     */
    public boolean pointOnSegment(Point p) {
      return false;
    }
    
    /**
     * Return a string representation of this segment in the format (3.0,4.0)---(3.0,6.0).
     * 
     * @overrides toString in class java.lang.Object
     * @return String representation of this segment
     */
    @Override
    public String toString() {
        Point left = getPoLeft();
        Point right = getPoRight();
        
        double leftX = left.getX();
        double leftY = left.getY();
        double rightX = right.getX();
        double rightY = right.getY();
        
        return "(" + leftX + "," + leftY + ")---(" + rightX + "," + rightY + ")";
    }
    
    /**
     * Compute the trapeze perimeter, 
     * which is constructed by this segment and a reference segment.
     * 
     * @param other the reference segment
     * @return The trapeze perimeter
     */
    public double trapezePerimeter(Segment2 other) {
        return 0;
    }   
}
