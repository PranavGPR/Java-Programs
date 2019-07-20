import convertor.Distancecalculator;
import convertor.Timeconvertor;
import convertor.Currencyconvertor;
import java.util.Scanner;
public class Converter
{
    public static void main(String []args)
    {
            Scanner sc=new Scanner(System.in);
            int option,opt;
            do{
            System.out.println("--------CONVERTOR--------");
            System.out.println("1.Time converter");
            System.out.println("2.Distance converter");
            System.out.println("3.Currency converter");
            System.out.print("Enter your option:");
            option=sc.nextInt();
            switch(option){
                case 1:int opt1;
                       System.out.println("----TIME CONVERTER----");
                       System.out.println("1.Hours to Mins");
                       System.out.println("2.Mins to Sec");
                       System.out.println("3.Sec to Mins");
                       System.out.println("4.Mins to Hours");
                       System.out.println("5.Exit");
                       System.out.print("Enter your option:");
                       opt1=sc.nextInt();
                       Timeconvertor obj1=new Timeconvertor();
                       switch(opt1)
                       {
                           case 1:obj1.hour_to_min();
                                  break;
                           case 2:obj1.min_to_sec();
                                  break;
                           case 3:obj1.sec_to_min();
                                  break;
                           case 4:obj1.min_to_hour();
                                  break;
                           case 5:System.out.println("Exiting......");
                                  System.exit(0);
                        }
                       break;
                case 2:int opt2;
                       Distancecalculator obj2=new Distancecalculator();
                       System.out.println("------DISTANCE CONVERTOR------");
                       System.out.println("1.Meter to KM");
                       System.out.println("2.Miles to KM");
                       System.out.println("3.KM to Miles");
                       System.out.println("4.KM to Meter");
                       System.out.println("5.Exit");
                       System.out.print("Enter your option:");
                       opt2=sc.nextInt();
                       switch(opt2){
                           case 1:obj2.meter_to_km();
                                  break;
                           case 2:obj2.miles_to_km();
                                  break;
                           case 3:obj2.km_to_miles();
                                  break;
                           case 4:obj2.km_to_meter();
                                  break;
                           case 5:System.out.println("Exiting.....");
                                  System.exit(0);
                        }
                       break;
                case 3:int opt3;
                       Currencyconvertor obj3=new Currencyconvertor();
                       System.out.println("------CURRENCY CONVERTOR------");
                       System.out.println("1.Dollar to INR");
                       System.out.println("2.Euro to INR");
                       System.out.println("3.Yen to INR");
                       System.out.println("4.INR to Dollar");
                       System.out.println("5.INR to Euro");
                       System.out.println("6.INR to Yen");
                       System.out.println("7.Exit");
                       System.out.print("Enter your option:");
                       opt3=sc.nextInt();
                       switch(opt3){
                           case 1:obj3.dollar_to_inr();
                                  break;
                           case 2:obj3.euro_to_inr();
                                  break;
                           case 3:obj3.yen_to_inr();
                                  break;
                           case 4:obj3.inr_to_dollar();
                                  break;
                           case 5:obj3.inr_to_euro();
                                  break;
                           case 6:obj3.inr_to_yen();
                                  break;
                           case 7:System.out.println("Exiting.....");
                                  System.exit(0);
                       }
                       break;
                }
                System.out.println("Do you want to continue(0/1):");
                opt=sc.nextInt();
                System.out.println("Exiting......");
        }while(opt==1);
}
}