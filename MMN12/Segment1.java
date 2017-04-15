/**
 * Segment1 represents a line (parallel to the x-axis) using two Points.
 *
 * @author Eyal Cohen
 * @version 1.0.0
 */
public class Segment1 {
    private Point _poLeft, _poRight;
    
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
    public Segment1(double leftX, double leftY, double rightX, double rightY) {
        if (leftY != rightY) {
            rightY = leftY;
        }
        
        _poLeft = new Point(leftX, leftY);
        _poRight = new Point(rightX, rightY);
    }

    /**
     * Constructs a new segment using two Points.
     * 
     * @param left The left point of the segment 
     * @param right The right point of the segment
     */
    public Segment1(Point left, Point right) {
        if (left.getY() != right.getY()) {
            double y = left.getY();
            right.setY(y);
        }
        _poLeft = left;
        _poRight = right;
    }
    
    /**
     * Copy Constructor
     * 
     * @param other the reference segment
     */
    public Segment1(Segment1 other) {
        _poLeft = other._poLeft;
        _poRight = other._poRight;
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
     * @params Segment1 other - the reference segment
     * @return The segment length 
     */
    public boolean equals(Segment1 other) {
        if (other.getPoLeft() == _poLeft && other.getPoRight() == _poRight) {
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
        return _poRight.getX() - _poLeft.getX();
    }
    
    /**
     * Returns the left point of the segment.
     * 
     * @return The left point of the segment
     */
    public Point getPoLeft() {
        return _poLeft;
    }
    
    /**
     * Returns the right point of the segment.
     * 
     * @return The right point of the segment
     */
    public Point getPoRight() { 
        return _poRight;
    }
        
    /**
     * Check if this segment is above a reference segment.
     * 
     * @param other the reference segment 
     * @return True if this segment is above the reference segment
     */
    public boolean isAbove(Segment1 other) {
        if (other.getPoLeft().getY() < _poLeft.getY()) {
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
    public boolean isBigger(Segment1 other) {
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
    public boolean isLeft(Segment1 other) {
        if (other.getPoLeft().getX() > _poLeft.getX()) {
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
    public boolean isRight(Segment1 other) {
        if (other.getPoLeft().getX() < _poLeft.getX()) {
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
    public boolean isUnder(Segment1 other) {
        if (other.getPoLeft().getY() > _poLeft.getY()) {
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
        _poRight.setX(_poRight.getX() + delta);
        _poLeft.setX(_poLeft.getX() + delta);
    }
        
    /**
     * Move the segment vertically by delta.
     * 
     * @param delta the displacement size
     */
    public void moveVertical(double delta) {
        _poRight.setY(_poRight.getY() + delta);
        _poLeft.setY(_poLeft.getY() + delta);
    }
        
    /**
     * Returns the overlap size of this segment and a reference segment.
     * 
     * @param other the reference segment
     * @return The overlap size
     */
    public double overlap(Segment1 other) {
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
        return "";
    }
    
    /**
     * Compute the trapeze perimeter, 
     * which is constructed by this segment and a reference segment.
     * 
     * @param other the reference segment
     * @return The trapeze perimeter
     */
    public double trapezePerimeter(Segment1 other) {
        return 0;
    }   
}
