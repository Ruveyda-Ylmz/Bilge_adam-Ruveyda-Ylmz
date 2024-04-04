package week03.fileio;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        File file = new File("text.txt");
        System.out.println(file.exists());
        try {
            if (!file.exists()) { //dosya varmı
                file.createNewFile();//dosyayı oluştur(yok ise oluşturur)
            }
        }
         catch(IOException e){
                e.printStackTrace();
         }
        System.out.println(file.exists());
    }
}
