package Assignment7;

import java.util.Scanner;

public class TriangleInput
{

    public static void main(String args[]) {

        System.out.println("Please enter 3 number lengths for each side of the" +
                " triangle. Press enter after each number.");

        Scanner sideA = new Scanner(System.in);
        String sA = sideA.nextLine();
        System.out.println("Side A: " + (sA));

        Scanner sideB = new Scanner(System.in);
        String sB = sideB.nextLine();
        System.out.println("Side B: " + (sB));

        Scanner sideC = new Scanner(System.in);
        String sC = sideC.nextLine();
        System.out.println("Side C: " + (sC));

        double test;
        try {
            test = Double.valueOf(sA);
        } catch (NumberFormatException bad) {
            System.out.println("ERROR! Non-numerical value has been entered. (Side A)");
            System.exit(0);
        }
        try {
            test = Double.valueOf(sB);
        } catch (NumberFormatException bad) {
            System.out.println("ERROR! Non-numerical value has been entered. (Side B)");
            System.exit(0);
        }
        try {
            test = Double.valueOf(sC);
        } catch (NumberFormatException bad) {
            System.out.println("ERROR! Non-numerical value has been entered. (Side C)");
            System.exit(0);
        }
        double s1 = Double.valueOf(sA);
        double s2 = Double.valueOf(sB);
        double s3 = Double.valueOf(sC);

        //System.out.println("(Just a temp test) Side A+B+C= " + (s1 + s2 + s3)); //just a temp test

        //**********************************************************************
        //*********Now determining which type of triangle*************************
        if (
                ((s1 + s2) < s3) ||
                ((s1 + s3) < s2) ||
                ((s2 + s3) < s1) ) {
            System.out.println("Error, not a valid triangle!");
        } else { //check if invalid, else check for what type it is
            Triangle triangle = new Triangle(s1, s2, s3);

            triangle.isEquilateral();
            triangle.isScalene();
            triangle.isIsosceles();
        }
    }
}