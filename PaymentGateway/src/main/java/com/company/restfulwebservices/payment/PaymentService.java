package com.company.restfulwebservices.payment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
	
	private static List<PaymentData> paymentData = new ArrayList<>();

	static {
		paymentData.add(new PaymentData(1, 1015967, 986532, 1000.0, "USD", "ICIC00609", new Date()));
		paymentData.add(new PaymentData(2, 1015968, 986533, 2000.0, "EUR", "ICIC00609", new Date()));
		paymentData.add(new PaymentData(3, 1015969, 986534, 3000.0, "GBP", "ICIC00609", new Date()));
	}

	public List<PaymentData> findAll() {
		return paymentData;
	}

	public PaymentData save(PaymentData data) {
		paymentData.add(data);
		return data;
	}

}
