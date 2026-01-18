// IF ELSE SWITCH - GEOMETRY-BASED PROBLEMS
// 30. Check type of triangle:
// Equilateral
// Isosceles
// Scalene

class p30 {
    public static void main (String[] args){
        int side1 = 20;
        int side2 = 20;
        int side3 = 20;

        if(side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 >  side2){
            System.out.println("Valid Triangle");
            if(side1 == side2 && side2 == side3){
                System.out.println("Equilateral");
            }
            else if (side1 == side2 || side2 == side3 || side3 == side1){
                System.out.println("Isosceles");
            }
            else if (side1 != side2 && side2 != side3 && side3 != side1){
                System.out.println("Scalene");
            }
            else {
                System.out.println("Not Valid Triangle");
            }
        }
        else {
            System.out.println("Not Valid Triangle");
        }
    }
}