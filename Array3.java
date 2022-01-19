import java.util.Scanner;
public class Array3
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
        int total=0;
        float per;
        int []sub=new int[5];
        System.out.println("\n Enter the marks for 5 subject: ");
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter a mark for subject["+(i+1)+"]: ");
            sub[i]=s.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            total=total+sub[i];
        }
        per=(float)total/5;
        System.out.println("Percentage: "+per);
        }
    } 
}
