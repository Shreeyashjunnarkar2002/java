import java.util.Scanner;
public class PalindromeNumber
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int num,rem,rev=0,temp;
            System.out.println("\n Enter a number: ");
            num=s.nextInt();
            temp=num;
            while(num>0)
            {
                rem=num%10;
                rev=(rev*10)+rem;
                num=num/10;
            }
            if(rev==temp)
            {
                System.out.println("\n Palindrome number.");
            }
            else
            {
                System.out.println("\n Not Palindrome.");
            }
        }
    }    
}
