import java.util.Scanner;

/**
 * Exercise 7 — InteractiveTip
 *
 * Your tip calculator from Session 7, but the user supplies
 * the bill, the tip percentage, and the number of people.
 *
 * Output the tip, the total, and each person's share,
 * all to 2 decimal places.
 */
public class InteractiveTip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bill amount ");
        double billAmount = input.nextDouble();
        System.out.print("tip percent ");
        int tipPercent = input.nextInt();
        System.out.print("people ");
        int people = input.nextInt();

        double tipAmount = Math.round(billAmount * (tipPercent/100.0)*100)/100.0;
        double total = tipAmount + billAmount;
        double eachShare = total / 4;
        double roundShare = Math.round(eachShare * 100) / 100.0;
        System.out.println("Tip Amount" + tipAmount);
        System.out.println("Bill Total" + total);
        System.out.println("Each share" + eachShare);
        System.out.println("Each Share" + roundShare);

        input.close();
    }
}
