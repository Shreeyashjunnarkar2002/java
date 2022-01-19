import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int year;
            System.out.println("\n Enter the year: ");
            year=s.nextInt();
            if(year%400==0)
            {
                System.out.println(year+"is Leap year");
            }
            else if(year%100==0)
            {
                System.out.println(year+"is not leap year");
            }
            else if(year%4==0)
            {
                System.out.println(year+"is a leap year");
            }
            else
            {
                System.out.println(year+"is not a leap year");
            }
        }
    }    
}
