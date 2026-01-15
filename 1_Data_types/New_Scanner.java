import java.util.Scanner;
public class New_Scanner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        char gender = sc.next().charAt(0);
        int age = sc.nextInt();
        long mobileno = sc.nextLong();
        double cgpa = sc.nextDouble();


        System.out.println("Name:"+""+name);
        System.out.println("Gender:"+""+gender);
        System.out.println("age:"+""+age);
        System.out.println("Mobile No:"+""+mobileno);
        System.out.println("CGPA:"+""+cgpa);

    }
} 