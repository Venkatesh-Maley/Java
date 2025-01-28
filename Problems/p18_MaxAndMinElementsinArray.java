class p18_MaxAndMinElementsinArray{
    public static void main(String [] args){
        int arr[] = {12,16,18,20,24,28};
        for(int i = 0; i<arr.length; i++ ){
            System.out.println("Given numbers are " + i +": "+ arr[i]);
        }

        int max = arr[0];
        for(int i = 0; i<arr.length; i++ ){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max number : " + max);

        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Min number : " + min);

        


    }
}