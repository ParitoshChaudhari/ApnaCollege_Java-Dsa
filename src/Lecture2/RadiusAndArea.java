package Lecture2;
import java.util.Scanner;

public class RadiusAndArea {
    public static void main(String[] args) {
        //Make a program that takes the radius of a circle as input, calculates
        //its radius and area and prints it as output to the user

        //Scanner object
        Scanner scanner = new Scanner(System.in);

        //variable
        int radius = scanner.nextInt();
        float area;

        // formulas: Area = π × r2
        area = (3.14f)*(radius*radius);

        //Output
        System.out.println("Area is : " + area);
    }
}
