/**
 * Students tester to Polygon class
 */
public class BatelTester {
    public static void main(String[] args) {

        System.out.println("****Start****");
        Polygon polygon = new Polygon();
        polygon.addVertex(new Point(2.0, 1.0),1);
        polygon.addVertex(new Point(5.0, 0.0),2);
        polygon.addVertex(new Point(7.0, 5.0),3);
        polygon.addVertex(new Point(4.0, 6.0),4);
        polygon.addVertex(new Point(1.0, 4.0),5);

        Polygon polygon2 = new Polygon();
        polygon2.addVertex(new Point(3.0, 1.0),1);
        polygon2.addVertex(new Point(2.0, 0.0),2);
        polygon2.addVertex(new Point(1.0, 6.0),3);  //will become #4
        polygon2.addVertex(new Point(6.0, 5.0),3);  //is #3
        polygon2.addVertex(new Point(8.0, 4.0),5);

        Polygon polygon3 = new Polygon();
        polygon3.addVertex(new Point(3.0, 2.0),1);
        polygon3.addVertex(new Point(6.0, 0.0),2);

        Polygon polygon4 = new Polygon();
        polygon4.addVertex(new Point(5.0, 2.0),1);

        Polygon polygon5 = new Polygon();


        Polygon polygon6 = new Polygon();
        polygon6.addVertex(new Point(5.0, 0.0),1);
        polygon6.addVertex(new Point(4.0, 0.0),1);
        polygon6.addVertex(new Point(3.0, 0.0),1);
        polygon6.addVertex(new Point(2.0, 0.0),1);
        polygon6.addVertex(new Point(1.0, 0.0),1);

        if (!polygon6.toString().equals("The polygon has 5 vertices:\n((1.0,0.0),(2.0,0.0),(3.0,0.0),(4.0,0.0),(5.0,0.0))"))
            System.out.println("Something wrong with addVertex at pos=1\nshould be ((1.0,0.0),(2.0,0.0),(3.0,0.0),(4.0,0.0),(5.0,0.0))\nactual "+polygon6);

        if (polygon3.addVertex(new Point(0,0), 4) || polygon5.addVertex(new Point(0,0), 2) || polygon3.addVertex(new Point(0,0), 0))
            System.out.println("Illegal addVertex occurred");

        Point highest = polygon.highestVertex();
        System.out.println("\n***Test highestVertex:***\nhighest = "  +highest + " while it should be (4.0, 6.0)" );
        Point highest2 = polygon2.highestVertex();
        System.out.println("\nhighest2 = "  +highest2 + " while it should be (1.0, 6.0)" );
        Point highest3 = polygon3.highestVertex();
        System.out.println("\nhighest3 = "  +highest3 + " while it should be (3.0, 2.0)" );
        Point highest4 = polygon5.highestVertex();
        System.out.println("\nhighest4 = "  +highest4 + " while it should be null" );


        System.out.println("\n***Test toString()***\nmethod1:\n" + polygon);
        System.out.println("\nmethod2:\n" + polygon2);

        double perimeter = polygon.calcPerimeter();
        System.out.println("\n***Test calcPerimeter:***\nperimeter = "  + perimeter + " while it should be 18.47754906310363");
        double perimeter2 = polygon4.calcPerimeter();
        System.out.println("\nperimeter2 = "  + perimeter2 + " while it should be 0.0");
        double perimeter3 = polygon3.calcPerimeter();
        System.out.println("\nperimeter3 = "  + perimeter3 + " while it should be 3.605551275463989");

        double area = polygon.calcArea();
        System.out.println("\n***Test calcArea:***\narea = "  + area  +" while it should be: 22.499999999999996");
        double area2 = polygon3.calcArea();
        System.out.println("\narea = "  + area2  +" while it should be: 0.0");
        double area3 = polygon2.calcArea();
        System.out.println("\narea = "  + area3  +" while it should be: 27.50000000000003");

        Polygon biggerPolygon = new Polygon();
        biggerPolygon.addVertex(new Point(2.0, 1.0),1);
        biggerPolygon.addVertex(new Point(5.0, 0.0),2);
        biggerPolygon.addVertex(new Point(7.0, 5.0),3);
        biggerPolygon.addVertex(new Point(4.0, 7.0),4);
        biggerPolygon.addVertex(new Point(1.0, 4.0),5);

        System.out.println ("\n***Test isBigger:***\nexpected result here is false and actual result is: " + polygon.isBigger(biggerPolygon));// should be false

        Polygon biggerPolygon2 = new Polygon();
        biggerPolygon2.addVertex(new Point(7.0, 4.0),1);
        biggerPolygon2.addVertex(new Point(8.0, 2.0),2);
        biggerPolygon2.addVertex(new Point(8.0, 4.0),3);
        biggerPolygon2.addVertex(new Point(9.0, 2.0),4);
        biggerPolygon2.addVertex(new Point(6.0, 3.0),5);

        System.out.println ("\nexpected result here is true and actual result is: " + polygon.isBigger(biggerPolygon2));// should be true

        Point point = new Point(4.0, 6.0);
        Point point2 = new Point(3.0, 4.0);
        Point point3 = new Point(8.0, 4.0);
        Point point4 = new Point(5.0, 2.0);

        int index = polygon.findVertex(point);
        System.out.println("\n***Test findVertex:***\nindex = "  + index + " while actual result should be 4");
        int index2 = polygon.findVertex(point2);
        System.out.println("\nindex2 = "  + index2 + " while actual result should be -1");

        Point actualNextVertex = new Point(1.0, 4.0);
        Point nextVertex = polygon.getNextVertex(point);
        System.out.println("\n***Test getNextVertex:***\nnext point after (4.0,6.0) is = " + nextVertex + " while it should be (1.0,4.0)");

        Point actualNextVertex2 = new Point(3.0, 1.0);
        Point nextVertex2 = polygon2.getNextVertex(point3);
        System.out.println("\nNext point after the last point (8.0, 4.0) is = " + nextVertex2 + " while it should be (3.0, 1.0)");

        Point actualNextVertex3 = new Point(5.0, 2.0);
        Point nextVertex3 = polygon4.getNextVertex(point4);
        System.out.println("\nIf there is only one vertex = " + nextVertex3 + " while it should be (5.0, 2.0)");

        Point actualNextVertex4 = new Point(8.0, 1.0);
        Point nextVertex4 = polygon.getNextVertex(point2);
        System.out.println("\nThe point doesn't exsit on th polygon = " + nextVertex4 + " while it should be null");


        Polygon boundingBox = polygon.getBoundingBox();
        System.out.println("\n***Test getBoundingBox:***\nthe bounding box is:\n" + boundingBox + "\nwhile it should be:\nThe polygon has 4 vertices:\n((1.0,0.0),(7.0,0.0),(7.0,6.0),(1.0,6.0))");

        Polygon boundingBox2 = polygon2.getBoundingBox();
        System.out.println("\nThe bounding box is:\n" + boundingBox2 + "\nwhile it should be:\nThe polygon has 4 vertices:\n((1.0,0.0),(8.0,0.0),(8.0,6.0),(1.0,6.0))");

        Polygon boundingBox3 = polygon3.getBoundingBox();
        System.out.println("\nThe bounding box is:\n" + boundingBox3 + "\nwhile it should be:\nnull");



        System.out.println("****End****");



    }
}