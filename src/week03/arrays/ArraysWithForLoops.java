package week03.arrays;

public class ArraysWithForLoops {
    public static void main(String[] args) {

        int[] age = {12,4,5,8,5,6,4,8,1,2,3,6,5,48,7,9,65,9,7,8,5,2,1,8,8,5,9,4,8,4,9,6,6,};

        for (int i=0; i<age.length;i++){
            System.out.println(age[i]);
        }
        //.ArrayIndexOutOfBoundsException ->array taşma hatası
    }
}
