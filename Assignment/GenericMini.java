class Method
{
    int min,count;
    <L extends Comparable<L>>void list(L arr[])
    {
        L mini = arr[0];
        int pos1,pos2,len=arr.length;
        for(int i=0;i<len;i++)
        {
            int num =(Integer)arr[i];
            if(num % 2 != 0)
                count++;
            if(arr[i].compareTo(mini) < 0)
            {
                mini =arr [i];
            }
            min=(Integer)mini;
        }
        System.out.println("Minimum element is : " + min);
    }
}
public class GenericMini
{
    public static void main(String[] args) 
    {
        Integer[] lst = {13,34,19,56,76,34,70,17,52};
        Method obj = new Method();
        obj.list(lst);
    }
}