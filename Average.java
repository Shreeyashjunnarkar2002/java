import java.util.*;
public class Average
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
            float a,c,b,z;
            System.out.println("\n Enter the 3 no: ");
            a=s.nextFloat();
            b=s.nextFloat();
            c=s.nextFloat();
            z=(a+b+c)/3;
        System.out.println("\n Average= "+z);
        s.close();
    }
}