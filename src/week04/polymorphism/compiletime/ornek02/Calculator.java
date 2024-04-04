package week04.polymorphism.compiletime.ornek02;

public class Calculator {
    //calculator class oluştur
   //içerisine sum ve overloaded methodu oluştur
   //calculator class ın sum methpdunu başka class dan main den çağır


   int sum(int say1, int say2) {
    return say1+say2;
   }

   double sum(double say1, double say2) {
      return say1+say2;
   }


}
