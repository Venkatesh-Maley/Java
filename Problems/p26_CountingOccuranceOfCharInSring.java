class p26_CountingOccuranceOfCharInSring{
    public static void main(String [] args){

        String str = "Java Programming language";
        System.out.println("Given String: " + str);

        String str_replaced = str.replace("a", "");
        System.out.println("Replaced String: " + str_replaced);

        int len_str = str.length();
        int len_str_replaced = str_replaced.length();

        int NoOfOccurance = len_str - len_str_replaced;
        System.out.println("No of Occurance of 'a': " + NoOfOccurance);

    }
}


