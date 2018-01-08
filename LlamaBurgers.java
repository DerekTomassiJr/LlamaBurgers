import java.text.NumberFormat;
import java.util.ArrayList;

public class LlamaBurgers
{
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    private String HorHD;
    private int hamburgerCount;
    private int hotdogCount;
    private int fryCount;
    private String rating;
    
    public LlamaBurgers (String hhd, int hc, int hdc, int fc, String r)
    {
        this.HorHD = hhd;
        this.hamburgerCount = hc;
        this.hotdogCount = hdc;
        this.fryCount = fc;
        this.rating = r;
    }
    public void setHorHD (String hhd)
    {
        this.HorHD = hhd;
    }
    public String getHorHD ()
    {
        return this.HorHD;
    }
    public void setHamburgerCount (int hc)
    {
        this.hamburgerCount = hc;
    }
    public int getHamburgerCount ()
    {
        return this.hamburgerCount;
    }
    public void setHotdogCount (int hdc)
    {
        this.hotdogCount = hdc;
    }
    public int getHotdogCount ()
    {
        return this.hotdogCount;
    }
    public void setFryCount (int fc)
    {
        this.fryCount = fc;
    }
    public int getFryCount ()
    {
        return this.fryCount;
    }
    public double Cost ()
    {
        double a = this.hotdogCount * 2.25;
        double b = this.hamburgerCount * 3.50;
        double c = this.fryCount * 1.75;
        double d = a + b + c;
        return d;
    }
    public double Tax ()
    {
        double tax = this.Cost() * 0.08;
        double total = this.Cost() + tax;
        return total;
    }
    public double finalTotal ()
    {
        double tip;
        if (this.rating.equalsIgnoreCase("fair")) {
            tip = this.Tax() * 0.1;
        } else if (this.rating.equalsIgnoreCase("good")) {
            tip = this.Tax() * 0.15;
        } else {
            tip = this.Tax() * 0.2;
        }
        double total = this.Tax() + tip;
        return total;
    }
    // public String toString ()
    // {
        // String a = "Hamburgers: " + this.hamburgerCount;
        // String b = "Hotdogs: " + this.hotdogCount;
        // String c = "French Fries: " + this.fryCount;
        // String d = "Subtotal w/ Tax: " + money.format(this.Tax());
        // String e = "Total w/ Tip: " + money.format(this.finalTotal());
        // return a + "\n" + b + "\n" + c + "\n" + d + "\n" + e;
    // }
    public String toString ()
    {
        ArrayList<String> servers = new ArrayList<String>();
        
        servers.add("Derek");
        servers.add("Kevin");
        servers.add("Ben");
        servers.add("Kyle");
        servers.add("Andrew");
        servers.add("Nathan");
        servers.add("Monki");
        servers.add("Shrink Stomper");
        
        int randomServerNum = (int)(Math.random()*8);
        int randomOrderNum = (int)(Math.random()*100+1);
        int randomTableNum = (int)(Math.random()*30+1);
        
        String a = "LlamaBurgers";
        String b = "123Best Buy St";
        String c = "Best Buy, Massachusetts";
        String d = "Tel. 1-888-237-8289";
        String e = "www.llamaburgers.bestbuy.com";
        String f = "Thank you for Choosing Llama Burgers";
        String g = "Order#:" + randomOrderNum + "\tTable " + randomTableNum;
        String h = "Date: 1/8/2018 4:07pm";
        String i = "Server: " + servers.get(randomServerNum);
        String j = "----------------------------------------";
        String k = "Hamburgers (" + this.hamburgerCount + ")\t\t" + money.format(this.hamburgerCount * 3.5);
        String l = "Hotdogs (" + this.hotdogCount + ")\t\t" + money.format(this.hotdogCount * 2.25);
        String m = "French Fries (" + this.fryCount + ")\t\t" + money.format(this.fryCount * 1.75);
        String n = "Total " + (this.hamburgerCount + this.fryCount + this.hotdogCount) + " items\t\t" + money.format(this.Cost());
        String o = "Sales Tax\t\t" + money.format(this.Cost() * 0.08);
        String p = "=======================================";
        String q = "Grand Total\t\t" + money.format(this.Tax());
        String t = "Total w/ Tip\t\t" + money.format(this.finalTotal());
        String r = "Thank you very much.";
        String s = "Come back again";
        
        return a + "\n" + b  + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n" + "\n" + g + "\n" + h + "\n" + i + "\n" + j + "\n" + k + "\n" + l + "\n" + m + "\n" + j + "\n" + n + "\n" + o + "\n" + p + "\n" + q + "\n" + t + "\n" + r + "\n" + s; 
    }
}