import java.util.Scanner;
class StringException extends Exception{
    public String toString(){
        return "You entered the string 'hello'";
    }
}
public class UserDefinedException {
    public static void main(String[] args){
        StringException obj = new StringException();
        Scanner rp = new Scanner(System.in);
        String str1 = "hello", str2 ;
        System.out.print("Enter the string: ");
        str2 = rp.next();
        try
        {
        if(str1.equals(str2))
            throw new StringException();
        else 
                System.out.println("The Entered string is not the HELLO");
        } 
        catch(StringException e)
        {
            System.out.println(e);
        }
    }
}
