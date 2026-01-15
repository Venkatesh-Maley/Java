import java.util.Arrays;

class p23_SortElementsUsingBuiltInMethods {
    public static void main(String [] args){
        int a[] = {100,200,300,10,20,30,40};
        System.out.println("Before Sorting: " + Arrays.toString(a));
        
        Arrays.sort(a);
        System.out.println("After Sorting: " + Arrays.toString(a));
    }
}
