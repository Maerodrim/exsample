import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PountsTest {
    @Test(groups={"unit1"})
    public void testPounts(){
        Point firstPoints = new Point (1 ,1 , 1);
        Point secondPoints = new Point(0,0,0);
    }
    Point firstPoint = new Point (1 ,1 , 1);
    Point secondPoint = new Point(0,0,0);
        @Test(groups={"unit1"})
        public void testPountslength(){
        assertEquals(firstPoint.length(firstPoint), Math.sqrt(3), 0.0001);
        assertEquals(secondPoint.length(secondPoint), 0, 0.0001);}
        @Test(groups={"unit1"})
        public void testPountsXYZ(){
        assertEquals(firstPoint.pointX, 1, 0.0001);
        assertEquals(firstPoint.pointY, 1, 0.0001);
        assertEquals(firstPoint.pointZ, 1, 0.0001);}
        @Test(groups={"unit1"})
        public void testPountsSum(){
        assertEquals(Pounts.sum(firstPoint, secondPoint).pointX, 1, 0.0001);
        assertEquals(Pounts.sum(firstPoint, secondPoint).pointY, 1, 0.0001);
        assertEquals(Pounts.sum(firstPoint, secondPoint).pointZ, 1, 0.0001);}
        @Test(groups={"unit1"})
        public void testPountsSubtract(){
        assertEquals(Pounts.subtract(firstPoint, secondPoint).pointX, 1, 0.0001);
        assertEquals(Pounts.subtract(firstPoint, secondPoint).pointY, 1, 0.0001);
        assertEquals(Pounts.subtract(firstPoint, secondPoint).pointZ, 1, 0.0001);}
        @Test(groups={"unit1"})
        public void testPountsMultiply(){
        assertEquals(Pounts.multiply(firstPoint, secondPoint).pointX, 0, 0.0001);
        assertEquals(Pounts.multiply(firstPoint, secondPoint).pointY, 0, 0.0001);
        assertEquals(Pounts.multiply(firstPoint, secondPoint).pointZ, 0, 0.0001);}
        @Test(groups={"unit1"})
        public void testPountsDivide(){
        assertEquals(Pounts.divide(secondPoint, firstPoint).pointX, 0, 0.0001);
        assertEquals(Pounts.divide(secondPoint, firstPoint).pointY, 0, 0.0001);
        assertEquals(Pounts.divide(secondPoint, firstPoint).pointZ, 0, 0.0001);}
        @Test(groups={"unit1"})
        public void testPountsEnlarge(){
        assertEquals(Pounts.enlarge(firstPoint, 5).pointX, 5, 0.0001);
        assertEquals(Pounts.enlarge(firstPoint, 5).pointY, 5, 0.0001);
        assertEquals(Pounts.enlarge(firstPoint, 5).pointZ, 5, 0.0001);}
        @Test(groups={"unit1"})
        public void testPountsOpposite(){
        assertEquals(Pounts.opposite(firstPoint).pointX, -1, 0.0001);
        assertEquals(Pounts.opposite(firstPoint).pointY, -1, 0.0001);
        assertEquals(Pounts.opposite(firstPoint).pointZ, -1, 0.0001);}
        @Test(groups={"unit1"})
        public void testPountsInverse(){
        assertEquals(Pounts.inverse(firstPoint).pointX, 1, 0.0001);
        assertEquals(Pounts.inverse(firstPoint).pointY, 1, 0.0001);
        assertEquals(Pounts.inverse(firstPoint).pointZ, 1, 0.0001);}
        @Test(groups={"unit1"})
        public void testPountsScalarProduct(){
        assertEquals(Pounts.scalarProduct(firstPoint, secondPoint), 0, 0.0001);}
        @Test(groups={"unit1"})
        public void testPountsVectorProduct(){
        assertEquals(Pounts.vectorProduct(firstPoint, secondPoint).pointX, 0, 0.0001);
        assertEquals(Pounts.vectorProduct(firstPoint, secondPoint).pointY, 0, 0.0001);
        assertEquals(Pounts.vectorProduct(firstPoint, secondPoint).pointZ, 0, 0.0001);}




}
