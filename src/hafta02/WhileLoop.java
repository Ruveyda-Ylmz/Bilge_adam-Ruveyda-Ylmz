package hafta02;

public class WhileLoop {
    public static void main(String[] args) {

        int star = 0, finish = 5;
        boolean exitStatus = false;
        while (true) {
            System.out.println("Start degeri : " + star + "\tFinish degeri : " + finish);
            star++;
            finish--;
            if (finish == 0) {
                break;
            }
        }
    }
}
