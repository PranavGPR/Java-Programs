import java.util.Scanner;
interface QueueOperations{
    void enqueue();
    void dequeue();
    void display();
    int max=5;
}
class Queue implements QueueOperations
{
    int a[]=new int[max];
    int front,rear;
    Scanner scan = new Scanner(System.in);
    Queue()
    {
        front=-1;
        rear=-1;
    }
    public void enqueue()
    {
        int x;
        System.out.print("Enter the element:");
        x = scan.nextInt();
        if(rear < max-1)
        {
            if(rear == -1)
                front = 0;
           rear++;
           a[rear] = x;
        }
        else
            System.out.println("Queue Overflow ");
    }
    public void dequeue()
    {
        if(rear==-1)
            System.out.println("Queue Underflow");
        else
        {
            System.out.println("The dequeued element is " + a[front] );
             if(front==rear)
            {
                front=-1;
                rear=-1;
                return;
            }
            front++;
        }
    }
    public void display()
    {
        if(rear==-1)
            System.out.println("Queue is empty!!");
        else{
            System.out.println("Elements are:");
            for(int i=front;i<=rear;i++)
                System.out.println(a[i]);
        }
    }
}
public class MyQueue {
     public static void main(String []args){
       Scanner rp=new Scanner(System.in);
       Queue obj=new Queue();
       int opt;
       while(true){
            System.out.print("\t\tQueue\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\nEnter your option:");
            opt=rp.nextInt();
            switch(opt){
                case 1:obj.enqueue();
                       break;
                case 2:obj.dequeue();
                       break;
                case 3:obj.display();
                       break;
                case 4:System.exit(0);
            }
       }
   }
}