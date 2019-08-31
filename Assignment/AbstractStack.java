import java.util.Scanner;
abstract class Stack{
    abstract void insert();
    abstract void push();
    abstract void pop();
    abstract void display();
    int size = 10, top = 0;
}
class StackDefine extends Stack{
    int a[] = new int[size];
    int n, data;
    Scanner rp = new Scanner(System.in);
    public void insert(){
        System.out.print("\nEnter the number of elements : ");
        n = rp.nextInt();
        System.out.println("Enter the elements : ");
        for(int i = 0; i < n; i++)
            a[i] = rp.nextInt();
        top = n - 1;
    }
    public void push(){
        int push;
        System.out.println("Enter the element to push : ");
        push = rp.nextInt();
        top += 1;
        a[top] = push;
    }
    public void pop(){
        System.out.println("The element popped is: " + a[top]);
        n = top;
        top -= 1;
    }
    public void display(){
        System.out.println("Elements of stack: ");
        for (int i = top; i >= 0; i--)
            System.out.println(a[i]);
    }
}
public class AbstractStack{
    public static void main(String []args){
        Scanner rp = new Scanner(System.in);
        StackDefine obj = new StackDefine(); 
        int choice, ch = 0;
        while(true){
            System.out.println("-------Stack-------\n1.Insert\n2.Push\n3.Pop\n4.Display\n5.Exit\nEnter your choice:");
            choice = rp.nextInt();
            switch(choice){
                case 1:obj.insert();break;
                case 2:obj.push();break;
                case 3:obj.pop();break;
                case 4:obj.display();break;
                case 5:System.exit(0);
                default:System.out.println("Enter correct option!!!");
            }
        }
    }
}
