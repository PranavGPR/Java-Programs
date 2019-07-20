package convertor;
import java.util.Scanner;
public class Timeconvertor {
    public void min_to_hour(){
        int mins,hours;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time in minutes:");
        mins=sc.nextInt();
        hours=mins/60;
        System.out.printf("Time in minutes:%d",hours);
    }
    public void sec_to_min()
    {
        int secs,mins;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time in seconds:");
        secs=sc.nextInt();
        mins=secs/60;
        System.out.printf("Time in minutes:%d",mins);
    }
    public void min_to_sec()
    {
        int min,sec,secs;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time");
        System.out.printf("\nMinutes:");
        min=sc.nextInt();
        System.out.printf("\nSeconds:");
        sec=sc.nextInt();
        secs=(min*60)+sec;
        System.out.printf("\nTime in seconds:%d",secs);
    }
    public void hour_to_min()
    {
        int hour,mins,min;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the time");
        System.out.printf("\nHour:");
        hour=sc.nextInt();
        System.out.printf("Minutes:");
        mins=sc.nextInt();
        min=(hour*60)+mins;
        System.out.printf("Time in mins:%d",min);
    }
}
