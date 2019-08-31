class Doctor{
    int age, id;
    String name, dep;
    Doctor( String nme,int no,int num,String dept) {
        name = nme;
        System.out.println("Name: "+name);
        try{
            for(int i=0; i< name.length(); i++)
            {
                char x = name.charAt(i);
                if(!((x > 64 && x < 91) || (x > 95 && x < 123)))
                    throw new NameNotValidException();
            }
        }catch(Exception e){
            System.out.println("\t"+e);
        }
        age = num;
        System.out.println("Age: "+age);
        try{
            if(age < 25 || age >65)
                throw new AgeNotWithinRangeException();
        }   
        catch(Exception e){
            System.out.println("\t"+e);
        }
        id = no;
        System.out.println("ID: "+id);
        dep = dept;
        System.out.println("Department: "+dep);
    }
}
class AgeNotWithinRangeException extends Exception{
    public String toString(){
        return "Your age is not valid!!!";
    }
}
class NameNotValidException extends Exception{
    public String toString(){
        return "Your name is not valid!!!";
    }
}
public class DoctorException{
    public static void main(String[] args){
        Doctor obj1 = new Doctor("|^$&@", 123, 27, "Ortho");
        System.out.println("----------------------------");
        Doctor obj2 = new Doctor("%P#", 1234, 45, "Ortho");
        System.out.println("----------------------------");
        Doctor obj3 = new Doctor("Pranav", 12345, 88, "Ortho");
    }   
}
