public class Segment1Tester2 {

    public static void main(String[] args) {
        System.out.println("********** Test Q2 Segment1 - Start **********");

        System.out.println("Test first constructor and toString:");
        Segment1 seg0 = new Segment1(-1.0, -3.0, 2.0, 0.0);
        if(! seg0.getPoLeft().equals(new Point(0.0, 0.0))) {
            System.out.println("\t ERROR - expected seg0.getPoLeft()=(0.0,0.0) ; actual=" + seg0.getPoLeft());
        } else
            System.out.println("\t OK - expected seg0.getPoLeft()=(0.0,0.0) ; actual=" + seg0.getPoLeft());

        if(! seg0.getPoRight().equals(new Point(2.0, 0.0))) {
            System.out.println("\t ERROR - expected seg0.getPoRight()=(2.0,0.0) ; actual=" + seg0.getPoRight());
        } else
            System.out.println("\t OK - expected seg0.getPoRight()=(2.0,0.0) ; actual=" + seg0.getPoRight());

        if (! seg0.toString().equals("(0.0,0.0)---(2.0,0.0)")) {
            System.out.println("\t ERROR - expected seg0.toString()=(0.0,0.0)---(2.0,0.0) ; actual=" + seg0);
        } else
            System.out.println("\t OK - expected seg0.toString()=(0.0,0.0)---(2.0,0.0) ; actual=" + seg0);

        System.out.println("Test second constructor:");
        Point pLeft = new Point(1.0, 4.0);
        Point pRight = new Point(4.0, 8.0);
        Segment1 seg2 = new Segment1(pLeft, pRight);
        if (! seg2.getPoLeft().equals(pLeft) || ! seg2.getPoRight().equals(new Point(4.0,4.0))) {
            System.out.println("\t ERROR - second Constructor - expected (1.0,0.0)---(4.0,0.0) ; actual=" + seg2);
        } else
            System.out.println("\t OK - second Constructor - expected (1.0,0.0)---(4.0,0.0) ; actual=" + seg2);

        Point pLeft1 = new Point(1.0, -2.0);
        Point pRight1 = new Point(4.0, 8.0);
        Segment1 seg2a = new Segment1(pLeft1, pRight1);
        if (! seg2a.getPoLeft().equals(pLeft1) || ! seg2a.getPoRight().equals(new Point(4.0,0.0))) {
            System.out.println("\t ERROR - second Constructor - expected (1.0,0.0)---(4.0,0.0) ; actual=" + seg2a);
        } else
            System.out.println("\t OK - second Constructor - expected (1.0,0.0)---(4.0,0.0) ; actual=" + seg2a);

        Point pLeft2b = new Point(0.5, -2.0);
        Point pRight2b = new Point(1.0, 8.0);
        Segment1 seg2b = new Segment1(pLeft2b, pRight2b);
        if (! seg2b.getPoLeft().equals(pLeft2b) || ! seg2b.getPoRight().equals(new Point(1.0,0.0))) {
            System.out.println("\t ERROR - second Constructor - expected (0.5,0.0)---(1.0,0.0) ; actual=" + seg2b);
        } else
            System.out.println("\t OK - second Constructor - expected (0.5,0.0)---(1.0,0.0) ; actual=" + seg2b);

        System.out.println("Test copy constructor:");
        Segment1 seg3 = new Segment1(seg2);
        if (! seg3.getPoLeft().equals(new Point(1.0, 4.0)) || ! seg3.getPoRight().equals(new Point(4.0,4.0))) {
            System.out.println("\t ERROR - copy Constructor - expected (1.0,4.0)---(4.0,4.0) ; actual=" + seg3);
        } else
            System.out.println("\t OK - copy Constructor - expected (1.0,4.0)---(4.0,4.0) ; actual=" + seg3);

        System.out.println("Test getLength:");
        if (seg0.getLength() != 2.0) {
            System.out.println("\t ERROR - seg0.getLength() - expected 2.0 ; actual=" + seg0.getLength());
        } else
            System.out.println("\t OK - seg0.getLength() - expected 2.0 ; actual=" + seg0.getLength());

        if (seg2.getLength() != 3.0) {
            System.out.println("\t ERROR - seg2.getLength() - expected 3.0 ; actual=" + seg2.getLength());
        } else
            System.out.println("\t OK - seg2.getLength() - expected 3.0 ; actual=" + seg2.getLength());

        if (seg2a.getLength() != 3.0) {
            System.out.println("\t ERROR - seg2a.getLength() - expected 3.0 ; actual=" + seg2a.getLength());
        } else
            System.out.println("\t OK - seg2a.getLength() - expected 3.0 ; actual=" + seg2a.getLength());
        if (seg2b.getLength() != 0.5) {
            System.out.println("\t ERROR - seg2b.getLength() - expected 0.5 ; actual=" + seg2b.getLength());
        } else
            System.out.println("\t OK - seg2b.getLength() - expected 0.5 ; actual=" + seg2b.getLength());

        System.out.println("Test equals:");
        if (! seg2.equals(seg3)){
            System.out.println("\t ERROR - equals - seg2.equals(seg3)? - expected true ; actual=" + seg2.equals(seg3));
        } else
            System.out.println("\t OK - equals - seg2.equals(seg3)? - expected true ; actual=" + seg2.equals(seg3));

        if ( seg2a.equals(seg2b)){
            System.out.println("\t ERROR - equals - seg2.equals(seg3)? - expected false ; actual=" + seg2a.equals(seg2b));
        } else
            System.out.println("\t OK - equals - seg2.equals(seg3)? - expected false ; actual=" + seg2a.equals(seg2b));

        Segment1 s1 = new Segment1(5.0, 1.0, 10.0, 1.0);
        Segment1 s3= new Segment1(5.0, 3.0, 10.0, 3.0);
        Segment1 s4= new Segment1(5.0, 0.0, 10.0, 0.0);
        Segment1 sa=new Segment1(11.0, 0.0, 15.0, 0.0);
        System.out.println("Test isUnder:");
        if (! s1.isUnder(s3)) {//true
            System.out.println("\t ERROR - s1.isUnder(s3) - expected true ; actual=" + s1.isUnder(s3) + " s1=" + s1 + " s3=" + s3);
        } else
            System.out.println("\t OK - s1.isUnder(s3) - expected true ; actual=" + s1.isUnder(s3) + " s1=" + s1 + " s3=" + s3);

        if (s3.isUnder(s4)) {//false
            System.out.println("\t ERROR - s3.isUnder(s4) - expected false ; actual=" + s3.isUnder(s4) + " s3=" + s3 + " s4=" + s4);
        } else
            System.out.println("\t OK - s3.isUnder(s4) - expected false ; actual=" + s3.isUnder(s4) + " s3=" + s3 + " s4=" + s4);

        if ( sa.isUnder(s4)) {//false
            System.out.println("\t ERROR - sa.isUnder(s4) - expected false ; actual=" + sa.isUnder(s4) + " sa=" + sa + " s4=" + s4);
        } else
            System.out.println("\t OK - sa.isUnder(s4) - expected false ; actual=" + sa.isUnder(s4) + " sa=" + sa + " s4=" + s4);

        System.out.println("Test isAbove:");
        if ( !s1.isAbove(s4)) {
            System.out.println("\t ERROR - s1.isAbove(s4) - expected true ; actual=" + s1.isAbove(s4) + " s1=" + s1 + " s4=" + s4);
        } else
            System.out.println("\t OK - s1.isAbove(s4) - expected true ; actual=" + s1.isAbove(s4) + " s1=" + s1 + " s4=" + s4);
        if ( !s3.isAbove(s4)) {//true
            System.out.println("\t ERROR - s3.isUnder(s4) - expected false ; actual=" + s3.isUnder(s4) + " s3=" + s3 + " s4=" + s4);
        } else
            System.out.println("\t OK - s3.isUnder(s4) - expected false ; actual=" + s3.isUnder(s4) + " s3=" + s3 + " s4=" + s4);
        if ( sa.isAbove(s4)) {//false
            System.out.println("\t ERROR - sa.isUnder(s4) - expected false ; actual=" + sa.isUnder(s4) + " sa=" + sa + " s4=" + s4);
        } else
            System.out.println("\t OK - sa.isUnder(s4) - expected false ; actual=" + sa.isUnder(s4) + " sa=" + sa + " s4=" + s4);

        Segment1 sMid = new Segment1(5.0, 0.0, 10.0, 0.0);
        Segment1 sMidLef = new Segment1(3.0, 0.0, 7.0, 0.0);
        Segment1 sLeft= new Segment1(0.0, 3.0, 4.0, 3.0);
        Segment1 sRight= new Segment1(11.0, 0.0, 15.0, 0.0);
        System.out.println("Test isLeft:");
        if (! sMid.isLeft(sRight)) {
            System.out.println("\t ERROR - sMid.isLeft(sRight) - expected true ; actual=" + sMid.isLeft(sRight) + " sMid=" + sMid + " sRight=" + sRight);
        } else
            System.out.println("\t OK - sMid.isLeft(sRight) - expected true ; actual=" + sMid.isLeft(sRight) + " sMid=" + sMid + " sRight=" + sRight);

        if ( sMid.isLeft(sMidLef)) {
            System.out.println("\t ERROR - sMid.isLeft(sMidLef) - expected false ; actual=" + sMid.isLeft(sMidLef) + " sMid=" + sMid + " sMidLef=" + sMidLef);
        } else
            System.out.println("\t OK - sMid.isLeft(sRight) - expected false ; actual=" + sMid.isLeft(sMidLef) + " sMid=" + sMid + " sMidLef=" + sMidLef);

        if (! sMidLef.isLeft(sMid)) {
            System.out.println("\t ERROR - sMidLef.isLeft(sMid) - expected false ; actual=" + sMidLef.isLeft(sMid) + " sMidLef=" + sMidLef + " sMid=" + sMid);
        } else
            System.out.println("\t OK - sMid.isLeft(sRight) - expected false ; actual=" + sMidLef.isLeft(sMid) + " sMidLef=" + sMidLef + " sMid=" + sMid);

        System.out.println("Test isRight:");
        if (! sMid.isRight(sLeft)) {
            System.out.println("\t ERROR - sMid.isRight(sLeft) - expected true ; actual=" + sMid.isRight(sLeft) + " sMid=" + sMid + " sLeft=" + sLeft);
        } else
            System.out.println("\t OK - sMid.isRight(sLeft) - expected true ; actual=" + sMid.isRight(sLeft) + " sMid=" + sMid + " sLeft=" + sLeft);

        if (! sMid.isRight(sMidLef)) {
            System.out.println("\t ERROR - sMid.isLeft(sMidLef) - expected false ; actual=" + sMid.isLeft(sMidLef) + " sMid=" + sMid + " sMidLef=" + sMidLef);
        } else
            System.out.println("\t OK - sMid.isLeft(sRight) - expected false ; actual=" + sMid.isLeft(sMidLef) + " sMid=" + sMid + " sMidLef=" + sMidLef);

        if ( sMidLef.isRight(sMid)) {
            System.out.println("\t ERROR - sMidLef.isRight(sMid) - expected false ; actual=" + sMidLef.isRight(sMid) + " sMidLef=" + sMidLef + " sMid=" + sMid);
        } else
            System.out.println("\t OK - sMid.isRight(sRight) - expected false ; actual=" + sMidLef.isRight(sMid) + " sMidLef=" + sMidLef + " sMid=" + sMid);

        System.out.println("Test moveHorizontal:");
        sMid.moveHorizontal(5.0);
        Point pL = new Point(10.0,0.0);
        Point pR = new Point(15.0,0.0);
        if (! sMid.getPoLeft().equals(pL) || ! sMid.getPoRight().equals(pR))  {
            System.out.println("\t ERROR - after moveHorizontal - expected (10.0,0.0)---(15.0,0.0) ; actual=" + sMid);
        } else
            System.out.println("\t OK - after moveHorizontal - expected (10.0,0.0)---(15.0,0.0) ; actual=" + sMid);

        sLeft.moveHorizontal(-2.0);
        Point pL1 = new Point(0.0,3.0);
        Point pR1 = new Point(2.0,3.0);
        if (! sLeft.getPoLeft().equals(pL1) || ! sLeft.getPoRight().equals(pR1))  {
            System.out.println("\t ERROR - after moveHorizontal - expected (0.0,3.0)---(2.0,3.0) ; actual=" + sLeft);
        } else
            System.out.println("\t OK - after moveHorizontal - expected (0.0,3.0)---(2.0,3.0) ; actual=" + sLeft);

        System.out.println("Test moveVertical:");
        sMidLef.moveVertical(5.0);
        Point pUL = new Point (3.0, 5.0);
        Point pUR = new Point (7.0, 5.0);
        if (! sMidLef.getPoLeft().equals(pUL) || ! sMidLef.getPoRight().equals(pUR))  {
            System.out.println("\t ERROR - after moveVertical - expected (3.0,5.0)---(7.0,5.0) ; actual=" + sMidLef);
        } else
            System.out.println("\t OK - after moveVertical - expected (3.0,5.0)---(7.0,5.0) ; actual=" + sMidLef);

        sMidLef.moveVertical(-5.0);
        Point pUL1 = new Point (3.0, 0.0);
        Point pUR1 = new Point (7.0, 0.0);
        if (! sMidLef.getPoLeft().equals(pUL1) || ! sMidLef.getPoRight().equals(pUR1))  {
            System.out.println("\t ERROR - after moveVertical - expected (3.0,0.0)---(7.0,0.0) ; actual=" + sMidLef);
        } else
            System.out.println("\t OK - after moveVertical - expected (3.0,0.0)---(7.0,0.0) ; actual=" + sMidLef);

        System.out.println("Test changeSize:");
        s1 = new Segment1(0.0, 0.0, 2.0, 0.0);
        s1.changeSize(3.0);
        if (s1.getLength() != 5.0 ) {
            System.out.println("\t ERROR - s1.changeSize() - expected length 5.0 ; actual=" + s1.getLength());
        } else
            System.out.println("\t OK - s1.getLength() - expected length 5.0 ; actual=" + s1.getLength());
        s1 = new Segment1(0.0, 0.0, 2.0, 0.0);
        s1.changeSize(-1.0);
        if (s1.getLength() != 1.0 ) {
            System.out.println("\t ERROR - s1.changeSize() - expected length 1.0 ; actual=" + s1.getLength());
        } else
            System.out.println("\t OK - s1.getLength() - expected length 1.0 ; actual=" + s1.getLength());

        Segment1 s1a = new Segment1(0.0, 0.0, 2.0, 0.0);
        s1a.changeSize(-2.0);
        if (s1a.getLength() != 0.0 ) {
            System.out.println("\t ERROR - s1a.changeSize() - expected length 0.0 ; actual=" + s1a.getLength());
        } else
            System.out.println("\t OK - s1a.getLength() - expected length 0.0 ; actual=" + s1a.getLength());

        Segment1 s1c = new Segment1(5.0, 0.0, 10.0, 0.0);
        s1c.changeSize(-6.0);
        if (s1c.getLength() != 5.0 ) {
            System.out.println("\t ERROR - s1c.changeSize() - expected length 5.0 ; actual=" + s1c.getLength());
        } else
            System.out.println("\t OK - s1c.getLength() - expected length 5.0 ; actual=" + s1c.getLength());

        System.out.println("Test pointOnSegment:");
        Point p = new Point (1.0, 0.0); 
        if (!s1.pointOnSegment(p)) {
            System.out.println("\t ERROR - s1.pointOnSegment(p) - expected true ; actual=" + s1.pointOnSegment(p));
        } else
            System.out.println("\t OK - s1.pointOnSegment(p) - expected true ; actual=" + s1.pointOnSegment(p));
        Point p1 = new Point (-2.0, 1.0); 
        if (s1.pointOnSegment(p1)) {
            System.out.println("\t ERROR - s1.pointOnSegment(p1) - expected false ; actual=" + s1.pointOnSegment(p1));
        } else
            System.out.println("\t OK - s1.pointOnSegment(p1) - expected false ; actual=" + s1.pointOnSegment(p1));
        Point p2 = new Point (11.0, 1.0); 
        if (sa.pointOnSegment(p2)) {
            System.out.println("\t ERROR - sa.pointOnSegment(p2) - expected false ; actual=" + sa.pointOnSegment(p2));
        } else
            System.out.println("\t OK - sa.pointOnSegment(p2) - expected false ; actual=" + sa.pointOnSegment(p2));

        System.out.println("Test isBigger:");
        s1 = new Segment1(0.0, 0.0, 2.0, 0.0);
        Segment1 s2 = new Segment1(0.0, 2.0, 4.0, 2.0);     

        if (! s2.isBigger(s1)) {
            System.out.println("\t ERROR - s2.isBigger(s1) - expected true ; actual=" + s2.isBigger(s1));
        } else
            System.out.println("\t OK - s2.isBigger(s1) - expected true ; actual=" + s2.isBigger(s1));
        s1 = new Segment1(0.0, -1.0, 2.0, 0.0);
        s2 = new Segment1(0.0, 2.0, 4.0, 2.0);      

        if (! s2.isBigger(s1)) {
            System.out.println("\t ERROR - s2.isBigger(s1) - expected true ; actual=" + s2.isBigger(s1));
        } else
            System.out.println("\t OK - s2.isBigger(s1) - expected true ; actual=" + s2.isBigger(s1));
        s1 = new Segment1(0.0, 2.0, 2.0, 0.0);
        s2 = new Segment1(0.0, 2.0, 1.0, 2.0);      

        if ( s2.isBigger(s1)) {
            System.out.println("\t ERROR - s2.isBigger(s1) - expected false ; actual=" + s2.isBigger(s1));
        } else
            System.out.println("\t OK - s2.isBigger(s1) - expected false ; actual=" + s2.isBigger(s1));

        sMid = new Segment1(5.0, 0.0, 10.0, 0.0);
        sMidLef = new Segment1(3.0, 0.0, 7.0, 0.0);
        sLeft= new Segment1(0.0, 3.0, 4.0, 3.0);
        sRight= new Segment1(11.0, 0.0, 15.0, 0.0);
        Segment1 sIncluded= new Segment1 (1.0,3.0,2.0,3.0);
        Segment1 sIncluding = new Segment1 (0.0, 0.0, 12.0, 0.0);
        System.out.println("Test overlap:");

        if (sMidLef.overlap(sMid) != 2.0) {
            System.out.println("\t ERROR - sMidLef.overlap(sMid) - expected 2.0 ; actual=" + sMidLef.overlap(sMid) + " sMidLef=" + sMidLef + " sMid=" + sMid);
        } else
            System.out.println("\t OK - sMidLef.overlap(sMid) - expected 2.0 ; actual=" + sMidLef.overlap(sMid) + " sMidLef=" + sMidLef + " sMid=" + sMid);

        if (sMid.overlap(sLeft) != 0.0) {
            System.out.println("\t ERROR - sMid.overlap(sLeft) - expected 0.0 ; actual=" + sMid.overlap(sLeft) + " sMid=" + sLeft + " sMid=" + sLeft);
        } else
            System.out.println("\t OK - sMid.overlap(sLeft) - expected 0.0 ; actual=" + sMid.overlap(sLeft) + " sMid=" + sLeft + " sMid=" + sLeft);

        if (sMid.overlap(sMidLef) != 2.0) {
            System.out.println("\t ERROR - sMid.overlap(sMidLef) - expected 2.0 ; actual=" + sMid.overlap(sMidLef) + " sMid=" + sMid + " sMidLef=" + sMidLef);
        } else
            System.out.println("\t OK - sMid.overlap(sMidLef) - expected 2.0 ; actual=" + sMid.overlap(sMidLef) + " sMid=" + sMid + " sMidLef=" + sMidLef);

        if (sLeft.overlap(sRight) != 0.0) {
            System.out.println("\t ERROR - sLest.overlap(sRight) - expected 0.0 ; actual=" + sLeft.overlap(sRight) + " sLeft=" + sLeft + " sRight=" + sRight);
        } else
            System.out.println("\t OK - sMidLef.overlap(sMid) - expected 0.0 ; actual=" + sLeft.overlap(sRight) + " sLeft=" + sLeft + " sRight=" + sRight);

        if (sIncluded.overlap(sLeft) != 1.0) {
            System.out.println("\t ERROR - sIncluded.overlap(sLeft) - expected 1.0 ; actual=" + sIncluded.overlap(sLeft) + " sIncluded=" + sIncluded + " sLeft=" + sLeft);
        } else
            System.out.println("\t OK - sIncluded.overlap(sLeft) - expected 1.0 ; actual=" + sIncluded.overlap(sLeft) + " sIncluded=" + sIncluded + " sLeft=" + sLeft);

        if (sMid.overlap(sIncluding) != 5.0) {
            System.out.println("\t ERROR - sMid.overlap(sIncluding) - expected 5.0 ; actual=" + sMid.overlap(sIncluding) + " sMid=" + sMid + " sIncluding=" + sIncluding);
        } else
            System.out.println("\t OK - sMid.overlap(sIncluding) - expected 5.0 ; actual=" + sMid.overlap(sIncluding) + " sMid=" + sMid + " sIncluding=" + sIncluding);

        System.out.println("Test trapezePerimeter:");
        Segment1 sTr1 = new Segment1(2.0, 4.0, 13.0, 4.0);
        Segment1 sTr2 = new Segment1(5.0, 0.0, 10.0, 0.0);

        if (sTr1.trapezePerimeter(sTr2) != 26.0) {
            System.out.println("\t ERROR - sTr1.trapezePerimeter(sTr2) - expected 26.0 ; actual=" + sTr1.trapezePerimeter(sTr2) + " sTr1=" + sTr1 + " sTr2=" + sTr2);
        } else
            System.out.println("\t OK - sTr1.trapezePerimeter(sTr2) - expected 26.0 ; actual=" + sTr1.trapezePerimeter(sTr2) + " sTr1=" + sTr1 + " sTr2=" + sTr2);

        Segment1 sTr3 = new Segment1(-2.0, 4.0, 2.0, 4.0);
        Segment1 sTr4 = new Segment1(0.0, 4.0, 2.0, 4.0);

        if (sTr3.trapezePerimeter(sTr4) !=4) {
            System.out.println("\t ERROR - sTr3.trapezePerimeter(sTr4) - expected 4; actual=" + sTr3.trapezePerimeter(sTr4) + " sTr3=" + sTr3 + " sTr4=" + sTr4);
        } else
            System.out.println("\t OK - sTr3.trapezePerimeter(sTr4) - expected 4 ; actual=" + sTr3.trapezePerimeter(sTr4) + " sTr3=" + sTr3 + " sTr4=" + sTr4);

        System.out.println("********** Test Q2 Segment1 - Finish **********\n");
    }
}