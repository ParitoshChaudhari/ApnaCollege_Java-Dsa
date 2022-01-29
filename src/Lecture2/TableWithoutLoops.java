package Lecture2;
import java.util.Scanner;

public class TableWithoutLoops {
    public static void main(String[] args) {
        //Make a program that prints the table of a number that is input by
        //the user

        //(HINT - You will have to write 10 lines for this but as we proceed in
        //the course you will be studying about ‘LOOPS’ that will simplify your
        //work A LOT!)

        //Scanner object
        Scanner scanner = new Scanner(System.in);

        //variable
        int number = scanner.nextInt();


        //table
        System.out.println(number + " *" + " 1" + " = " + (number * 1));
        System.out.println(number + " *" + " 2" + " = " + (number * 2));
        System.out.println(number + " *" + " 3" + " = " + (number * 3));
        System.out.println(number + " *" + " 4" + " = " + (number * 4));
        System.out.println(number + " *" + " 5" + " = " + (number * 5));
        System.out.println(number + " *" + " 6" + " = " + (number * 6));
        System.out.println(number + " *" + " 7" + " = " + (number * 7));
        System.out.println(number + " *" + " 8" + " = " + (number * 8));
        System.out.println(number + " *" + " 9" + " = " + (number * 9));
        System.out.println(number + " *" + " 10" + " = " + (number * 10));
    }
}
