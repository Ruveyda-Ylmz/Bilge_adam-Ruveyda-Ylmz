package week03.fileio;

import java.io.*;

public class BufferedWriteAndReaderEx { //Arabelleğe Alınmış Yazma ve Okuyucu
    //file io (file input output)

    //throws(hata fırlatıp programı durdurmaya yarar)
    public BufferedWriteAndReaderEx() throws FileNotFoundException { //Dosya Bulunamadı İstisnası
    }


    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("buffered.txt"); //dosya yazma
        BufferedWriter bw = new BufferedWriter(fw); //arabellekli Yazar
        bw.write("hello");
        bw.write("word");
        bw.newLine(); //aşğıya inme komutu
        bw.write("java");
        bw.close();
        fw.close();

    FileReader fr = new FileReader("buffered.txt"); //dosya okuyucu
    BufferedReader br = new BufferedReader(fr); //Arabellekli Okuyucu

    String data = null; //obje oluşturuduğumuzdan null değeri olmayackatır bu sebepten null ile karşılaştırıyoruz

    while((data = br.readLine()) != null){ //satırı okur
        System.out.println(data);

    }
    fr.close();
    br.close();

    }
}
