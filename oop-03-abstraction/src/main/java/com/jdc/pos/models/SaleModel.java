package com.jdc.pos.models;

public interface SaleModel {

	Sale checkout(SaleItem[] items);

	Sale[] getHistory();

}
