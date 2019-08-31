import java.util.Scanner;
interface CreditCardInterface
{
    void Creditamount();
    void viewpin();
    void changePin();
    void paybalance();
}
class Customer implements CreditCardInterface
{
    int balance =0,pin,card_no,credit_amount=0;
    String name;
    Scanner rp=new Scanner(System.in);
    Customer(){
        System.out.print("Enter the name:");
        name=rp.next();
        System.out.print("Enter card number:");
        card_no=rp.nextInt();
        System.out.print("Enter pin:");
        pin=rp.nextInt();
        System.out.print("");
    }
    public void viewpin()
    {
        System.out.println("Your pin is: "+pin);
        
    }
    public void changePin()
    {
        int x;
        System.out.print("Enter your old pin:");
        x=rp.nextInt();
        if(x==pin){
            System.out.print("Enter the new pin:");
            pin=rp.nextInt();
            System.out.println("Successfully changed pin!!!! " );
        }
        else
            System.out.println("Enter pin correctly!! ");
    }
    public void Creditamount(){
        int x;
        System.out.print("Enter the amount to credit: ");
        x=rp.nextInt();
        if(x==0)
            return;
        if(balance==0)
            credit_amount+=x;
        else if( x < balance )
        {
            credit_amount=0;
            balance-=x;
        }
        else
        {
            credit_amount=x-balance;
            balance=0;
        }
    }
    public void paybalance()
    {
        int x;
        System.out.print("Enter the amount to pay: ");
        x=rp.nextInt();
        if(x==0)
            return;
        if(credit_amount==0)
            balance = x;
        else if(credit_amount == x)
            credit_amount=balance=0;
        else if(x > credit_amount)
        {
            balance = x - credit_amount;
            credit_amount=0;
        }
        else 
            credit_amount -= x;
    }
    void display(){
        System.out.println("Name           : "+name);
        System.out.println("Credit Amount  : "+credit_amount);
        System.out.println("Balance amount : " + balance );
    }
}
public class Creditcard 
{
    public static void main(String[] args) 
    {
        Customer obj=new Customer();
        Scanner rp=new Scanner(System.in);
        int opt;
        while(true){
            System.out.print("\t\tBANK\n1.Credit amount\n2.View Pin\n3.Change Pin\n4.Pay Balance\n5.Display\n6.Exit\nEnter your option:");
            opt=rp.nextInt();
            switch(opt){
                case 1:obj.Creditamount();
                       break;
                case 2:obj.viewpin();
                       break;
                case 3:obj.changePin();
                       break;
                case 4:obj.paybalance();
                       break;
                case 5:obj.display();
                       break;
                case 6:System.exit(0);
            }
       }
    }
}