import java.util.Scanner;
import java.util.Calendar;
public class Date_info {
   public static int FindDay(int month,int Day,int year){
        Calendar c1=Calendar.getInstance();
        c1.set(year,month,Day);
       System.out.println(c1.getTime());
        int dayofWeek=c1.get(Calendar.DAY_OF_WEEK);
        return dayofWeek;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int day= sc.nextInt();
        int month= sc.nextInt();
        int year= sc.nextInt();
        int dayNum=FindDay(month,day,year);
        System.out.println(dayNum);
        switch (dayNum){
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;

            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
                case 7:
                System.out.println("SATURDAY");
                break;

        }
    }
}
