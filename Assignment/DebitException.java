import java.util.Scanner;
class Invalid1 extends Exception{
    public String toString(){
        return "WRONG NUMBER!!!";
    }
}
class BalExcep extends Exception{
    public String toString(){
        return "Insufficient balance";
    }
}
public class DebitException {
    public static void main(String[] args) {
        int card_no , pin , debit_amount, balance = 10;
        int default_card = 12345, default_pin = 1234;
        Scanner rp = new Scanner(System.in);
        System.out.print("Enter the card number : ");
        card_no = rp.nextInt();
        do{
            try{
                if(card_no != default_card)
                    throw new Invalid1();
            }
            catch(Invalid1 e){
                System.out.print(e);
                System.out.print("\n\nEnter the correct card number : ");
                card_no = rp.nextInt();
            }
        }while(card_no!=default_card);
        System.out.print("\nEnter the pin : ");
        pin = rp.nextInt();
        do{
            try{
                if(pin != default_pin)
                    throw new Invalid1();
            }
            catch(Invalid1 e){
                System.out.print(e);
                System.out.print("\n\nEnter the correct pin number : ");
                pin = rp.nextInt();
            }
        }while(pin!=default_pin);
        System.out.print("\nEnter the amount to debit : ");
        debit_amount = rp.nextInt();
        do{
            try{
                if(debit_amount > balance)
                    throw new BalExcep();
            }
            catch(BalExcep e){
                System.out.print(e);
                System.out.print("\n\nEnter sufficient amount to debit : ");
                debit_amount = rp.nextInt();
            }
        }while(debit_amount>balance);
        System.out.print("\nAmount Debited Successfully!!!!");
        balance -= debit_amount;
    }
}