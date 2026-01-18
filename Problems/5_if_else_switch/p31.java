// IF ELSE SWITCH - GEOMETRY-BASED PROBLEMS
// 31. Check whether triangle is right-angled.

class p31 {
    public static void main (String[] args){
        //using Angles
        int angle1 = 90;
        int angle2 = 30;
        int angle3 = 60;

        if (angle1 + angle2 + angle3 == 180){
            System.out.println("Valid Triangle");

            if (angle1 == 90 || angle2 == 90 || angle3 == 90){
                System.out.println("Right-angled Triangle");
            }
            else {
                System.out.println("Not a right-angled Triangle");
            }
        }
        else {
            System.out.println("Not a Valid Triangle");
        }

        //using sides
        int a = 3;
        int b = 4;
        int c = 5;
        
        if(a + b > c && b + c > a && c + a >  b){
            System.out.println("Valid Triangle");

            if (c*c == a*a + b*b || a*a == c*c + b*b || b*b == a*a + c*c){
                System.out.println("Right-angled Triangle");
            }
            else{
                System.out.println("Not a Right-angled Triangle");
            }
        }
        else {
            System.out.println("Not Valid Triangle");
        }
    }
}


