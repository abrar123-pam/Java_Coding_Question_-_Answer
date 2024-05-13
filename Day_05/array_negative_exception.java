package Day_05;

public class array_negative_exception {
    public static void main(String[] args) {
        int array_size = -4;

        try{
            if(array_size <0){
                throw new NegativeArraySizeException("Array size is negative");
            }else{
                int[] array = new int[array_size];
                System.out.println("Array created successfully with size: " + array_size);
            }
        }catch (NegativeArraySizeException e){
            System.out.println("Exception caught: "+ e.getMessage());
        }
    }
}
