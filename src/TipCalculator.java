import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        int people;
        double average;
        double tip = 0;
        double price;
        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your party? ");
        people = scan.nextInt();
        System.out.println("What's the top percentage? (0-100): ");
        tip = scan.nextDouble();
        tip /=100;
        tip++; // total times this = total w tip
        System.out.print("Enter a cost in dollars and cents, e.g. 12.45 (-1 to end): ");
        price = scan.nextDouble();
        total+=price;
        while (price != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.45 (-1 to end): ");
            price = scan.nextDouble();
            if (price != -1) {
                total+=price;
            }

            }

        }
    }

