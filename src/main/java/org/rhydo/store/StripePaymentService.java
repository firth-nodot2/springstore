package org.rhydo.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Stripping " + amount + " payment");
    }
}
