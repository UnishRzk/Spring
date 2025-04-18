package com.unish.PayemntServiceAOP;

import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl implements PaymentService{

    @Override
    public void makePayemnt() {
        System.out.println("Amount Debited");
        System.out.println("AMOUNT CREDITED");
    }
}
