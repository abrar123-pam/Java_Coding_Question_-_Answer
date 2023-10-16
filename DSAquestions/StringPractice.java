package DSAquestions;

public class StringPractice {

    public static void main(String[] args) {

        String name  = "Abrar";

        System.out.println(name);

        String tl = name.toLowerCase();
        System.out.println(tl);
        System.out.println(name.toUpperCase());

        String met = new String("     java string method");
        System.out.println(met.trim());
        System.out.println(name.substring(2,4));
        System.out.println(name.replace("rar","bu"));
        System.out.println(name.startsWith("r"));
        System.out.println(name.startsWith("A"));
        System.out.println(name.charAt(2));
        String sc = "PAM RANGER";
        System.out.println(sc.indexOf("E"));
        System.out.println(sc.equals("PAM"));
        System.out.println(sc.equalsIgnoreCase("pam ranger"));
        System.out.println(sc.isEmpty());
        System.out.println(sc.length() );
    }
}
