//find x raised to y without using Math.pow()

import java.util.Scanner;
public class Power1
{
    public static void main(String args[])
    {
        try(Scanner s=new Scanner(System.in))
        {
            int x,y,ans=1,i;
            System.out.println("\n Enter the value of x: ");
            x=s.nextInt();
            System.out.println("\n Enter the value of y: ");
            y=s.nextInt();
            for(i=1;i<=y;i++)
            {
                ans=ans*x;
            }
            System.out.println("\n Answer: "+ans);
        }
    }    
}
