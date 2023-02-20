import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int longSideRectangle = 0;
        int shortSideRectangle = 0;


        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the longer side of the rectangle: ");
        longSideRectangle = in.nextInt();

        System.out.print("Enter the length of the shorter side of the rectangle: ");
        shortSideRectangle = in.nextInt();

        int areaOfRectangle = longSideRectangle * shortSideRectangle;
        int perimeterOfRectangle = (longSideRectangle * 2) + (shortSideRectangle * 2);
        double diagonalOfRectangle = Math.sqrt((longSideRectangle * longSideRectangle) + (shortSideRectangle * shortSideRectangle));

        System.out.println("The area of the rectangle is: " + areaOfRectangle);
        System.out.println("The perimeter of the rectangle is: " + perimeterOfRectangle);
        System.out.println("The diagonal of the rectangle is: " + diagonalOfRectangle);
    }
}
