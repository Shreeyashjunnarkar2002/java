import java.util.Scanner;
public class DecimalToBinary
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int num,rem,i=0,bin=0;
            System.out.println("\n Enter a number: ");
            num=s.nextInt();
            while(num>0)
            {
                rem=num%2;
                bin=bin+(rem*(int)Math.pow(10,i));
                i++;
                num=num/2;
            }
            System.out.println("\n Binry= "+bin);
        }
    }
}
