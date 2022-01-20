import java.util.Scanner;
public class Greater4
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int a,b,c,d,max;
            System.out.println("\n Enter the four number: ");
            a=s.nextInt();
            b=s.nextInt();
            c=s.nextInt();
            d=s.nextInt();
            max=a;
            if(max<b)
            {
                max=b;
            }
            if(max<c)
            {
                max=c;
            }
            if(max<d)
            {
                max=d;
            }
            System.out.println("\n Maximum between 4 number is: "+max);
        }
    }    
}
