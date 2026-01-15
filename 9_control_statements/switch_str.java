//Java Program to Demonstrate use string to control a switch statement

//Main class

class control{
    //Main driver Method
    public static void main(String[] args)
    {
        //custom input string 
        String str = "two";

        //Switch statement over above string
        switch(str){
            //case 1
            case "one":
                System.out.println("one");
                break;
            //case 2
            case "two":
                System.out.println("two");
                break;
            //case 3
            case "three":
                System.out.println("three");
                break;
            //case 4 Default
            default:
                System.out.println("No Match");
        }
    }
}