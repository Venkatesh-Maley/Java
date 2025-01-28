import java.text.DecimalFormat;

class Output2{
    public static void main(String args[])
    {
        double num = 123.4567;

        //Prints only numeric part of a Floating Number
        DecimalFormat ft = new DecimalFormat("###");
        System.out.println("Without Fraction part: num = "+ft.format(num));

        //This will print it upto 2 decimal places
        ft = new DecimalFormat("#.##");
        System.out.println("Formatted to give precision: num =" + ft.format(num));

        //Automatically appends zero to the rightmost part of decimal number instead of #, we use digit 0
        ft = new DecimalFormat("0000.00");
        System.out.println("formatting numeric part: num =" + ft.format(num));

        //formatting money in dollars
        double income = 23456.789;
        ft = new DecimalFormat("$###,###.##");
        System.out.println("Your Formatted Dream Income:" + ft.format(income));
    }
}