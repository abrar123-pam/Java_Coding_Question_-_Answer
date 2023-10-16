package AccessModifier;


class publi{
    public int q =10;
    protected int w =12;
    int e = 13;
    private int r = 14;

//    public void meth2(){
//        System.out.println(q);
//        System.out.println(w);
//        System.out.println(e);
//        System.out.println(r);
//    }
}


class sub extends publi{
    public void meth2(){
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
//        System.out.println(r);
    }
}

public class Acessmodifier {

    public static void main(String[] args) {

        publi p = new publi();
        sub s = new sub();
        s.meth2();
////        p.meth2();
//        System.out.println(p.q);
//        System.out.println(p.w);
//        System.out.println(p.e);
//        System.out.println(p.r); ---> private cannot accessed in package

    }
}
