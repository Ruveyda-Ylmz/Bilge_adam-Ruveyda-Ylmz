package week04.entitrrelations.aggregation;

public class AggregationEmployee {

    private final int city;
    private  final String name;
    private final Address address;

    public AggregationEmployee(int city, String name, Address address) {
        this.city = city;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() { //alt+insert (toString)
        return "AggregationEmployee{" +
                "city=" + city +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }


}
