import java.util.Scanner;
public class ArmStromgNumber
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int num;
            int sum,i=1,n=0;
            System.out.println("Enter a number: ");
            num=s.nextInt();
            sum=0;
            i=num;
            while(num>0)
            {
                n=num%10;
                num=num/10;
                sum=sum+(n*n*n);
            }
            if(sum==i)
            {
                System.out.println(i+"is an ArmStrong number.");
            }
            else
            {
                System.out.println(i+"is not Armstrong number.");
            }
        }
    }    
}
