package OnlineLibrary;//implement a class for library
//methods: addbook(),showbooks(),returnbooks(),show availablebooks()
//array to store the available books
// array to show the isssued books
import java.util.Objects;
import java.util.Scanner;

class Library {
    String takebook;
    Scanner sc = new Scanner(System.in);

    public String[] bookarr() {
    String[] books = {"English", "Maths", "Biology", "Data structure", "Theory of computation"};
    return books;
}
    public void issueBook(){
        String[] books = bookarr();
        showAvailableBook();
        boolean found = false;
        System.out.println("Please enter the book do you want to read:");
        String input = sc.next();
        for (int i=0;i< books.length;i++){
            String b = books[i];
            if(Objects.equals(input,b)){
                System.out.println("Here is u r "+books[i]+"You have to return it within one month");
                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println("The book is currently not available");
        }

    }
    public void showAvailableBook(){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("The list of books available in library ");
        for(int i=0;i< bookarr().length;i++){
            System.out.println(bookarr()[i]);
        }
        System.out.println("------------------------------------------------------------------------------");
    }

    public void returnBook(){
        System.out.println("Which book do you want to return");
        String a = sc.next();
        System.out.println("Thanks for returning the "+a+ "book");
    }
}

public class OnlineLibrary {

    public static void main(String[] args) {
        System.out.println("Welcome to the OnlineLibrary.Library");
        Library l = new Library();
        l.showAvailableBook();
        l.issueBook();
        l.returnBook();


    }
}
