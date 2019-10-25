package test;
import java.util.Scanner;
public class ArrayTypeFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size = scan.nextInt();
        int a[]=new int[size];
        System.out.println("\nEnter the elements of array :");
        for(int i=0;i<size;i++)
            a[i]=scan.nextInt();
        for(int i=0;i<size;i++)
        {
           if(a[i]%2==0)
                System.out.println("\n"+a[i]+" is even ");
           else
                System.out.println("\n"+a[i]+" is odd ");
        }
    }
}
