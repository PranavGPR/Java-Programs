import java.util.Calendar;

public class Date_Print {

  public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println("Current Year is : " + now.get(now.YEAR));
        System.out.println("Current Month is : " + (now.get(now.MONTH) + 1));
        System.out.println("Current Date is : " + now.get(now.DATE));
  }
}
