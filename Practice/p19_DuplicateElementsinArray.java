import java.util.HashSet;

class p19_DuplicateElementsinArray {
    public static void main(String[] args) {
        
        //Approach 1
        int arr[] = {2, 4, 6, 8, 10, 22, 14, 16, 18, 24, 26, 28, 2, 4, 6, 8, 10 };

        boolean flag = false;
        System.out.println("Duplicate elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    flag = true;
                    break;  // Exit the inner loop to avoid printing the same duplicate multiple times
                }
            }
        }
        
        if(flag == false)
        {
            System.out.println("No Duplicate");
        }

        System.out.println("****************************************");
        
        //Approach 2 - Using HashSet

        String a[] = {"Java", "c", "Java", "html"};
        HashSet <String>langs = new HashSet<>();

        boolean flagu = false;

        for(String l: a){
            if(langs.add(l)==false){
                System.out.println("Found Duplicate Element: " +  l);
                flagu = true;
            }
            if(flagu== false){
                System.out.println("Not Found Duplicate");
            }
        }


    }
}
