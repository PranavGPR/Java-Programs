import java.util.Scanner;
class Generic<Test>{
    int size = 5;
    Test a[];
    Scanner rp = new Scanner(System.in);
    Generic(Test arr[]){
        a = arr;
    }
    Test add_beg(Test x){
         a[0] = x;
         System.out.println("Added at beginning successfully");
         for(int i = 0; i < size; i++)
            System.out.println(a[i]);
         return null;
    }
    Test add_end(Test x){
        System.out.println("Added at ended successfully");
         a[4] = x;
         for(int i = 0; i < size; i++)
            System.out.println(a[i]);
         return null;
    }
    Test add_middle(Test x){
        System.out.print("Enter the index to insert : ");
        int index = rp.nextInt();
        a[index] = x;
        System.out.println("Added at the specified position successfully");
         for(int i = 0; i < size; i++)
            System.out.println(a[i]);
         return null;
    }
    Test delete_pos(){
        System.out.print("Enter the index to delete : ");
        int index = rp.nextInt();
        a[index] = null;
        System.out.println("Deleted element at the specified position successfully");
         for(int i = 0; i < size; i++)
            System.out.println(a[i]);
         return null;
    }
}
public class GenericClassArray {
    public static void main(String[] args) {
        int x = 5;
        Generic<Integer> obj = new Generic<Integer>(new Integer[]{10,20,30,40,50});
        obj.add_beg(x);
        obj.add_end(x);
        obj.add_middle(x);
        obj.delete_pos(); 
    }
}
