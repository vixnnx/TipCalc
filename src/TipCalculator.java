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
        int percent;
        double justTip;
        double price;

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your party? ");
        people = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        percent = scan.nextInt();
        tip = (double) percent / 100;
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
        justTip =(int) (justTip * 100) ;
        justTip /=100;
        withTip =(int) (withTip * 100) ;
        withTip /=100;
        perPersonTip = justTip / people;
        perPersonTip =(int) (perPersonTip *100) ;
        perPersonTip /=100;
        perPerson = total / people;
        perPerson = (int) (perPerson * 100) ;
        perPerson /=100; 
        perPersonWithTip = withtip /people;
        perPersonWithTip =(int) (perPersonWithTip * 100) ;
        perPersonWithTip /=100;

        System.out.println("--------------------------------------------------");
        System.out.println("Total bill before tip: $" + total);
        System.out.println("Total percentage: " + percent + "%");
        System.out.println("Total tip: $" + justTip);
        System.out.println("Total bill with tip: $" + withTip);

        System.out.println("Tip per person: $"+ perPersonTip);


        }
    }

