import java.util.ArrayList;
import java.util.Scanner;
import java.util.*
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total;
        int people;
        double average;
        double tip;
        List<Double> costs = new ArrayList<Double>();
        List<String> items = new ArrayList<String>();

        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your party? ");
        people = scan.nextInt();
        System.out.println("What's the top percentage? (0-100): ");
        tip = scan.nextDouble();
        tip /=100;
        tip++; // total times this = total w tip
        System.out.print("Enter a cost in dollars and cents, e.g. 12.45 (-1 to end): ");
        costs.add(scan.nextDouble());

    }
}
