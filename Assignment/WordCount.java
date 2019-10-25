package test;
import java.io.FileInputStream;
class Threadaccess extends Thread{
    int count=0,i;
    public void run(){
        try
        {
            FileInputStream fin1 = new FileInputStream("C:\\Users\\Pranav\\Documents\\NetBeansProjects\\Pranav\\src\\test\\a.txt");
            FileInputStream fin2 = new FileInputStream("C:\\Users\\Pranav\\Documents\\NetBeansProjects\\Pranav\\src\\test\\b.txt");
            FileInputStream fin3 = new FileInputStream("C:\\Users\\Pranav\\Documents\\NetBeansProjects\\Pranav\\src\\test\\c.txt");
            while((i = fin1.read())!=-1)
                count++;
            System.out.println("Number of words in a.txt : "+count);
            count = 0;
            while((i = fin2.read())!=-1)
                count++;
            System.out.println("Number of words in b.txt : "+count);
            count = 0;
            while((i = fin3.read())!=-1)
                count++;
            System.out.println("Number of words in c.txt : "+count);
        }
        catch(Exception e)
        {
            System.out.println("Exception caught!!");
        }
    }
}
public class WordCount
{
    public static void main(String[] args)
    {
        int no=args.length;
        Threadaccess obj = new Threadaccess();
        obj.start();
    }
}
