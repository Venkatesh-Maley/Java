// IF ELSE SWITCH - GEOMETRY-BASED PROBLEMS
// 29. Check whether three sides form a valid triangle.
// If the sum of the lengths of any two sides is always greater than the length of the third side, a rule known as the Triangle Inequality Theorem.

class p29 {
    public static void main (String[] args){
        int side1 = 20;
        int side2 = 20;
        int side3 = 20;

        if(side1 + side2 > side2 && side2 + side3 > side1 && side3 + side1 >  side2){
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("Not Valid Triangle");
        }
    }
}