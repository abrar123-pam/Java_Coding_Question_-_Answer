package Day_05;

public class throw_exception {

    public static void main(String[] args) {
        try{
            divide(10,0);
        }catch (ArithmeticException e){
            System.out.println("Exception caught: "+e.getMessage());
        }
    }

    public static void divide(int n1, int n2){
        if(n2 == 0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        int result = n1/n2;
        System.out.println(result);
    }
}
