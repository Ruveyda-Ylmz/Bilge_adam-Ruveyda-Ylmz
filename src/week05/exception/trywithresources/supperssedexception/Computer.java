package week05.exception.trywithresources.supperssedexception;

import java.io.IOException;

public class Computer implements  AutoCloseable{


    @Override
    public void close() throws Exception {
        System.out.println("shut down..");
        //2.exception
        throw new IllegalAccessException("exception is close!"); //bu hatayı görmez çünkü
        // try carch bloğu bir hatayı görür ve diğer hata bastırılmış olur
        //kısaca bir hatnın tetiklediği diğer hatalar demek
    }
}

