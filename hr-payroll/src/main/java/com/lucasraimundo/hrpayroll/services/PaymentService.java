package com.lucasraimundo.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasraimundo.hrpayroll.entities.Payment;
import com.lucasraimundo.hrpayroll.entities.Worker;
import com.lucasraimundo.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	

	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPyament(Long workerId, int days) {
		
		
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
