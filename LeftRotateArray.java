import java.util.*;
public class LeftRotateArray
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            int size,i,temp;
            System.out.println("\n Enter the size: ");
            size=s.nextInt();
            int []x=new int[size];
            System.out.println("\n enter the element in array: ");
            for(i=0;i<size;i++)
            {
                x[i]=s.nextInt();
            }
            temp=x[0];
            for(i=0;i<size-1;i++)
            {
                x[i]=x[i+1];
            }
            x[size-1]=temp;
            System.out.println("\n After the left rotate: ");
            for(i=0;i<size;i++)
            {
                System.out.print(" "+x[i]);
            }
        }
    }
}