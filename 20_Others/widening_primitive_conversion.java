// Java Program to Illustrate Widening Datatype Conversion No Computations

// Main class
class type_conversion{

    public static void main(String[] args)
    {

        System.out.print("Y" + "O");
        System.out.print('L');
        System.out.print('O');
    }
}

//Output: YOLO
//Explaination: This will now print “YOLO” instead of “YO7679”. 
//It is because the widening primitive conversion happens only when an operator like '+' is present which expects at least an integer on both sides.

// Java Program to Illustrate Widening Datatype Conversion Computations is Carried Out

class type_conversion {

    public static void main(String[] args)
    {

        System.out.print("Y"
                         + "O");

        // here computations is carried between letter
        System.out.print('L' + 'O');
    }
}

//Output: YO155
//Explaination: When we use double quotes, the text is treated as a string and “YO” is printed, but when we use single quotes,
 //the characters ‘L’ and ‘O’ are converted to int. This is called widening primitive conversion. After conversion to integer, the numbers are added ( ‘L’ is 76 and ‘O’ is 79) and 155 is printed.