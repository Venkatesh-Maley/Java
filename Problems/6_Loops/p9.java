// LOOPS - SERIES PRINTING
// 9. Print the cube of numbers from 1 to N.

class p9 {
    public static void main (String[] args){
        int N = 20;

        for (int i = 1; i <= N; i++){
            int cube_number = 1;

            cube_number = i*i*i;

            System.out.println("Cube of " + i + " = " + cube_number);

            i++;
        }
    }
}