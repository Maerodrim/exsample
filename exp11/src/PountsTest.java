import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PountsTest {
    @Test(groups={"unit1"})
    public void testPounts(){
        Point firstPoint = new Point (1 ,1 , 1);
        Point secondPoint = new Point(0,0,0);

        assertEquals(firstPoint.length(firstPoint), Math.sqrt(3), 0.0001);
        assertEquals(secondPoint.length(secondPoint), 0, 0.0001);

        assertEquals(firstPoint.pointX, 1, 0.0001);
        assertEquals(firstPoint.pointY, 1, 0.0001);
        assertEquals(firstPoint.pointZ, 1, 0.0001);

        assertEquals(Pounts.sum(firstPoint, secondPoint).pointX, 1, 0.0001);
        assertEquals(Pounts.sum(firstPoint, secondPoint).pointY, 1, 0.0001);
        assertEquals(Pounts.sum(firstPoint, secondPoint).pointZ, 1, 0.0001);

        assertEquals(Pounts.subtract(firstPoint, secondPoint).pointX, 1, 0.0001);
        assertEquals(Pounts.subtract(firstPoint, secondPoint).pointY, 1, 0.0001);
        assertEquals(Pounts.subtract(firstPoint, secondPoint).pointZ, 1, 0.0001);

        assertEquals(Pounts.multiply(firstPoint, secondPoint).pointX, 0, 0.0001);
        assertEquals(Pounts.multiply(firstPoint, secondPoint).pointY, 0, 0.0001);
        assertEquals(Pounts.multiply(firstPoint, secondPoint).pointZ, 0, 0.0001);

        assertEquals(Pounts.divide(secondPoint, firstPoint).pointX, 0, 0.0001);
        assertEquals(Pounts.divide(secondPoint, firstPoint).pointY, 0, 0.0001);
        assertEquals(Pounts.divide(secondPoint, firstPoint).pointZ, 0, 0.0001);

        assertEquals(Pounts.enlarge(firstPoint, 5).pointX, 5, 0.0001);
        assertEquals(Pounts.enlarge(firstPoint, 5).pointY, 5, 0.0001);
        assertEquals(Pounts.enlarge(firstPoint, 5).pointZ, 5, 0.0001);

        assertEquals(Pounts.opposite(firstPoint).pointX, -1, 0.0001);
        assertEquals(Pounts.opposite(firstPoint).pointY, -1, 0.0001);
        assertEquals(Pounts.opposite(firstPoint).pointZ, -1, 0.0001);

        assertEquals(Pounts.inverse(firstPoint).pointX, 1, 0.0001);
        assertEquals(Pounts.inverse(firstPoint).pointY, 1, 0.0001);
        assertEquals(Pounts.inverse(firstPoint).pointZ, 1, 0.0001);

        assertEquals(Pounts.scalarProduct(firstPoint, secondPoint), 0, 0.0001);

        assertEquals(Pounts.vectorProduct(firstPoint, secondPoint).pointX, 0, 0.0001);
        assertEquals(Pounts.vectorProduct(firstPoint, secondPoint).pointY, 0, 0.0001);
        assertEquals(Pounts.vectorProduct(firstPoint, secondPoint).pointZ, 0, 0.0001);




    }
}