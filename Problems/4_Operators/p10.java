// Operators - Logical Operators
// 10. Check if a year is a leap year.

class p10 {
    public static void main (String[] args){
        int year = 2013;

        if((year%4 == 0 && year%100 !=0 ) || (year%400 == 0) ){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}