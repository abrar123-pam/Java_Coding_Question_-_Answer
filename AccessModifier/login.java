package AccessModifier;

class log{
    public int z =20;
    protected  int y = 6;
    int u = 77;
    private int x =10;
}

class sign extends log{
    public  void meth() {
        System.out.println(z);
        System.out.println(y);
        System.out.println(u);
//        System.out.println(x);

    }
}
public class login {

//    public  void meth(){
//        System.out.println(z);
//        System.out.println(y);
//        System.out.println(u);
//        System.out.println(x);
//    }

    public static void main(String[] args) {
        log l = new log();
//        AP A = new AP();
        //        l.meth();
        sign s = new sign();
        System.out.println(s.z);
        System.out.println(s.y);
        System.out.println(s.u);
//        System.out.println(s.x);
    }
}
