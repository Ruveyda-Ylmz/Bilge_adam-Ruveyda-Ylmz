package week03.fileio;

import java.io.*;

public class BufferedWriteAndReaderEx {
    public BufferedWriteAndReaderEx() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("buffered.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hello");
        bw.write("word");
        bw.newLine();
        bw.write("java");
        bw.close();
        fw.close();


    FileReader fr = new FileReader("buffered.txt");
    BufferedReader br = new BufferedReader(fr);

    String data = null; //obje oluşturuduğumuzdan null değeri olmayackatır bu sebepten null ile karşılaştırıyoruz

    while((data = br.readLine()) != null){ //satırı okur
        System.out.println(data);

    }
    fr.close();
    br.close();

    }
}
