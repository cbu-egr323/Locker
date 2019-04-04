import Assignment7.Triangle;
import Assignment7.UseTriangle;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Alicia Locker - UseTriangleTst.java - EGR326 - CBU - 3/28/2019
 */
public class UseTriangleTst {
    UseTriangle useTriangle = new UseTriangle();
    @Test
    public void testStringCheckInput(){
        Assert.assertFalse(useTriangle.checkInput("null"));
        Assert.assertFalse(useTriangle.checkInput("dummyValue"));
        Assert.assertFalse(useTriangle.checkInput("this is not a number"));
        Assert.assertFalse(useTriangle.checkInput("0"));
    }

    @Test
    public void testZeroAndNegativeInput(){
        Assert.assertFalse(useTriangle.checkInput("0"));
        Assert.assertFalse(useTriangle.checkInput("0.0"));
        Assert.assertFalse(useTriangle.checkInput("-1"));
        Assert.assertFalse(useTriangle.checkInput("-99"));
        Assert.assertFalse(useTriangle.checkInput("-56"));
    }

    @Test
    public void testTrueCheckInput(){
        Assert.assertTrue(useTriangle.checkInput("1"));
        Assert.assertTrue(useTriangle.checkInput("100"));
        Assert.assertTrue(useTriangle.checkInput("10000"));
        Assert.assertTrue(useTriangle.checkInput("23781"));
        Assert.assertTrue(useTriangle.checkInput("1237981"));
        Assert.assertTrue(useTriangle.checkInput("13434134"));
        Assert.assertTrue(useTriangle.checkInput("341"));
        Assert.assertTrue(useTriangle.checkInput("425451"));
        Assert.assertTrue(useTriangle.checkInput("423541"));
    }

    @Test
    public void testGetEquilateralTriangle(){
        List<Triangle> EqTriangles = new ArrayList<>();

        EqTriangles.add( new Triangle(1,1,1));
        EqTriangles.add( new Triangle(1234,1234,1234));
        EqTriangles.add(new Triangle(1341, 1341, 1341));
        EqTriangles.add(new Triangle(65754, 65754,65754));

        for(Triangle triangle: EqTriangles){
            Assert.assertTrue(triangle.isEquilateral());
        }

    }

    @Test
    public void testGetScaleneTriangle(){
        List<Triangle> SCTriangles = new ArrayList<>();
        SCTriangles.add(new Triangle(1,2,3));
        SCTriangles.add(new Triangle(4,5,6));
        SCTriangles.add(new Triangle(67,78,98));
        SCTriangles.add(new Triangle(2435.465786, 5678, 2432.234));

        for(Triangle triangle: SCTriangles){
            Assert.assertTrue(triangle.isScalene());
        }
    }

    @Test
    public void testGetIsoscelesTriangle(){
        List<Triangle> ISTriangles = new ArrayList<>();
        ISTriangles.add(new Triangle(123, 123, 5346));
        ISTriangles.add(new Triangle(432524,24,24));
        ISTriangles.add(new Triangle(234,234,5467));
        ISTriangles.add(new Triangle(1343215,2345425,1343215));

        for(Triangle triangle: ISTriangles){
            Assert.assertTrue(triangle.isIsosceles());
        }
    }





}
