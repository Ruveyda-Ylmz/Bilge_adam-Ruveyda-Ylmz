package week03.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {

        try {
            FileWriter fw =new FileWriter("file.txt");
        }catch (IOException e) {
            System.out.println("veri transverinde hata oldu");
          //  e.printStackTrace();
        }
    }
    public  void trowsExample() throws IOException{
        FileWriter fw =new FileWriter("file.txt");
  }
}
