import java.util.Scanner;
public class CharacterValue
{
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            char ch;
            System.out.println("\n Enter the character: ");
            ch=s.next().charAt(0);
            if(ch>='A'&&ch<='Z')
            {
                System.out.println("\n UPPER-CASE.");
            }
            else if(ch>='a'&&ch<='z')
            {
                System.out.println("\n LOWERCASE.");
            }
            else if(ch>='0'&&ch<='9')
            {
                System.out.println("\n Digits.");
            }
            else
            {
                System.out.println("\n Special Character.");
            }
        }
    }    
}
