package convertor;
import java.util.Scanner;
public class Distancecalculator {
    public void km_to_meter(){
        double meter,km;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the distance in km:");
        km=sc.nextDouble();
        meter=km*1000;
        System.out.printf("Distance in meters:%.2f",meter);
    }
    public void km_to_miles(){
        double miles,km;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the distance in km:");
        km=sc.nextDouble();
        miles=km/1.609;
        System.out.printf("Distance in miles:%.3f",miles);
    }
    public void miles_to_km(){
        double miles,km;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the distance in miles:");
        miles=sc.nextDouble();
        km=miles*1.609;
        System.out.printf("Distance in kms:%.3f",km);
    }
    public void meter_to_km(){
        double meter,km;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the distance in meters:");
        meter=sc.nextDouble();
        km=meter/1000;
        System.out.printf("Distance in kms:%.2f",km);
    }
}
