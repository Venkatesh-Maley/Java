import java.util.Random;


//Generating Random Strings
class p12_Random_Nums{
    public static void main(String [] args){


        //Approach - 1 (Single Number)
        Random rand = new Random();

        int rand_int = rand.nextInt(1000);

        System.out.println("Random Number is: " + rand_int);

        System.out.println("****************************************");

        //Approach - 1 (10 Numbers generating)
        Random rando= new Random();
        for(int i = 0; i < 10; i++) {
            int rando_int = rando.nextInt(100); // Generate a random number between 0 and 999
            System.out.println("Random Number " + (i+1) + " is: " + rando_int);
        }

        //Approach - 2 Using Math
        System.out.println(Math.random());


    }
}

        
  