package convertor;

import java.util.Scanner;

public class Currencyconvertor {
    public void dollar_to_inr(){
        double rs,dollar;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount in dollars:");
        dollar=sc.nextDouble();
        rs=dollar*68.92;
        System.out.printf("\nThe amount in rupees:%.2f",rs);
    }
    public void euro_to_inr(){
        double rs,euro;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the amount in euro:");
         euro=sc.nextDouble();
         rs=euro/77.42;
         System.out.printf("\nThe amount in rupees:%.2f",rs);
    }
    public void yen_to_inr(){
        double rs,yen;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the amount in yen:");
         yen=sc.nextDouble();
         rs=yen*0.64;
         System.out.printf("\nThe amount in rupees:%.2f",rs);
    }
    public void inr_to_dollar(){
        double rs,dollar;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the amount in rupees:");
         rs=sc.nextDouble();
         dollar=rs*68.92;
         System.out.printf("\nThe amount in dollar:%.2f",dollar);
    }
    public void inr_to_euro(){
        double rs,euro;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the amount in rupees:");
         rs=sc.nextDouble();
         euro=rs/77.42;
         System.out.printf("\nThe amount in :%.2f",euro);
    }
    public void inr_to_yen(){
        double rs,yen;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the amount in yen:");
         yen=sc.nextDouble();
         rs=yen*0.64;
         System.out.printf("\nThe amount in rupees:%.2f",rs);
    }
}
