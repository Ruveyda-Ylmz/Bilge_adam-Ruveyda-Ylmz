package week03.fileio;

import java.io.File;
import java.io.IOException;

public class FileProcess {
    public static void main(String[] args) throws IOException {
        File directory =new File("myDir");
        boolean bool = directory.mkdir(); //klasör oluşturdu
        System.out.println(bool); //varsa false,yoksa oluşturur true

        File file = new File(directory,"file"); //klasörü bulursa içine dosya oluşturucak
        bool = file.createNewFile(); //dosya varsa false,yoksa oluşturur true
        System.out.println(bool);

        bool=file.delete(); //dosya var ise siler true döner,
        System.out.println(bool);

        bool = directory.delete();//(mydir(klasör) i sil demek),klasörün içinde dosya varsa silmez false,varsa siler true döner
        System.out.println(bool);
    }
}
