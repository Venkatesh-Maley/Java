class p25_RemovingWhiteSpacesInString {
    public static void main(String [] args){
            String str1 = "venky IIIT Student";
            System.out.println("Before : " + str1);
        
            String regular_expression = str1.replaceAll(" ", "");
            System.out.println("After : " + regular_expression);

    }    
}

