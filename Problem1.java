import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "!");
        System.out.print("Please enter the first integer: ");
        int one = scan.nextInt();
        System.out.print("Please enter the second integer: ");
        int two = scan.nextInt();
        System.out.print("Please enter the third integer: ");
        int three = scan.nextInt();
        double average = (one + two + three) / 3.0;
        System.out.println("The average of " + one + ", " + two + ", " + three + ", " + "is " + average);


    }
}
