import java.util.Scanner;
abstract class Car{
    int reg_no;
    String model,reg_date;
    Scanner rp=new Scanner(System.in);
    Car(){
        System.out.print("Enter the registration number:");
        reg_no=rp.nextInt();
        System.out.print("Enter the model of the vehicle:");
        model=rp.next();
        System.out.print("Enter the registration date:");
        reg_date=rp.next();
    }
}
class transportVehicles extends Car{
    int validity_no,period;
    String start_date;
    Scanner rp=new Scanner(System.in);
    transportVehicles()
    {
        super();
        System.out.print("Enter the validity number:");
        validity_no= rp.nextInt();
        System.out.print("Enter the start date:");
        start_date= rp.next();
        System.out.print("Enter the period of the vehicle:");
        period = rp.nextInt();
    }
    void display(){
        System.out.println("Registration number:"+reg_no);
        System.out.println("Model:"+model);
        System.out.println("Registration date:"+reg_date);
        System.out.println("Validity number:"+validity_no);
        System.out.println("Start date:"+start_date);
        System.out.println("Period of the Vehicle:"+period);
    }
}
class privateVehicle extends Car
{
    String owner_name,owner_address;
    Scanner rp=new Scanner(System.in);
    privateVehicle()
    {
        super();
        System.out.print("Enter the owner name:");
        owner_name=rp.next();
        System.out.print("Enter the owner address:");
        owner_address=rp.next();
    }
    void display(){
        System.out.println("Registration number:"+reg_no);
        System.out.println("Model:"+model);
        System.out.println("Registration date:"+reg_date);
        System.out.println("Owner name:"+owner_name);
        System.out.println("Owner address:"+owner_address);
    }
}
public class Details {
    public static void main(String []args){
        int i=0,j=0;
        transportVehicles obj1[]=new transportVehicles[10];
        privateVehicle obj2[]=new privateVehicle[10];
        Scanner rp=new Scanner(System.in);
        int opt;
        while(true){
            System.out.print("\t\tMenu\n\t1.Booking\n\t2.Display details\n\t3.Exit\nEnter your option:");
            opt=rp.nextInt();
            switch(opt){
                case 1:System.out.print("\t1.TransportVehicles\n\t2.PrivateVehicles\n\t3.Exit\nEnter your option:");
                       opt=rp.nextInt();
                       switch(opt){
                           case 1:obj1[i]=new transportVehicles();
                                  i++;
                                  break;
                           case 2:obj2[j]=new privateVehicle();
                                  j++;
                                  break;
                           case 3:break;
                       }
                       break;
                case 2:System.out.print("\t1.TransportVehicles\n\t2.PrivateVehicles\n\t3.Exit\nEnter your option:");
                       opt=rp.nextInt();
                       switch(opt){
                           case 1:for(int k=0;k<i;k++)
                                      obj1[k].display();
                                  break;
                           case 2:for(int m=0;m<j;m++)
                                      obj2[m].display();
                                  break;
                           case 3:break;
                       }
                       break;
                case 3:System.exit(0);
            }
        }
    }
}