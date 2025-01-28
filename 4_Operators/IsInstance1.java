//Java Program to Demonstrate Working of instanceof Keyword

class Parent{}                  //class1
class Child extends Parent{}    //class2
class Main{                     //class3(Main class)
    public static void main(String []args)      //Main drive Method
    {
        Child cobj = new Child();       //Creating Object of Child class


        //Sample Code
        if(cobj instanceof Child)
            System.out.println("cobj is instance of Child");
        else 
            System.out.println("cobj is Not instance of child");
    

        // Instanceof Returning true of Parent class also
        if(cobj instanceof Parent)
            System.out.println("cobj is Instance of Parent");
        else
            System.out.println("cobj is Not Instance of Parent");

        // instanceof returns true for all ancestors
        // Note: Object is ancester of all classes in Java
        if(cobj instanceof Object)
            System.out.println("cobj is instance of object");
        else
            System.out.println("cobj isd Not instance of Object");


    }
}