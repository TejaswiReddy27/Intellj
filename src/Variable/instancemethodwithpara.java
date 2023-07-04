package Variable;

public class instancemethodwithpara {
    public int m1(int uid,String username,String uloc){

        return uid;
    }
    public static void main(String[] args) {
        instancemethodwithpara abc=new instancemethodwithpara();
        abc.m1(123,"Teja","ndl");
        abc.m1(456,"Nikhil","knl");



    }
}
