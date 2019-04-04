import Assignment7.Triangle;
import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;

/**
 * Alicia Locker - TriangleTst.java - EGR326 - CBU - 3/28/2019
 */
public class TriangleTst {

    @Test
    public void testTriangleConstructorGetters() {
        Triangle triangleA = new Triangle(1, 2, 3);
        Assert.assertEquals(triangleA.getS1(), 1, 0);
        Assert.assertEquals(triangleA.getS2(), 2, 0);
        Assert.assertEquals(triangleA.getS3(), 3, 0);
    }
    
    @Test
    public void testIsEquilateral() {
        for (Triangle triangle : equilateralTriangleHelper())
            Assert.assertTrue("The triangle is EQUILATERAL!", triangle.isEquilateral());
    }

    @Test
    public void testIsNotEquilateral() {
        for (Triangle triangle : scaleneTriangleHelper())
            Assert.assertFalse(triangle.isEquilateral());

        for (Triangle triangle : isoscelesTriangleHelper())
            Assert.assertFalse(triangle.isEquilateral());
    }

    @Test
    public void testIsScalene() {
        for (Triangle triangle : scaleneTriangleHelper())
            Assert.assertTrue("The triangle is Scalene", triangle.isScalene());
    }

    @Test
    public void testIsNotScalene() {
        for (Triangle triangle : isoscelesTriangleHelper())
            Assert.assertFalse(triangle.isScalene());

        for (Triangle triangle : equilateralTriangleHelper())
            Assert.assertFalse(triangle.isScalene());
    }

    @Test
    public void testIsIsosceles() {
        for (Triangle triangle : isoscelesTriangleHelper())
            Assert.assertTrue(triangle.isIsosceles());
    }

    @Test
    public void testIsNotIsosceles() {
        for (Triangle triangle : scaleneTriangleHelper())
            Assert.assertFalse(triangle.isIsosceles());

        for (Triangle triangle : equilateralTriangleHelper())
            Assert.assertFalse(triangle.isIsosceles());
    }

    @Test
    public void testNotATriangleTrue(){
        for(Triangle triangle : notATriangleHelper()){
            Assert.assertTrue(triangle.NotATriangle());
        }
    }

    @Test
    public void testNotATriangleFalse(){
        for(Triangle triangle: equilateralTriangleHelper()){
            Assert.assertFalse(triangle.NotATriangle());
        }

        for(Triangle triangle: scaleneTriangleHelper()){
            Assert.assertFalse(triangle.NotATriangle());
        }

        for(Triangle triangle:isoscelesTriangleHelper()){
            Assert.assertFalse(triangle.NotATriangle());
        }
    }

    //Helpers generated to help test the triangle class based on the type of triangles
    private ArrayList<Triangle> equilateralTriangleHelper() {
        ArrayList<Triangle> equilateral = new ArrayList<>();
        equilateral.add(new Triangle(1324, 1324, 1324));
        equilateral.add(new Triangle(12, 12, 12));
        equilateral.add(new Triangle(45, 45, 45));
        equilateral.add(new Triangle(5445, 5445, 5445));
        equilateral.add(new Triangle(132, 132, 132));
        equilateral.add(new Triangle(32143, 32143, 32143));
        equilateral.add(new Triangle(1234567890, 1234567890, 1234567890));
        equilateral.add(new Triangle(12, 12, 12));
        equilateral.add(new Triangle(34, 34, 34));
        equilateral.add(new Triangle(546, 546, 546));
        return equilateral;
    }

    private ArrayList<Triangle> scaleneTriangleHelper() {
        ArrayList<Triangle> scalene = new ArrayList<>();
        scalene.add(new Triangle(4, 2, 3));
        scalene.add(new Triangle(2, 3, 4));
        scalene.add(new Triangle(20, 30, 32));
        scalene.add(new Triangle(14, 32, 19));
        scalene.add(new Triangle(16, 36, 47));
        scalene.add(new Triangle(410000, 600000, 360000));
        scalene.add(new Triangle(280, 330, 600));
        scalene.add(new Triangle(58, 43, 18));
        scalene.add(new Triangle(9, 5, 6));
        scalene.add(new Triangle(43, 9, 40));
        return scalene;
    }

    private ArrayList<Triangle> isoscelesTriangleHelper() {
        ArrayList<Triangle> isosceles = new ArrayList<>();
        isosceles.add(new Triangle(213, 213, 23));
        isosceles.add(new Triangle(430, 430, 123));
        isosceles.add(new Triangle(1230, 1230, 321));
        isosceles.add(new Triangle(23, 567534, 567534));
        isosceles.add(new Triangle(8234, 8234, 5324));
        isosceles.add(new Triangle(534360, 354656, 534360));
        isosceles.add(new Triangle(12, 45, 45));
        isosceles.add(new Triangle(424, 43, 424));
        isosceles.add(new Triangle(9675, 9675, 8796));
        isosceles.add(new Triangle(90809808, 90809808, 2254));
        return isosceles;
    }

    private ArrayList<Triangle> notATriangleHelper(){
        ArrayList<Triangle> notTriangles = new ArrayList<>();
        notTriangles.add(new Triangle(1.0, 3.0, 5.0));
        notTriangles.add(new Triangle(3, 4, 9));
        notTriangles.add(new Triangle(9, 13, 24));
        notTriangles.add(new Triangle(7, 9, 16));
        notTriangles.add(new Triangle(5, 13, 21));
        notTriangles.add(new Triangle(3, 8, 15));
        notTriangles.add(new Triangle(3,8,14));
        notTriangles.add(new Triangle(1,2,3));
        notTriangles.add(new Triangle(12,6,5));
        return notTriangles;
    }


}
