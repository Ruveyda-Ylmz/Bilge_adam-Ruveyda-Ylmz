package week03.fileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintwriteExample {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("printWrite.txt");
        pw.println("hello");
        pw.println("word");
        pw.println();
        pw.println("java");
        pw.flush();
        pw.close();
    }
}
