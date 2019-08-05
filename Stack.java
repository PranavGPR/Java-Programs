import java.util.Scanner;
interface stackmethod{
    void create();
    void push();
    void pop();
    void display();
    int MAX=5;
}
class StackFunctions implements stackmethod{
    int top=-1;
    int a[]=new int[MAX];
     Scanner rp=new Scanner(System.in);
    public void create()
    {
        int n;
        System.out.print("Enter the no of elements:");
        n=rp.nextInt();
        if(n>MAX)
            System.out.println("Exceeded size limit");
        else{
        for(int i=0;i<n;i++)
        {
            System.out.printf("Enter the %d element:",i);
            a[i]=rp.nextInt();
        }
        top=n-1;
        }
    }
    public void push()
    {
        if(top==MAX-1)
            System.out.println("Stack overflow!!!!");
        else
        {
            top++;
            System.out.print("Enter the element to be pushed:");
            a[top]=rp.nextInt();
        }
    }
    public void pop()
    {
        if(top==-1)
            System.out.println("Stack underflow!!!");
        else{
            System.out.println("Element popped:"+a[top]);
            top--;
        }
    }
    public void display(){
        if(top==-1)
            System.out.println("Stack is empty !!");
        
        else{
            System.out.println("Elements in stack:");
            for(int i=top;i>=0;i--)
                System.out.println(a[i]);    
        }
    }
}
public class Stack {
    public static void main(String []args)
    {
        int ch;
        stackmethod obj=new StackFunctions();
        Scanner rp=new Scanner(System.in);
        while(true)
        {
        System.out.print("----------MENU-----------\n\n1.Create\n2.Push\n3.Pop\n4.Display\n5.Exit\nEnter your choice:");
        ch=rp.nextInt();
        switch(ch)
        {
            case 1:obj.create();
                   break;
            case 2:obj.push();
                   break;
            case 3:obj.pop();
                   break;
            case 4:obj.display();
                   break;
            case 5:
                   System.exit(0);break;
            default:
                   System.out.println("\nPlease select correct option  ");  
        }
    }
}
}
