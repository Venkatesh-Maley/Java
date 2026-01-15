import java.util.Arrays;

class p16_CheckArrayEquals {
    public static void main(String[] args){

        //Approach 1 Using Arrays.equal

        int a1[] = {1,2,3,4,5,6};
        int a2[] = {1,2,3,4,5,6};

        boolean status = Arrays.equals(a1,a2);

        if(status == true){
            System.out.println("Arrays are Equal");

        }
        else{
            System.out.println("Arrays are not Equal");
        }

        //Approach 2 
        
        int x1[] = {1,2,3,4,5,6};
        int x2[] = {1,2,3,4,8,9};

        boolean status_new = true;

        if(x1.length == x2.length){
            for(int i =0; i< x1.length;i++){
                if(x1[i] != x2[i]){
                    status_new = false;
                }
            }
        }
        else{
            status_new = false;
        }

        if(status_new == true){
            System.out.println("Arrays are Equal");

        }
        else{
            System.out.println("Arrays are not Equal");
        }


    }    
}
