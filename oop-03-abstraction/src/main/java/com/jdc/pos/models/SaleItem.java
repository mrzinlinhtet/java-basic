package com.jdc.pos.models;

public record SaleItem(
		Product product,
		int count) {
	
	public int total() {
		return product.price() * count;
 	}

}
