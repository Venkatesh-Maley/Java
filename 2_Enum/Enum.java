import java.util.Scanner;
enum Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
public class Enum{
    Day day;
    public Enum(Day day) {this.day=day;}
    public void dayIsLike()
    {
        switch(day){
            case MONDAY:
            System.out.println("Mondays are Bad.");
            break;
            case FRIDAY:
            System.out.println("Fridays are Better.");
            break;
            case SATURDAY:
            case SUNDAY:
            System.out.println("Weekends are Best");
            break;
            default:
            System.out.println("Midweek days are So-So");
            break;
        }

    }
    public static void main(String[] args)
    {
        String str="SUNDAY";
        Enum t1=new Enum(Day.valueOf(str));
        t1.dayIsLike();
    }

}
