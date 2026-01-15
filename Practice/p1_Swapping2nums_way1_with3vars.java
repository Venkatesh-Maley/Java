// 5 Different ways of Swapping two numbers
class p1_Swapping2nums_way1_with3vars {
    public static void main (String [] args) {
        int a = 10 ;
        int b = 20;

    System.out.println("Before Swapping: "+ a + " " + b);

    //Login1 - using Third variable
    int temp = a;
    a = b ;
    b = temp;

    System.out.println("After Swapping: "+ a + " " + b);

    }
}
