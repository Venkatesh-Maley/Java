//"Instance Varibles" are non-static Variables and are declared in a Class outside of any Method,Constuctor or Block.

import java.io.*;

class InstanceVar{
    public String geek;
    public InstanceVar()    //Declaring Instance Variable 
    {
        geek = "Venky";      //Initializing Instance Variable

    }
    public static void main(String[] args)
    {
        InstanceVar name = new InstanceVar();
        System.out.println("Geek name is:" + name.geek);
    }
}