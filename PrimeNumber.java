import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int n;
            int count=0;
            System.out.println("\n Enter a number: ");
            n=s.nextInt();
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println("\n Number is prime number.");
            }
            else
            {
                System.out.println("\n Number is not prime number.");
            }
        }
    }    
}
