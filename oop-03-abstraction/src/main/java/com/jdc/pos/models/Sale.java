package com.jdc.pos.models;

import java.time.LocalDateTime;

public record Sale (
		int id,
		LocalDateTime saleAt,
		SaleItem[] items) {
	
	public int totalCount() {
		
		int total = 0;
		
		for(var item : items) {
			total += item.count();
		}
		return total;
	}

	public int totalAmount() {
		
		int total = 0;
		
		for(var item : items) {
			total += item.total();
		}
		return total;
	}
}
