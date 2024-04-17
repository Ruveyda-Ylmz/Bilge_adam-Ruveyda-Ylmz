package week05.exception.trywithresources.outocloseable;

import java.io.IOException;

public class Computer implements  AutoCloseable{

    public  void run(){
        System.out.println("computer is running...");
    }
    @Override
    public void close() throws IOException {

    }
}
