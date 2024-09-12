import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a 3-digit integer: ");
        int number = scan.nextInt();
        scan.nextLine();
        int lastNumber = number / 100;
        int middleNumber = (number - lastNumber * 100) / 10;
        int firstNumber = (number - lastNumber * 100 - middleNumber * 10);
        System.out.println("The reverse of " + number + " is " + firstNumber + middleNumber + lastNumber);


    }
}
