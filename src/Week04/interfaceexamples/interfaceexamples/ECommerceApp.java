package Week04.interfaceexamples.interfaceexamples;

public class ECommerceApp {

    public static void main(String[] args) {
        PaymentMethod creditPayment = new CreditCardPayment("123341234","1234","321");
        PaymentMethod payPalPayment = new PayPellPayment("mail@gmail.com");

        double totalPrice =100.50;
        creditPayment.processPayment(totalPrice);
        payPalPayment.processPayment(totalPrice);
    }
}
