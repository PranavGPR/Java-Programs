package test;

import java.util.Scanner;

public class Paliindrome 
{
    public static void main(String[] args) 
    {
         Scanner scan = new Scanner(System.in);
         String data,reverse="";
         System.out.print("\nEnter your String:");
         data=scan.nextLine();
         for(int i=data.length()-1;i>=0;i--)
                reverse += data.charAt(i);
         if(data.equals(reverse))
               System.out.println("\n\n The given string is palindrome");
         else
             System.out.println("\n\nIt is not palindrome");   
    }
}