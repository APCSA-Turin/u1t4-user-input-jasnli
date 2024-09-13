import java.util.Scanner;
import java.util.Random;

public class U1T4Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int investments = 0;
        int successes = 0;
        int fails = 0;
        System.out.print("Enter your balance: $");
        double balance = scan.nextDouble();
        scan.nextLine();
        boolean investQ = true;
        while (investQ) {
            System.out.print("Would you like to invest? (1 for yes, 0 for no): ");
            String temp = scan.nextLine();
            if (temp == "0") {
                investQ = false;
            }
            if (investQ) {
                investments++;
                System.out.print("Enter amount you want to invest: $");
                double investmentAmount = scan.nextDouble();
                double originalInvestment = investmentAmount;
                scan.nextLine();
                balance -= investmentAmount;
                int randomNum = rand.nextInt(2);
                System.out.println(randomNum);
                if (randomNum == 0) {
                    successes++;
                    double randomRaise = rand.nextDouble(investmentAmount - 0.5 * investmentAmount, investmentAmount - 0.1 * investmentAmount);
                    investmentAmount += randomRaise;
                    System.out.println("+$" + randomRaise);
                    double randomMultiply = rand.nextDouble(1, 3);
                    investmentAmount *= randomMultiply;
                    System.out.println("x" + randomMultiply);
                }
                if (randomNum == 1) {
                    fails--;
                    double randomDrop = rand.nextDouble(investmentAmount - 0.8 * investmentAmount, investmentAmount - 0.5 * investmentAmount);
                    investmentAmount -= randomDrop;
                    System.out.println("-$" + randomDrop);
                    double randomDivide = rand.nextDouble(1, 6);
                    investmentAmount /= randomDivide;
                    System.out.println("/" + randomDivide);
                }
                System.out.println("Money Back: $" + investmentAmount);
                System.out.println("Net: $" + (investmentAmount - originalInvestment));
                balance += investmentAmount;
                System.out.println("Final Balance: $" + balance);


            }

        }




    }
}
