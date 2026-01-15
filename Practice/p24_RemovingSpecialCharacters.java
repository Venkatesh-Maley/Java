class p24_RemovingSpecialCharacters{
    public static void main(String [] args){
        String str = "@#$%$#@ Venky RGUKT R190519";
        System.out.println("Before Removing Junk: " + str);

        String regular_expression = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("After Removing Junk: " + regular_expression);
        
    }
}