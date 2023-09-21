import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double total = 0;
        double withTip;
        int people;
        double perPersonWithTip;
        double perPerson;
        double perPersonTip;
        double tip = 0;
        double percent;
        double justTip;
        double price;

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your party? ");
        people = scan.nextInt();
        System.out.print("What's the top percentage? (0-100): ");
        percent = scan.nextDouble();
        tip = percent / 100;
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
        justTip = total * tip;
        withTip = justTip + total;
        perPersonTip = justTip / people;
        perPersonTip*=100

        System.out.println("--------------------------------------------------");
        System.out.println("Total bill before tip: $" + total);
        System.out.println("Total percentage: " + percent + "%");
        System.out.println("Total tip: $" + justTip);
        System.out.println("Total bill with tip: $" + withTip);

        }
    }

