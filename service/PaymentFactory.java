
package service;

public class PaymentFactory {

    public static Payment getPaymentMethod(int choice) {
        if (choice == 1) return new UpiPayment();
        else return new CardPayment();
    }
}