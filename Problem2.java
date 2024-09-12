import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Player 1, Please enter your name: ");
        String playerOne = scan.nextLine();
        System.out.print("Player 1, Please enter your number: ");
        double numberOne = scan.nextDouble();
        scan.nextLine();

        System.out.print("Player 2, Please enter your name: ");
        String playerTwo = scan.nextLine();
        System.out.print("Player 2, Please enter your number: ");
        double numberTwo = scan.nextDouble();
        scan.nextLine();

        if (numberTwo > numberOne) {
            System.out.println(playerTwo + "'s number is bigger!");
        } else if (numberOne > numberTwo) {
            System.out.println(playerOne + "'s number is bigger!");
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
