package week04.entitrrelations.aggregation;

public class AgregationTest {
    public static void main(String[] args) {

//        Address address = new Address("2037","ankara");
//        System.out.println(address); //Override olmadan çalıştırıldığında adres uzantısını verir
        AggregationEmployee employee = new AggregationEmployee(  //employee (kapsayıcıdır)conteiner
                1,
                "ruveyda",
                new Address("2037","malatya")); //adres burda (parçadır) companent

        System.out.println(employee);


    }
}
