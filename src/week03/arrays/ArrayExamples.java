package week03.arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        int[] numbers = new int[30];
        String[] arays = new String[100];
        double[] darrays = new double[18];
        long[] larray = new long[3];

        larray[0]=10;
        larray[1]=15;
        larray[2]=20;

        //farkli tanimlama
        double[] data;
        data = new double[18];

        long[] larray2 = {10,15,20};

        System.out.println("birinci elelman: "+ larray[0]+"\n"+
                           "ikinci array: "+ larray[1]+"\n"+
                           "üçüncü array: "+ larray2[2]);

        long[] larray3 = {10,20,30};

        System.out.println(larray3);

        System.out.println(larray);
    }
}
