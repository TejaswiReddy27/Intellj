package Variable;

public class StaticMethodExampleWithoutretuentype {
    static int i = 100;
    public static void m1(){
        System.out.println("m1=method");
        System.out.println(i);
    }

    public static void main(String[] args) {
        System.out.println(StaticMethodExampleWithoutretuentype.i);
        StaticMethodExampleWithoutretuentype.m1();
    }
}
