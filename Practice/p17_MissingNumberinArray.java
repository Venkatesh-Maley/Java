class p17_MissingNumberinArray {
    public static void main(String [] args){
    
        //Rules:
        //Array should not have Duplicates
        //Array No need to be Sorted Order
        //Values should be in range

        int a[] = {1,2,5,4};

        //Process:
        //sum1 => 1+2+5+4 = 12
        //sum2 => 1+2+3+4+5 = 15
        //sum2 - sum1 = 15 - 12 = 3 Missing

        int sum1 = 0;

        for(int i = 0; i<a.length; i++){
            sum1 = sum1 + a[i];    
        }
        System.out.println(sum1);

        int sum2 = 0;

        for(int i = 1; i<=5 ; i ++){
            sum2 = sum2 + i;
        }
        System.out.println(sum2);
        
        int missing = sum2 - sum1;
        System.out.println("Our Missing Number is " + missing);

    }
}
