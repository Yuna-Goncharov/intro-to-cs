
/**
 * Write a description of class Segment1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Segment1 {
    private Point _poLeft, _poRight;
    
    public Segment1(double leftX, double leftY, double rightX, double rightY) {
        if (leftY != rightY) {
            rightY = leftY;
        }
        
        _poLeft = new Point(leftX, leftY);
        _poRight = new Point(rightX, rightY);
    }

    public Segment1(Point left, Point right) {
        if (left.getY() != right.getY()) {
            double y = left.getY();
            right.setY(y);
        }
        _poLeft = left;
        _poRight = right;
    }
    
    public Segment1(Segment1 other) {
        _poLeft = other._poLeft;
        _poRight = other._poRight;
    }
    
    public void changeSize(double delta) {
    
    }
    
    public boolean equals(Segment1 other) {
        if (other.getPoLeft() == _poLeft && other.getPoRight() == _poRight) {
            return true;
        } else {
            return false;
        }
    }
    
    public double getLength() {
        return _poRight.getX() - _poLeft.getX();
    }
    
    public Point getPoLeft() {
        return _poLeft;
    }
    
    public Point getPoRight() { 
        return _poRight;
    }
    
    public boolean isAbove(Segment1 other) {
        if (other.getPoLeft().getY() < _poLeft.getY()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isBigger(Segment1 other) {
        return false;
    }
    
    public boolean isLeft(Segment1 other) {
        if (other.getPoLeft().getX() > _poLeft.getX()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isRight(Segment1 other) {
        if (other.getPoLeft().getX() < _poLeft.getX()) {
            return true;
        } else {
            return false;
        }

    }
    
    public boolean isUnder(Segment1 other) {
        if (other.getPoLeft().getY() > _poLeft.getY()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void moveHorizontal(double delta) {
        _poRight.setX(_poRight.getX() + delta);
        _poLeft.setX(_poLeft.getX() + delta);
    }
    
    public void moveVertical(double delta) {
        _poRight.setY(_poRight.getY() + delta);
        _poLeft.setY(_poLeft.getY() + delta);
    }
    
    public double overlap(Segment1 other) {
        return 0;
    }
    
    public boolean pointOnSegment(Point p) {
        return false;
    }
    
    @Override
    public String toString() {
        return "";
    }
    
    public double trapezePerimeter(Segment1 other) {
        return 0;
    }
}
