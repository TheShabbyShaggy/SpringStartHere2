package com.ely.SpringStartHere.service;

import com.ely.SpringStartHere.exception.NotEnoughMoneyException;
import com.ely.SpringStartHere.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
