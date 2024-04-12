package week03.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedException { //Kontrol Edilen İstisna
    public static void main(String[] args) {

        try { //try (denemek)
            FileWriter fw =new FileWriter("file.txt");
        }catch (IOException e) { //catch (yakalamak)
            System.out.println("veri transverinde hata oldu");
          //  e.printStackTrace();
        }
    }
    public  void trowsExample() throws IOException{
        FileWriter fw =new FileWriter("file.txt");
  }
}
