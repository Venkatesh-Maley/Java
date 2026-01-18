    // IF ELSE SWITCH - REAL-WORLD LOGIC PROGRAMS
    // 22. Read marks and print grade:

    // ≥90 → A

    // ≥75 → B

    // ≥60 → C

    // <60 → Fail

    class p22{
        public static void main (String[] args){
            int marks = 89;

            if(marks >= 90){
                System.out.println("Grade A");
            }
            else if (marks >= 75){
                System.out.println("Grade B");
            }
            else if (marks >= 60){
                System.out.println("Grade C");
            }
            else {
                System.out.println("Fail");
            }
        }
    }