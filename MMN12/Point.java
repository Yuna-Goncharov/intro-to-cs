/**
 * Class Point represent point in plain, by the polar system.
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
     * @param {Point} other - The point from which to construct the new object
     */
    public Point(Point other) {
    }
    
    /**
     * Retrive the distance between the point and given point
     * 
     * @param {Point} other - The point to 
     * 
     * @return {double} distance
     */
    public double distance(Point other) {
        return 0;
    };
    
    /** 
     * Check if given point is equal to this point   
     * 
     * @return {boolean}
     */
    public boolean equals(Point other) {
        return false;
    }
    
    /** 
     * Retrive x coordinate of the point  
     * 
     * @return {double} x
     */
    public double getX() {
        return 0;
    }
    
    /** 
     * Retrive y coordinate of the point
     * 
     * @return {double} y
     */
    public double getY() {
      return 0;
    }
    
    /**
     * Check if given point is above this point
     * 
     * @param {Point} other - The point to 
     * 
     * @return {boolean}
     */
    public boolean isAbove(Point other) {
        return false;
    };
    
     /**
     * Check if given point is left to this point
     * 
     * @param {Point} other - The point to 
     * 
     * @return {boolean}
     */
    public boolean isLeft(Point other) {
        return false;
    };
    
    /**
     * Check if given point is right to this point
     * 
     * @param {Point} other - The point to 
     * 
     * @return {boolean}
     */
    public boolean isRight(Point other) {
        return false;
    };
        
    /**
     * Check if given point is under this point
     * 
     * @param {Point} other - The point to 
     * 
     * @return {boolean}
     */
    public boolean isUnder(Point other) {
        return false;
    };
    
    /**
     * Moves a point. 
     * If either coordinate becomes negative the point remains unchanged.
     * 
     * @param {double} dx - the diffrance to add to x
     * @param {double} dy - the diffrance to add to y
     */
    public void move(double dx, double dy) {
    
    }
    
    /** 
     * Set the x coordinate of the point   
     * 
     * @param {double} x - the x coordinate to set
     */
    public void setX(double x) {

    }

    /** 
     * Set the y coordinate of the point   
     * 
     * @param {double} y - the y coordinate to set
     */
    public void setY(double y) {

    }
    
    /**
     * Calculate the radius of the point
     * 
     * @param {doulbe} x - the x coordinate
     * @param {doulbe} y - the y coordinate
     * 
     * @return {double} radius
     */
    private double calcRadius(double x, double y) {
        return Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
    }
    
    private double calcAlpha(double x, double y) {
        return Math.atan(y/x);
    }
    
}
