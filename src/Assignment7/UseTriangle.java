package Assignment7;

import java.util.Scanner;

public class UseTriangle {
    private final char[] LETTERS = {'A', 'B', 'C'};

    public static void main(String[] args) {
        UseTriangle useTriangle = new UseTriangle();
        useTriangle.userInput();
    }

    private void userInput() {
        double[] sideArray = new double[3];
        System.out.println("Please enter 3 number lengths for each side of the" + " triangle. Press enter after each number.");
        for (int i = 0; i < 3; i++) {
            Scanner side = new Scanner(System.in);
            String checkSide = side.nextLine();
            checkInput(checkSide, LETTERS[i]);
            double addSide = Double.valueOf(checkSide);
            sideArray[i] = addSide;
            System.out.println("Side " + LETTERS[i] + ": " + addSide);
        }
        triangleType(new Triangle(sideArray[0], sideArray[1], sideArray[2]));
    }

    private void checkInput(String side, char sideName) {
        try {
            double checkSide = Double.valueOf(side);
            if (checkSide <= 0) {
                System.out.println("The lengths of the sides of the triangle must be positive. (Side" + sideName + ")");
                goAgain();
            }
        } catch (NumberFormatException bad) {
            System.out.println(" This is not a number.  Please type a number. (Side" + sideName + ")");
            goAgain();
        }
    }

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

    private void triangleType(Triangle triangle) {
        if (((triangle.getS1() + triangle.getS2()) < triangle.getS3()) ||
                ((triangle.getS1() + triangle.getS3()) < triangle.getS2()) ||
                ((triangle.getS2() + triangle.getS3()) < triangle.getS1())) {
            System.out.println("Error, not a valid triangle!");
        } else { //check if invalid, else check for what type it is
            triangle.isEquilateral();
            triangle.isScalene();
            triangle.isIsosceles();
            goAgain();
        }
    }

}