import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;
        double discount = 0;

        System.out.print("Enter start date: ");
        int start = sc.nextInt();

        System.out.print("Enter end date: ");
        int end = sc.nextInt();

        if (start < 1) {
            System.out.println("Invalid start date!");
        }

        if (start > 31) {
            System.out.println("Invalid start date!");
        }

        if (end < 1) {
            System.out.println("Invalid end date!");
        }

        if (end > 31) {
            System.out.println("Invalid end date!");
        }
        int days = end - start;
        if (days <= 0) {
            System.out.println("Start date must be less than end date!");
        }
        double total = days * ROOM_CHARGE;

        if (days >= 5) {
            discount = DISCOUNT_20;
        } else if (days >= 3) {
            discount = DISCOUNT_10;
        }

        total = total - (total * discount);

        System.out.println("Days reserved: " + days);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.printf("Total amount to pay: Rs."+ total);
    }
}