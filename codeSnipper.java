import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
class A {
    A get() {
        return this;
    }
}
class B extends A {
    B get() {
        return this;
    }
    void message() {
        System.out.println("Hello from B");
    }
}
public class codeSnipper {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();


    public static void main(String[] args) {

        new B().get().message();

    }
    }






