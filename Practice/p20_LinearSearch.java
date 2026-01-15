class p20_LinearSearch {
    public static void main(String[] args){
        int arr[] = {20,30,40,50,10};

        int search = 10;
        boolean flag = false;
 
        for(int i = 0; i < arr.length; i++){
                if(search == arr[i]){
                    System.out.println("Our Required Number is: " + arr[i]);
                    flag = true;
                    break;
                }
        }
        if(flag == false){
            System.out.println("Our Required Element not Found");
        }
    }

    }

