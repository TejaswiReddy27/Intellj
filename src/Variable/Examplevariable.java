package Variable;

public class Examplevariable {


        static char a='t'; //static
        int i = 100;//instance variable
        public static void main(String[] args) {
            float b = 5;  //local variable
            Examplevariable i1 = new Examplevariable() ; //object for instance variable
            System.out.println(a);  //calling static   variable
            System.out.println(Examplevariable.a);//another way for calling static variable  by using class name
            System.out.println(i1.i); //calling instance variable
            System.out.println(b);     //calling local  variable
        }

}
