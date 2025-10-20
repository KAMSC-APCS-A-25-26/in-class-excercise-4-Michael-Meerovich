import java.text.DecimalFormat;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: Ask the user how many items they are purchasing
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int numruns;
        System.out.print ("How many items are you purchasing? ");
        numruns = sc.nextInt();
        // TODO: Use a for loop to read each item's price (double)
        double price=0;
        for (int k = 1; k <= numruns ; k++)
        {
            System.out.print ("Price of item " + k + "? ");
            price += sc.nextDouble();
        }
        System.out.print("Your cart has " + numruns + " items with a total cost of $" + df.format(price));
        // TODO: Accumulate the total cost
        // TODO: Print the final summary line with item count and total
        // TODO: Use Scanner for input
    }
}
