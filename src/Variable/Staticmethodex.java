package Variable;

public class Staticmethodex {
    static void m1() {
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
}
class Test11{
    public static void main(String[] args) {
        Staticmethodex a= null;
        a.m2();//o/p == null point exception
        a.m1();//o/p--m1
    }
}
