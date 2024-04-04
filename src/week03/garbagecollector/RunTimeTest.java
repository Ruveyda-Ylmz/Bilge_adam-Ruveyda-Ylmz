package week03.garbagecollector;

import java.util.Date;

    public class RunTimeTest {
        public static void main(String[] args) {

            Runtime runtime = Runtime.getRuntime();//system method
            System.out.println("Total Memory : " + runtime.totalMemory()); //system method(dolu olan toplam memory)
            System.out.println("Free Memory : " + runtime.freeMemory()); //System method(boş hafıza)

            Date d = null; //tarih
            for (int i = 0; i < 10000000; i++) {
                d = new Date();
                d = null;
            }

            System.out.println("After Free Memory : " + runtime.freeMemory());

            //temizlik
            System.gc();

            System.out.println("After GC Memory : " + runtime.freeMemory());
        }
    }
