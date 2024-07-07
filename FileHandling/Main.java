package FileHandling;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Abrar Musharraf P\\IdeaProjects\\Practice\\src\\FileHandling\\Demo.txt";


        try(CharArrayWriter cw = new CharArrayWriter()) {
            cw.write("Hey Pam \n i am coming to zoho");
            char[] arr = cw.toCharArray();

            try(FileWriter fw = new FileWriter(path)) {
                fw.write(arr);
            }catch (IOException e){
                e.printStackTrace();

            }

        }catch (IOException e){
            e.printStackTrace();
        }

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
