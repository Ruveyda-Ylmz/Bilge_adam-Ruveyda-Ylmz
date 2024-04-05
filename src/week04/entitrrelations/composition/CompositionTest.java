package week04.entitrrelations.composition;

public class CompositionTest {
    public static void main(String[] args) {
        //şuan adress ve employee birbirine bağlı haldedir
        CompositionEmployee compositionEmployee = new CompositionEmployee(
                                                                        1,
                                                                        "ruveyda",
                                                                        "2037",
                                                                        "malatya");
        System.out.println(compositionEmployee);

        //CompositionEmployee class ının çıktısı
        //CompositionEmployee{id=1, name='ruveyda', address=Address{street='2037', city='malatya'}}
    }
}
