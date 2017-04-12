/**
 * Class Point represent 2 dimensional points.
 *
 * @author Eyal Cohen
 * @version 1.0.0
 */
public class Point {

    private double _radius; 
    private double _alpha;
    
    final double DEFAULT_VALUE = 0;
    
    /**
     * Constructor for objects of class Point. 
     * Construct a new point with the specified x y coordinates. 
     * If the x/y coordinate is negative it is set to zero. 
     * 
     * @param {dobule} x - The x coordinate
     * @param {double} y - The y coordinate
     */
    public Point(double x, double y) {
        double _x = (x > DEFAULT_VALUE) ? x : DEFAULT_VALUE;
        double _y = (y > DEFAULT_VALUE) ? y : DEFAULT_VALUE;
        
        _radius = calcRadius(_x, _y);
        _alpha = calcAlpha(_x, _y);
    }
    
    /**
     * Constructor for objects of class Point. 
     * Copy constrctor, construct a point using another point.
     * 
     * @param other - The point from which to construct the new object
     */
    public Point(Point other) {
        if (other != null) {
            _alpha = other._alpha;
            _radius = other._radius;
        };
    }
    
    /**
     * Retrive the distance between the point and given point
     * 
     * @param other - The point to 
     * 
     * @return The distance between the points
     */
    public double distance(Point other) {
        return 0;
    };
    
    /** 
     * Check if given point is equal to this point   
     * 
     * @return True if the given point is equal to this point
     */
    public boolean equals(Point other) {
        return false;
    }
    
    /** 
     * Retrive x coordinate of the point  
     * 
     * @return The x coordinate of the point
     */
    public double getX() {
        return Math.cos(_alpha) * _radius;
    }
    
    /** 
     * Retrive y coordinate of the point
     * 
     * @return The y coordinate of the point
     */
    public double getY() {
      return Math.sin(_alpha) * _radius;
    }
    
    /**
     * Check if given point is above this point
     * 
     * @param other - The point to check
     * 
     * @return True if this point is above the other point
     */
    public boolean isAbove(Point other) {
        return false;
    };
    
     /**
     * Check if given point is left to this point
     * 
     * @param other - The point to check
     * 
     * @return True if this point is left of the other point
     */
    public boolean isLeft(Point other) {
        return false;
    };
    
    /**
     * Check if given point is right to this point
     * 
     * @param {Point} other - The point to check
     * 
     * @return True if given point is right to this point
     */
    public boolean isRight(Point other) {
        return false;
    };
        
    /**
     * Check if given point is under this point
     * 
     * @param other - The point to check
     * 
     * @return True if this point is below the other point
     */
    public boolean isUnder(Point other) {
        return false;
    };
    
    /**
     * Moves a point. 
     * If either coordinate becomes negative the point remains unchanged.
     * 
     * @param dx - the diffrance to add to x
     * @param dy - the diffrance to add to y
     */
    public void move(double dx, double dy) {
    
    }
    
    /** 
     * Set the x coordinate of the point   
     * 
     * @param x - the x coordinate to set
     */
    public void setX(double x) {

    }

    /** 
     * Set the y coordinate of the point   
     * 
     * @param y - the y coordinate to set
     */
    public void setY(double y) {

    }
    
    @Override
    public String toString() {
        return "";
    };
    
    /**
     * Calculate the radius of the point
     * 
     * @param x - the x coordinate
     * @param y - the y coordinate
     * 
     * @return radius
     */
    private double calcRadius(double x, double y) {
        return Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
    }
    
    private double calcAlpha(double x, double y) {
        if (x == 0) {
            return 1.0;
        }
        return Math.atan(y/x);
    }
    
}
