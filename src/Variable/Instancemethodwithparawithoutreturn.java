package Variable;

public class Instancemethodwithparawithoutreturn {
    public void m2(String efirstname,String emiddlename,String elastname ){
        String name=efirstname+emiddlename+elastname;
        System.out.println(name);
    }

    public static void main(String[] args) {
        Instancemethodwithparawithoutreturn xyz=new Instancemethodwithparawithoutreturn();
        xyz.m2("Datla", "Tejaswi", "Reddy");
        xyz.m2("Datla", "Nikhil", "reddy");

    }
}
