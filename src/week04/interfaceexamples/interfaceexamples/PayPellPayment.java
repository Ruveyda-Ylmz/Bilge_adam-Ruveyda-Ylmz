package week04.interfaceexamples.interfaceexamples;

public class PayPellPayment implements  PaymentMethod{

    private  String email;

    public PayPellPayment(String email){
        this.email=email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment processed for amount: " +amount);
    }
}
