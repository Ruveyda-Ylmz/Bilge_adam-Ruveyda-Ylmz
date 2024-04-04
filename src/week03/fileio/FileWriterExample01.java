package week03.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample01 {
    public static void main(String[] args) throws Exception {

        //filewrite , dosya yazma
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("fileWriter.txt");
            fileWriter.write("merhaba file! ");
            fileWriter.write(System.lineSeparator()); //alt satıra geçen komut
            fileWriter.write("abc");
            fileWriter.write("\r\n"); //r satır başı yapar
            fileWriter.write("abc");
            fileWriter.flush(); //herşeyi doldurup atmak

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            if (fileWriter != null) {
                fileWriter.close();
            }
        }

        //dosyayı açmak okumak için
        FileReader fileReader = new FileReader("fileWriter.txt");
        int i; //karakter larakter okumak için
        while ((i=fileReader.read())!=-1){ //dosya içinde ki karakter bitene kadar oku
            System.out.print((char)i); //gelen ascıı değerleri char a döndürücek
        }
        fileReader.close();
    }
}
