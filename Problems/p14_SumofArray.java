class p14_SumofArray {
    public static void main(String [] args){
        int a[] = {1,2,3,4,5,6,7,8,9,10,9,8,7,6,5,4,3,2,1};
        int b[] = {1,2,3,4,5,6,7,8,9,10,9,8,7,6,5,4,3,2,1};

        int sum = 0;
        int sum_enhance = 0;

        //Using Normal For loop
        for(int i = 0; i <= a.length-1 ; i++){
            sum = sum + a[i];
        }
        System.out.println("Sum of Array is: " + sum);

        //Using Enhanced For loop
        for(int value:a){
            sum_enhance = sum_enhance + value;
        }
        System.out.println("Sum of Array is: " + sum_enhance);


    }
}
