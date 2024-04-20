package week05.stream.question;

import java.util.*;
import java.util.stream.Collectors;

public class Islemler {

    public static Scanner scanner = new Scanner(System.in);
    public static List<Students> studentsList = new ArrayList<>();

    public  void menu(){ //----------------------------------------------------------------------
        System.out.println(
                "Lütfen yapmak istediğiniz işlemi sırası ile seçiniz!"+"\n"+
                        "1. Ogrenci ekleme. "+"\n"+
                        "2. Ogrenci listesindeki tüm öğrencilerin not ortalaması."+"\n"+
                        "3. Notu 50 den düşük olan öğrencilerin listesi."+"\n"+
                        "4. Ogrenci listesini görüntüle(adı,notu)"+"\n"+
                        "5. ÇIKIŞ...");

        int giris = scanner.nextInt();
        switch (giris){
            case 1:
                System.out.println("Lütfen öğrenci sayısı giriniz! : ");
                int ogr_sayi = scanner.nextInt();

                if (ogr_sayi >= 1){
                    ogr_sayi_uret(ogr_sayi);
                }else {
                    System.out.println("Geçersiz değer girildiz!");
                }
                menu();
                break;
            case 2: not_ortalama();
                menu();
                break;
            case 3:  dusuk_not(); //hatalı
                menu();
                break;
            case 4:
                ogr_listele();
                menu();
                break;
            case 5 :
                System.out.println("Çıkış yapıldı.");
                break;
            default:
                System.out.println("Geçersiz tuşlama!");
                break;
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
            grade = random.nextInt(0,101);

            Students students = new Students();
            students.setName(name);
            students.setSurname(surname);
            students.setGrade(grade);
            studentsList.add(students);
        }
        return ogr_sayi;
    }

    public void not_ortalama(){ //-------------------------------------------------------------
        int ortalama =   studentsList.stream()
                .map(students -> students.getGrade())
                .reduce((a,b) -> a+b).get()
                .intValue()/studentsList.size();
         System.out.println("Öğrencilerin not ortalaması : " + ortalama + "\n");
    }

    public void dusuk_not(){ //----------------------------------------------------------------
//        for (Students students : studentsList){
//            int not ;
//            Stream.of( not = students.getGrade())
//                    .filter(e -> e.intValue()>50 )
//                    .forEach(studentsList.get());
//        }

        //studentsList.stream().filter(x -> x.getGrade()> 50).forEach(System.out::println);

//        List<Students> ogr_d_not = studentsList.stream()
//                .filter(x -> x.getGrade()<50)
//                .collect(Collectors.toList());
//
//        studentsList.forEach(System.out::println);

        Map<String,Integer> yeni_met = new HashMap<>();
        yeni_met = studentsList.stream().collect(Collectors.toMap(k -> k.getName(),Students::getGrade));

        yeni_met.entrySet()
                .forEach(entrt -> System.out.println(
                        "ogr_ad :" + entrt.getKey()+ "\n"+
                        "ogr_not :"+ entrt.getValue()+"\n"
                ));
    }

    public void ogr_listele(){ //---------------------------------------------------------------
        for (Students students : studentsList){
            System.out.println( "adı : " + students.getName() + "\n" +
                    "soyadı: " + students.getSurname() + "\n" +
                    "puan : " +  students.getGrade()   + "\n");
        }
    }

}
