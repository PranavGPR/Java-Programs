class NegativeNumber extends Exception{
    public String toString(){
        return "You entered a negative number!!!!";
    }
}
class GreaterException extends Exception{
    public String toString(){
        return "Second number should be larger than first!!!";
    }
}
public class CompareIntException {
    public static void main(String[] args){
        int num1 = Integer.parseInt(args[0]), num2 = Integer.parseInt(args[1]);
        try{
            if(num1 < 0 || num2 < 0)
                throw new NegativeNumber();
        }
        catch(Exception e){
            System.out.println(e);
            return;
        }
        try{
            if(num1 > num2)
                throw new GreaterException();
        }
        catch(Exception e){
            System.out.println(e);
            return;
        }      
        for(int i = num1; i <= num2; i++){
            int found = 1;
            if(i==0 || i==1)
                continue;
            for(int j=2 ; j < i ;j++)
            {
                if(i%j == 0)
                {
                    found = 0;
                    break;
                }
            }
            if(found == 1) 
                System.out.println(i);
        }
    }
}