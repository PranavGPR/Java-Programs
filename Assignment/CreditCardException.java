import java.util.Scanner;
public class CreditCardException {
    public static void main(String[] args) {
        int card_no , pin , credit_amount;
        int default_card = 12345, default_pin = 1234;
        Scanner rp = new Scanner(System.in);
        System.out.print("Enter the card number : ");
        card_no = rp.nextInt();
        try{
            
            if(card_no != default_card)
                throw new Exception();
        }
        catch(Exception e){
            System.out.print("\nYou Entered the wrong card number!!!");
            System.out.print("\n\nEnter the correct card number : ");
            card_no = rp.nextInt();
        }
        System.out.print("\nEnter the pin : ");
        pin = rp.nextInt();
        try{
            if(pin != default_pin)
                throw new Exception();
        }
        catch(Exception e){
            System.out.print("\nYou Entered the wrong pin number!!!");
            System.out.print("\n\nEnter the correct pin number : ");
            pin = rp.nextInt();
        }
        System.out.print("\nEnter the amount to credit : ");
        credit_amount = rp.nextInt();
        System.out.print("\nAmount Credited Successfully!!!!");
    }
}
