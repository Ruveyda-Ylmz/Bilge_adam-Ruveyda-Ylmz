package week04.entitrrelations.composition;

import week04.entitrrelations.aggregation.Address;

public class CompositionEmployee {
    private final int id;
    private  final String name;
    private final Address address;


    //employee yi oluştrumak için ilk adım
    public CompositionEmployee(int id, String name, String street,String city) {
        this.id = id;
        this.name = name;
        this.address = new Address(street,city);
    }

    @Override
    public String toString() {
        return "CompositionEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }


    private static class Address { //adres sınıfı iç sınıf olara yazdık
        private final String street;
        private final String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }
}
