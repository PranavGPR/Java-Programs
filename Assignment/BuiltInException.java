class Exceptions {
    void ArithmeticException()
   {
      try{
         int num1=30, num2=0;
         int output=num1/num2;
         System.out.println ("Result: "+output);
      }
      catch(ArithmeticException e){
         System.out.println ("You Shouldn't divide a number by zero");
      }
   }
    void ArrayException()
   {
      try{
        int a[]=new int[10];
        a[11] = 9;
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println ("ArrayIndexOutOfBoundsException");
      }
   }
   void NumberException()
   {
      try{
	 int num=Integer.parseInt ("Pranav") ;
	 System.out.println(num);
      }catch(NumberFormatException e){
	  System.out.println("Number format exception occurred");
       }
   }
   void StringException()
   {
      try{
	 String str="Pranav";
	 System.out.println(str.length());
          System.out.println("");
	 char c = str.charAt(0);
	 c = str.charAt(40);
	 System.out.println(c);
      }catch(StringIndexOutOfBoundsException e){
	  System.out.println("StringIndexOutOfBoundsException!!");
       }
   }    
}
public class BuiltInException{
    public static void main(String[] args) {
        Exceptions obj = new Exceptions();
        obj.ArithmeticException();
        System.out.println("----------------------------------\n");
        obj.ArrayException();
        System.out.println("----------------------------------\n");
        obj.NumberException();
        System.out.println("----------------------------------\n");
        obj.StringException();
    }
}

