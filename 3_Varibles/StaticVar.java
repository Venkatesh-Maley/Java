//Static Varibles are declared similarly as Instance Varibles Where the difference is that Static Varibles are declared using the Static Keyword within the class outside of any method,constructor or Block.

import java.io.*;

class StaticVar{
    public static String geek="Venky";   //Declaring static Variable

    public static void main(String[] args){
        System.out.println("Geek name is:"+StaticVar.geek);
    }
}
