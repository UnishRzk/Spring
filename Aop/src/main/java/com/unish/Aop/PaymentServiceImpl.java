package com.unish.Aop;

import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl implements PaymentService{

    @Override
    public void makePayment() {
        System.out.println("Amount Debited");
        System.out.println("AMOUNT CREDITED");
    }
}
