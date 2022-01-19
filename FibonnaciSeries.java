import java.util.Scanner;
public class FibonnaciSeries
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int a=0,b=1,result;
            int user_no;
            int count=0;
            System.out.println("\n Enter any number: ");
            user_no=s.nextInt();
            while(true)
            {
                result=a+b;
                count++;
                if(result>=user_no)
                {
                    break;
                }
                a=b;
                b=result;
                System.out.println("\n Fibonnaci series: "+count);
            }
        }
    }    
}
