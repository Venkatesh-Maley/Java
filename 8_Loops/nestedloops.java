import java.io.*;
class loops{
    public static void main(String[] args)
    {
        int weeks = 3;
        int days = 7;
        int i = 1;
        //outer loop
        while(i<= weeks){
            System.out.println("Week:"+i);
            //Inner loop
            for(int j=1; j <= days; ++j){
                System.out.println("Days:"+j);
            }
            ++i;
        }
    }
}