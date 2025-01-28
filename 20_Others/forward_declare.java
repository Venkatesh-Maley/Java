class forward_declare{
    public static void main(String[] args){
        Test1 t1 = new Test1();
        t1.fun(5);
    }
}
class Test1 {
    void fun(int x){
        System.out.println("fun() called: x =" +x);
    }
}

//Note: Unlike c++, We don't need forward declarations in Java. Indentifiers(Class and Method Names) are recognized automatically from source files.
//Similarly, Libraries are there is no neeed to create header files with Declarations