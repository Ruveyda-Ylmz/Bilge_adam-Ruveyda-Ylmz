package week05.stream.question;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static   Scanner scanner = new Scanner(System.in);

    public static Main main = new Main();
    public static List<Students> studentsList = new ArrayList<>();
    public static  Students students = new Students();


    public static void main(String[] args) {

        main.menu();

    }

    public void menu(){ //----------------------------------------------------------------------
        System.out.println("Ogrenci Sistemine Hoşgeldiniz."+"\n+" +
                "Lütfen yapmak istediğiniz işlemi sırası ile seçiniz!"+"\n"+
                "1. Ogrenci ekleme "+"\n"+
                "2. Ogrenci listesindeki tüm öğrencilerin not ortalaması"+"\n"+
                "3. notu 50 den düşük olan öğrencilerin listesi"+"\n"+
                "4. Ogrenci listesini görüntüle(adı,notu)");

        int giris = scanner.nextInt();
        switch (giris){
            case 1:
                System.out.println("Lütfen öğrenci sayısı giriniz: ");
                int ogr_sayi = scanner.nextInt();

                if (ogr_sayi >= 1){
                    main.ogr_sayi_uret(ogr_sayi);
                }else {
                    System.out.println("Geçersiz değer girildiz!");
                }
                menu();
                break;
            case 2: // not_ortalama(); //hatalı,düzeltilicek
                    menu();
                break;
            case 3: // dusuk_not(); //henüz yapılmadı yapılacak
                 menu();
                break;
            case 4:
                main.ogr_listele();
                    menu();
                    break;
            default:
                System.out.println("Geçersiz tuşlama!"); break;
        }
    }


    public int ogr_sayi_uret(int ogr_sayi){ //----------------------------------------------------
        Random random = new Random();
        String name,surname;
        int grade;

        for (int i=0 ; i<ogr_sayi;i++){

            System.out.println("öğrenci adı giriniz : ");
             name = scanner.next();

            System.out.println("öğrenci soyadı giriniz : ");
            surname = scanner.next();

//          System.out.println("öğrenci notu giriniz : ");
            grade = random.nextInt(0,100);

            students.setName(name);
            students.setSurname(surname);
            students.setGrade(grade);
            boolean kayit = studentsList.add(students);
        }
        return ogr_sayi;
    }

    public void not_ortalama(){ //-------------------------------------------------------------
        for (Students students : studentsList){
           int i=0;
           int b_deger = students.getGrade(); //başlangıç deger
        // int s_deger = ; //son değer

            //HATALI DÜZELTİLECEK
//           IntStream.iterate(students.getGrade(), toplam -> toplam + students.getGrade(i))
//                   .limit(studentsList.size())
//                   .forEach(System.out::println);
       }
    }

    public void dusuk_not(){ //----------------------------------------------------------------
        System.out.println("düşük not listesi: "); //yapılmadı, yapılacak
    }

    public void ogr_listele(){ //---------------------------------------------------------------
        for (Students students : studentsList){
            System.out.println( "adı : " + students.getName() + "\n" +
                                "puan : " +  students.getGrade()   + "\n");



        }
    }




}
