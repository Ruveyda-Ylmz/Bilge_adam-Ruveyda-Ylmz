package week05.stream.question;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static   Scanner scanner = new Scanner(System.in);

    public static Main main = new Main();
    public static List<Students> ogrenciler = new ArrayList<>();


    public static void main(String[] args) {

        System.out.println("Lütfen öğrenci sayısı giriniz: ");

        int ogr_sayi = scanner.nextInt();
        main.ogr_sayi_uret(ogr_sayi);

        for (Students students : ogrenciler){
            System.out.println(students.getName()+ " " +
                    students.getSurname() + " " +
                    students.getGrade() + " ");
        }

    }

    public int ogr_sayi_uret(int ogr_sayi){

        Students studentss = new Students();

        Random random = new Random();

        String name,surname;
        int grade;

        for (int i=0 ; i<ogr_sayi;i++){

            System.out.println("öğrenci adı giriniz : ");
             name = scanner.next();

            System.out.println("öğrenci soyadı giriniz : ");
            surname = scanner.next();

//            System.out.println("öğrenci notu giriniz : ");
            grade = random.nextInt(0,100);

            studentss.setName(name);
            studentss.setSurname(surname);
            studentss.setGrade(grade);
        }
         ogrenciler.add(studentss);

        return ogr_sayi;
    }




}
