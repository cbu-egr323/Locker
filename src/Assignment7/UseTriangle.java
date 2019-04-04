package Assignment7;

import java.util.Scanner;

public class UseTriangle {
    //used for sides
    private final char[] LETTERS = {'A', 'B', 'C'};

    public static void main(String[] args) {
        UseTriangle useTriangle = new UseTriangle();
        useTriangle.userInput();
    }

    //takes in userinput for the sides
    public void userInput() {
        double[] sideArray = new double[3];
        System.out.println("Please enter 3 number lengths for each side of the" + " triangle. Press enter after each number.");
        for (int i = 0; i < 3; i++) {
            Scanner side = new Scanner(System.in);
            String checkSide = side.nextLine();
            //calls a method to check if it is a number and if it is greater than zero
            if(!checkInput(checkSide)){
                //allows user to enter new inputs
                goAgain();
            }
            double addSide = Double.valueOf(checkSide);
            sideArray[i] = addSide;
            System.out.println("Side " + LETTERS[i] + ": " + addSide);
        }
        //sends in an array of sides to helper method
        getTriangle(sideArray);
    }

    //creates a triangle and calls triangle type to check what kind of triangle it is
    private void getTriangle(double[] sideArray){
        Triangle triangleType = new Triangle(sideArray[0], sideArray[1], sideArray[2]);
        triangleType(triangleType);

    }

    //checks if it is above 0 and if it is a numeric value
    public boolean checkInput(String side) {
        try {
            double checkSide = Double.valueOf(side);
            if (checkSide <= 0 || checkSide <= 0.0) {
                String response = ("The lengths of the sides of the triangle must be positive");
                System.out.println(response);
                return false;
            }
        } catch (NumberFormatException bad) {
            String response = ("This is not a number.  Please type a number");
            System.out.println(response);
            return false;
        }
        return true;
    }

    //allows user to enter new values for a triangle if an invalid input was sent in or if they just want to
    //enter new data for another triangle
    private void goAgain() {
        System.out.println("try again? Y/N");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine().toLowerCase();
        if (answer.contains("y")) {
            userInput();
        } else {
            System.exit(0);
        }
    }

    //calls the triangle class for what kind of triangle type the triangle is that is being passed in
    private void triangleType(Triangle triangle) {
        if(triangle.NotATriangle()){
            System.out.println("Error, not a valid triangle!");
        }else {
            triangle.isEquilateral();
            triangle.isScalene();
            triangle.isIsosceles();
        }

        goAgain();
    }

}