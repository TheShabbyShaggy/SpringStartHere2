package com.ely.SpringStartHere.controller;

import com.ely.SpringStartHere.exception.NotEnoughMoneyException;
import com.ely.SpringStartHere.model.ErrorDetails;
import com.ely.SpringStartHere.model.PaymentDetails;
import com.ely.SpringStartHere.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment() {
            PaymentDetails paymentDetails = paymentService.processPayment();
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
    }
}
