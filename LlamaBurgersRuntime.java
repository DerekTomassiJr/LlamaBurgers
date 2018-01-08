import java.util.Scanner;
import java.text.NumberFormat;

public class LlamaBurgersRuntime
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        LlamaBurgers order1 = new LlamaBurgers ("Hamburgers", 5, 0, 3, "Excellent");
        LlamaBurgers order2 = new LlamaBurgers ("Hot Dogs", 0, 2, 1, "Fair");
        LlamaBurgers order3 = new LlamaBurgers ("Hamburgers", 1, 0, 0, "Good");
        LlamaBurgers order4 = new LlamaBurgers ("Hamburgers", 4, 0, 4, "Good");
        
        System.out.println("Press enter to see order 1");
        scan.nextLine();
        System.out.println("\f");
        System.out.println(order1);
        System.out.println("Press enter to see order 2");
        scan.nextLine();
        System.out.println("\f");
        System.out.println(order2);
        System.out.println("Press enter to see order 3");
        scan.nextLine();
        System.out.println("\f");
        System.out.println(order3);
        System.out.println("Press enter to see order 4");
        scan.nextLine();
        System.out.println("\f");
        System.out.println(order4);
        
        System.out.println("Press enter to see how much the restaurant made in food orders");
        scan.nextLine();
        System.out.println("\f");
        System.out.println(money.format(Revenue(order1, order2, order3, order4)));
        
        System.out.println("Press enter to begin to make your order");
        scan.nextLine();
        System.out.println("\f");
        
        System.out.println("Would you like to order hambugers or hotdogs");
        String HorHD = scan.nextLine();
        if (HorHD.equalsIgnoreCase("Hamburgers")) {
            HorHD = "Hamburgers";
        } else {
            HorHD = "Hotdogs";
        }
        
        System.out.println("How many " + HorHD + " would you like to order");
        int count = scan.nextInt();
        
        System.out.println("How many orders of fries would you like to order");
        int fryCount = scan.nextInt();
        
        System.out.println("How would you rate your service 1 for fair 2 for good 3 for excellent");
        int ratingInt = scan.nextInt();
        String rating;
        if (ratingInt == 1) {
            rating = "Fair";
        } else if (ratingInt == 2) {
            rating = "Good";
        } else {
            rating = "Excellent";
        }
        
        if (HorHD.equalsIgnoreCase("Hamburgers")) {
            LlamaBurgers customOrder = new LlamaBurgers(HorHD, count, 0, fryCount, rating);
            System.out.println("Press enter to see your order");
            scan.nextLine();
            System.out.println("\f");
            System.out.println(customOrder);
        } else {
            LlamaBurgers customOrder = new LlamaBurgers (HorHD, 0, count, fryCount, rating);
            System.out.println("Press enter to see your order");
            scan.nextLine();
            System.out.println("\f");
            System.out.println(customOrder);
        }
    }
    public static double Revenue (LlamaBurgers o1, LlamaBurgers o2, LlamaBurgers o3, LlamaBurgers o4)
    {
        double o1Total = o1.Cost();
        double o2Total = o2.Cost();
        double o3Total = o3.Cost();
        double o4Total = o4.Cost();
        double revenue = o1Total + o2Total + o3Total + o4Total;
        return revenue;
    }
}