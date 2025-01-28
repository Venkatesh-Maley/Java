import java.io.*;

/*class control{
    public static void main (String[] args){
        int x = 100;
        if(x > 50)
            System.out.println("x is greater than 50");
        else
            System.out.println("x is less than 50");
    }

}

//Example 1 : program of odd and even number 
class control {  
public static void main(String[] args) {  
     
    int number=13;
    if(number%2==0){  
        System.out.println("even number");  
    }else{  
        System.out.println("odd number");  
    }  
}  
} */

//Example 2 : program of odd and even number
class control {    
public static void main(String[] args) {    
    int year=2020;    
    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
        System.out.println("LEAP YEAR");  
    }  
    else{  
        System.out.println("COMMON YEAR");  
    }  
}    
}    