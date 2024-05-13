package Day_05;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
            int result = 10/0;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds:"+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception occured: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Exception occured : "+e.getMessage());
        }
    }
}
