import java.util.Scanner;
public class Project1 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("\n Enter the buyinng price per share: ");
        double buyingprice=s.nextDouble();
        int day=1; 
        double closingprice=0.1;  
        while(true)
        {
            System.out.println("\n Enter the closing price for day: "+day+"(any negative vlaue to leave :) ");
            closingprice=s.nextDouble();
            if(closingprice<0.0)
            {
                break;
            }
            double earnings=(closingprice-buyingprice);
            if(earnings>0.0)
            {
                System.out.println("\n After a day "+day+",you earned "+earnings+"per share. ");
            }
            else if (earnings < 0.0)
            {
                System.out.println("\n After a day "+day+",you lost "+(-earnings)+"per share. ");
            }
            else
            {
                System.out.println("\nAfter day "+day+",you have "+"no earnings per share.");
            }
            day++;
        }
        s.close();
    }
    
}
