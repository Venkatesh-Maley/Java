import java.io.*;

class loops
{
    public static void main(String[] args)
    {
        {
            int[] marks = {125,34,111,222,334};

            int highest_marks = maximum(marks);
            System.out.println("The highest score is " + highest_marks);

        }
    }
    public static int maximum(int[] numbers)
    {
        int maxSoFar = numbers[0];

        //For each Loop
        for (int num : numbers)
        {
            if (num > maxSoFar)
            {
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }
}