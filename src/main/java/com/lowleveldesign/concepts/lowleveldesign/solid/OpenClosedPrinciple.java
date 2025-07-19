package com.lowleveldesign.concepts.lowleveldesign.solid;

public class OpenClosedPrinciple {
    /*
    * How not to write code
    * */

    public class PaymentService {
        public void processPayment(String method, double amount) {
            if (method.equals("CARD")) {
                // Logic for credit card payment
            } else if (method.equals("PAYPAL")) {
                // Logic for PayPal payment
            }
            // Adding another method requires editing this method
        }
    }


    /*
    * How to write OCP
    * */

    public interface PaymentMethod {
        void pay(double amount);
    }

    public class CardPayment implements PaymentMethod {
        public void pay(double amount) {
            // Card payment logic
        }
    }

    public class PayPalPayment implements PaymentMethod {
        public void pay(double amount) {
            // PayPal payment logic
        }
    }

    public class PaymentServiceOCP {
        public void processPayment(PaymentMethod paymentMethod, double amount) {
            paymentMethod.pay(amount);
        }
    }



}
