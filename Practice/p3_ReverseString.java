class p3_ReverseString {
    public static void main(String[] args){
    
        //1. Using + (String concatenation) Operator

        String str1 = "ABCD";
        String x1 = "";

        int len1 = str1.length(); // 4

        for(int i = len1 - 1; i >= 0; i-- ){   // Start from index 3 (last character)
            x1 = x1 + str1.charAt(i);  
        }

        System.out.println("Result: " + x1 );


        //2. Using Character Array 

        String str2 = "XYZ";
        String x2 = "";

        char a[] = str2.toCharArray();
        int len2 = a.length;

        for(int i = len2 - 1; i >=0; i--){
            x2 = x2 + a[i];
        }

        System.out.println("Result: " + x2 );


        //3. Using String Buffer class

        String str3 = "MVBS";
        StringBuffer sb = new StringBuffer(str3);
        System.out.println(sb.reverse());

    }
}
