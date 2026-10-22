/**
 * Exercise 5 (Homework) — Receipt, version 2
 *
 * Rebuild your Session 4 receipt, but this time:
 *   - Every price is stored in a variable
 *   - Every quantity is stored in a variable
 *   - Line totals are CALCULATED (price * quantity)
 *   - The grand total is CALCULATED (sum of line totals)
 *   - Nothing numeric is typed directly into the output string
 *
 * ⚠️ Watch your parentheses. "Total: " + price * qty will
 *    NOT do what you want if you get it wrong.
 *
 * Challenge: add an 8.875% sales tax line, rounded to 2 decimals.
 */
public class Receipt2 {
    public static void main(String[] args) {
    double shirtPrice = 6.99;   
    int shirtQuantity = 20;
    double underwearPrice = 45.00;
    int undewearQuantity = 30;
    double flipflopPrice = 200.00;
    int flipflopQuantity = 1;

    double totalBeforeTax = (shirtPrice * shirtQuantity) + (underwearPrice * undewearQuantity) + (flipflopPrice * flipflopQuantity);

    double taxPercent = 8.875/100.0; 
    double taxValue = (totalBeforeTax * taxPercent);
    double total = Math.round((totalBeforeTax + taxValue)*100.0)/100.0;
    System.out.println(totalBeforeTax);
    System.out.println(taxValue);
    System.out.println(total);

    }
}
