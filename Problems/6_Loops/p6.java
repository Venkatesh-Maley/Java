// LOOPS - SERIES PRINTING
// 6. Print multiplication tables from 1 to 10.

class p6 {
    public static void main(String[] args){

        for (int num = 1; num <= 10; num++){
            System.out.println("Table of " + num + ":");

            for (int i = 1; i <= 10; i++){
                int output = 1;

                output = num * i;
                System.out.println(num + "x" + i + "=" + output);
            }
        }
    }
}
