import java.util.ArrayList;
public class Random {
    public static void main(String []args){
        int random = 0,total=0,avg=0;
        int a[]=new int[20];
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2=new ArrayList<Integer>();
        System.out.println("Values are : ");
        for(int i=0; i<20; i++){
            random= (int)(90.0*Math.random());
            while(random < 10)
                random= (int)(90.0*Math.random());
            if(random >= 10 && random <=90)
                a[i]=random;
            System.out.println(a[i]);
            total+=a[i];
        }
        avg=total/20;
        for(int i=0;i < 20; i++){
            if(avg <= a[i])
                a1.add(a[i]);
            else
                a2.add(a[i]);
        }   
        System.out.println("Above average marks: "+a1);
        System.out.println("Below average marks: "+a2);
    }
}