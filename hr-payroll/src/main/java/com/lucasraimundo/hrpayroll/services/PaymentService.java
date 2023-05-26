package com.lucasraimundo.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.lucasraimundo.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPyament(Long workerId, int days) {
		return new Payment("Bob", 200.00, days);
	}
}
