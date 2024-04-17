package week05.exception.trywithresources.supperssedexception;

import java.io.IOException;
import java.util.Arrays;

public class SupperessedException {
    public static void main(String[] args) {
        try(Computer computer = new Computer()) {
            System.out.println("try blok");
            int number = 1/0;
        }catch (Exception e){
            System.out.println("catch blok");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getSuppressed())); //bastırılmış hatayı yazdırır
        }

    }
}
