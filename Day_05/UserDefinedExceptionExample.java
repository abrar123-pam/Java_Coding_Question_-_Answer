package Day_05;

class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}

public class UserDefinedExceptionExample {
    public static void main(String[] args) {
        try{
            validate(17);
        }catch (CustomException e){
            System.out.println("Custo exception caught "+e.getMessage());
        }
    }
    public static void validate(int n) throws CustomException{
        if (n < 18) {
            throw new CustomException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}
