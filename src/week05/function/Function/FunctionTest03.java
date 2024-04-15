package week05.function.Function;

import java.util.function.Function;

public class FunctionTest03 {

    /*encapsulation kurallarına uygun bir Employee sınıfı oluştur
    her bir Employee nin ismi ve yaşı olsun
    AllArgs constructor üret
    */
    public static void main(String[] args) {

        Function<Employee,String> employeeToStringName = e -> e.getIsim(); //değer employee ve karşılayan string
        Employee emp = new Employee("ruveyda",24);
        System.out.println(employeeToStringName.apply(emp));

    }







}
