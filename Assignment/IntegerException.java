import java.util.Scanner;
public class IntegerException 
{
    public static void main(String[] args)
    {
        Scanner rp = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter a number:");
        num1 = rp.nextInt();
        try
        {
            if(num1 > 9 || num1 < 0)
                throw new ArithmeticException();
        }
        catch(Exception e)
        {
            System.out.println("You entered the number out of range");
            System.out.print("Enter the number between(0 to 9):");
            num1 = rp.nextInt();
        }
        System.out.print("Enter another number:");
        num2 = rp.nextInt();
        try
        {
            if(num2 > 9 || num2 < 0)
                throw new ArithmeticException();
        }
        catch(Exception e)
        {
            System.out.println("You entered the number out of range");
            System.out.print("Enter the number between(0 to 9):");
            num2 = rp.nextInt();
        }
        num3 = num1 + num2;
        System.out.println("Sum is: "+ num3);
    }
}
