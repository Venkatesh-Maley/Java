// IF ELSE SWITCH - NUMBER LOGIC
// 12. Check whether a given year is a leap year.

class p12{
    public static void main(String[] args){
        int year = 2012;

        if((year%4 ==0 && year%100 != 0) || (year%400 == 0)){
            System.out.println("Given Year is a Leap year");
        }
        else {
            System.out.println("Given Year is not a Leap year");
        }
    }
}