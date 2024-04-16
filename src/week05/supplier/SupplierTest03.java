package week05.supplier;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.function.Supplier;

//Suplier ile LocalDate kullanımı
public class SupplierTest03 {
    public static void main(String[] args) {

        //java da tarih formatları araştırma konusu
        LocalDate date = LocalDate.now(); //YYYY/MM/DD
        System.out.println(date);
        Date date1 = new Date();
        LocalDate date2  = LocalDate.ofEpochDay(0); //tarih sistemi 1970 den beri var o yüzden miladı 1970.01.01 kanul eder
        System.out.println(date2);

        System.out.println(System.currentTimeMillis()); //1970den beri geçen mili saniye

        //kanıtı
         long millis = 1713255070765l;
         long second =  1713255070765l/1000l;
         long minute = second/60;
         long hour = minute /60;
         long day = hour / 24;
         LocalDate date3 = LocalDate.ofEpochDay(day);
      //  System.out.println(date3);

        System.out.println("----------------------------");

        //tarih ve zaman yöntem 1
        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());

        //tarih ve zaman yöntem 2
        Supplier<LocalDateTime> supplier02 = LocalDateTime::now;
        LocalDateTime localDateTime =supplier02.get();
        System.out.println(localDateTime);

        //formatlama
        Supplier<String> supplier03 = () -> dtf.format(LocalDateTime.now());
        String localDateTimeFormatter = supplier03.get();
        System.out.println(localDateTimeFormatter);
    }

    private static final DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd-MM-yyyy");



}
