package com.jdc.pos.models;

import java.time.LocalDateTime;
import java.util.Arrays;

public class SaleModelImpl implements SaleModel {
	
	private Sale [] sales = {};
 
	@Override
	public Sale checkout(SaleItem[] items) {
		var id = sales.length + 1;
		sales = Arrays.copyOf(sales, sales.length + 1);
		sales[id - 1] = new Sale(id, LocalDateTime.now(), items);
		return sales[id - 1];
	}

	@Override
	public Sale[] getHistory() {
		// TODO Auto-generated method stub
		return Arrays.copyOf(sales, sales.length);
	}

}
