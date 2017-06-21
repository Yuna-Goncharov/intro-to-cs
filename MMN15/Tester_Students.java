
public class Tester_Students {
	public static void main(String[] args) {
		
		Point fX = new Point(0, 0);
		Point sX = new Point(fX);
		sX.move(1, 1);
		Point tX = new Point(fX.getX(), sX.getY());
		
		PointNode pS = new PointNode(sX);
		PointNode pF = new PointNode(fX, pS);
		
		if (Math.abs(pF.getPoint().distance(pF.getNext().getPoint())) - Math.sqrt(2) > 0.1)
			System.out.println("Distance Calculation is wrong");
		
		Polygon myPolygon = new Polygon();
		myPolygon.addVertex(fX, 1);
		myPolygon.addVertex(sX, 2);
		myPolygon.addVertex(tX, 3);
	
        Polygon pol2 = new Polygon();
        pol2.addVertex(new Point(0, 0), 1);
        pol2.addVertex(new Point(0, 10), 2);
        pol2.addVertex(new Point(10, 0), 3);
        
		if (!myPolygon.toString().equals("The polygon has 3 vertices:\n((0.0,0.0),(1.0,1.0),(0.0,1.0))")){
			System.out.println("Your Answer: " + myPolygon.toString());
			System.out.println("Work on your String representation");
			System.out.println("Currect answer:\nThe polygon has 3 vertices:\n((0.0,0.0),(1.0,1.0),(0.0,1.0))");
		} else 
			if (Math.abs(myPolygon.calcPerimeter() - 3.414) > 0.1) 
				System.out.println("Work on your perimeter calculation, Your result: " + myPolygon.calcPerimeter());
			else 
				if (Math.abs(myPolygon.calcArea() - 0.5) > 1) 
					System.out.println("Work on your area calculation, Your result: " + myPolygon.calcArea());
				else if(!myPolygon.highestVertex().equals(sX))
                    System.out.println("Work on your highestVertex calculation, Your result: " +
                                       myPolygon.highestVertex());
            else if(!pol2.isBigger(myPolygon))
                System.out.println("Work on your isBigger calculation, Your result: " + pol2.isBigger(myPolygon));
            else if(myPolygon.findVertex(sX) != 2)
                System.out.println("Work on your findVertex calculation, Your result: " + myPolygon.findVertex(sX));
            else if(!myPolygon.getNextVertex(sX).equals(tX))
                System.out.println("Work on your getNextVertex calculation, Your result: " + myPolygon.getNextVertex(sX));
					System.out.println("Good start...");
	
	
	}
}
