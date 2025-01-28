//In 2 Dimentional Array
/*
class Indirect_Arr {
    public static void main (String [] args)
    {
        int[][] arr = new int[10][20];
        arr[0][0] = 1;
        System.out.println("arr[0][0]= " + arr[0][0]);
    }
}
*/

//In 3 Dimentional Array
class Indirect_Arr {
    public static void main(String[] args)
    {

        int[][][] arr = new int[10][20][30];
        arr[0][0][0] = 1;

        System.out.println("arr[0][0][0] = " + arr[0][0][0]);
    }
}
