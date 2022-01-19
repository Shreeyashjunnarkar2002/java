import java.util.Scanner;
public class PrimeNumber1
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int i,j=2,ch=0;
            System.out.println("\n Enter any number: ");
            i=s.nextInt(); //i is the number 
            if(i<=1)
            {
                ch=1;
            }
            while(j<=i/2)
            {
                if(i%j==0)
                {
                    ch=1;
                    break;
                }
                else
                {
                    j++;
                }
            }
            if(ch==0)
            {
                System.out.println("\n Number is prime");
            }
            else
            {
                System.out.println("\n Number is not prime number");
            }
        }
    }    
}
