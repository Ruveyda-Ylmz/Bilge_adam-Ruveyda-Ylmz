package Week04.abstracts.ornek02;

public class Rectangle extends Shape{

    private double width;
    private double height;

    Rectangle(double width,double height){ //değer atamak için yazdık
        this.width=width;
        this.height=height;
    }

    @Override //yada kızan (kırmızı yazan üst başlığa)tıkla ımplement methoda tıkla
    public double calculateArea() {
        return width*height;
    }

//    @Override
//    public double calculateArea(){ //Shape den kalıtım aldığımız sınıfın gövdesi
//        return 0.0;
//    }


//    @Override    //alt+insert -> implement methods
//    public double calculateArea() {
//        return 0;
//    }




}
