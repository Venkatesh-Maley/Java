class p15_Arr_EvenAndOdd {
    public static void main(String [] args){
        int a[] = {1,2,3,4,5,6};

        //Extracting EVEN Numbers

        System.out.println("Even Numbers: ");
        for(int i = 0; i < a.length;  i ++){
            if(a[i]%2 ==0){
                System.out.println(a[i]);
            }
        }

        //Extracting ODD Numbers

        System.out.println("Odd Numbers: ");
        for(int i = 0; i < a.length;  i ++){
            if(a[i]%2 != 0){
                System.out.println(a[i]);
            }
        }

        //Enhanced For Loop

        int b[] = {11,12,13,14,15,16};
        
        //Extracting EVEN Numbers
        System.out.println("Even Numbers: ");
        for(int value:b){
            if(value%2==0){
                System.out.println(value);
            }
        }

        System.out.println("Odd Numbers: ");
        for(int value:b){
            if(value%2!=0){
                System.out.println(value);
            }
        }

    }
}
