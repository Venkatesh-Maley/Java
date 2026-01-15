class p31_LeapYear {
    public static void main(String [] args){
        int year = 2012;

        if((year%400 ==0) || (year%4==0 && year%100!=0)){
            System.out.println("This is a Leap Year");
        }
        else{
            System.out.println("This is not a Leap Year");
        }
    }
}
