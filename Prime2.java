import java.util.Scanner;
public class Prime2
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int num,i;
            boolean flag=true;
            System.out.println("\n Enter a number: ");
            num=s.nextInt();
            if(num==1)
            {
                System.out.println("\n Neither prime nor composite: ");
                return;
            }
            for(i=2;i<=num/2;i++)
            {
                if(num%i==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println("\n Prime Number.");
            }
            else
            {
                System.out.println("\n Not Prime Number.");
            }
        }
    }    
}
