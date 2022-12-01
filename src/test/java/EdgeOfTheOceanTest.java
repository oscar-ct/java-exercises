import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EdgeOfTheOceanTest {

    private final EdgeOfTheOcean edgeOfTheOcean = new EdgeOfTheOcean();

    @Test
    public void testAdjacentElementsProducts() {
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        int[] inputArray2 = {-1, -2};
        int[] inputArray3 = {5, 1, 2, 3, 1, 4};
        Assert.assertEquals(21, edgeOfTheOcean.adjacentElementsProduct(inputArray));
        Assert.assertEquals(2, edgeOfTheOcean.adjacentElementsProduct(inputArray2));
        Assert.assertEquals(6, edgeOfTheOcean.adjacentElementsProduct(inputArray3));
    }
    @Test
    public void testShapeArea() {
        int inputInt = 2;
        int inputInt2 = 3;
        int inputInt3 = 1;
        assertEquals(5, edgeOfTheOcean.shapeArea(inputInt));
        assertEquals(13, edgeOfTheOcean.shapeArea(inputInt2));
        assertEquals(1, edgeOfTheOcean.shapeArea(inputInt3));
    }
    @Test
    public void testMakeArrayConsecutive2() {
        int[] inputArray = {6, 2, 3, 8};
        int[] inputArray2 = {0, 3};
        int[] inputArray3 = {5, 4, 6};
        assertEquals(3, edgeOfTheOcean.makeArrayConsecutive2(inputArray));
        assertEquals(2, edgeOfTheOcean.makeArrayConsecutive2(inputArray2));
        assertEquals(0, edgeOfTheOcean.makeArrayConsecutive2(inputArray3));
    }
    @Test
    public void testAlmostIncreasingSequence() {
        int[] inputArray = {1, 3, 2, 1};
        int[] inputArray2 = {1, 3, 2};
        int[] inputArray3 = {1, 2, 1, 2};
        assertFalse(edgeOfTheOcean.almostIncreasingSequence(inputArray));
        assertTrue(edgeOfTheOcean.almostIncreasingSequence(inputArray2));
        assertFalse(edgeOfTheOcean.almostIncreasingSequence(inputArray3));
    }
    @Test
    public void testMatrixElementsSum() {
        int[][] matrix = {{0,1,1,2}, {0,5,0,0}, {2,0,3,3}};
        int[][] matrix2 = {{1,1,1,0}, {0,5,0,1}, {2,1,3,10}};
        int[][] matrix3 = {{1,1,1}, {2,2,2}, {3,3,3}};
        assertEquals(9, edgeOfTheOcean.matrixElementsSum(matrix));
        assertEquals(9, edgeOfTheOcean.matrixElementsSum(matrix2));
        assertEquals(18, edgeOfTheOcean.matrixElementsSum(matrix3));
    }

}

