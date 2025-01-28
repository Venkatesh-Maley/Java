//Program to demonstrate 2D Jagged Array in Java
import java.io.*;
class Jagged_Arr1 {
    public static void main(String[] args){

    //Declaring 2D Array with 2 Rows
    int arr[][] = new int[2][];

    //Making the above array Jagged
    //First Row has 3 columns
    arr[0] = new int[3];

    //Second Row has 2 columns
    arr[1] = new int[2];

    //Initializing Array
    int count = 0;
    for (int i=0; i<arr.length; i++)
        for (int j=0; j< arr[i].length; j++)
            arr[i][j] = count++;

    //Displaying the values of 2D Jagged Array
    System.out.println("Contents of 2D Jagged Array");
    for (int i = 0; i < arr.length; i++){
        for (int j = 0; j < arr[i].length; j++)
            System.out.print(arr[i][j] + "");
        System.out.println();
    }
    }
}
