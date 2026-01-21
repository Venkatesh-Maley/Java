class p28_ReversingEachWordInAString {
    public static void main(String [] args){
        String str = "This is your Venky";
        
        String[] str_split = str.split(" ");
        String str_reverse = "";

        for(String s:str_split){
            String str_word = "";
            for(int i = s.length()-1; i>=0; i--){
                str_word = str_word + s.charAt(i);
            }

            str_reverse = str_reverse+ str_word + " ";

        } 
        System.out.println(str_reverse);
    }
}
 