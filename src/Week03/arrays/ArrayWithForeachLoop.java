package Week03.arrays;

public class ArrayWithForeachLoop {
    public static void main(String[] args) {

        int[] age ={12,5,14,13};

        for (int i:age){
            System.out.println((i)); // 12 5 14 13
            System.out.println((i+1)+"\n"); //12+1 5+1 14+1 13+1
        }
    }
}
