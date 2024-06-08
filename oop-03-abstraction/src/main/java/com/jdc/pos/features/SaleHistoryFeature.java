package com.jdc.pos.features;

import com.jdc.console.app.AbstractFeature;
import com.jdc.pos.models.Sale;
import com.jdc.pos.models.SaleModel;

public class SaleHistoryFeature extends AbstractFeature {

	private SaleModel saleModel;

	public SaleHistoryFeature(int id, SaleModel saleModel) {
		super(id, "Sale History");
		this.saleModel = saleModel;
	}

	@Override
	public void doBusiness() {
		System.out.println("Sale History");

		Sale[] sales = saleModel.getHistory();

		for (var sale : sales) {
			System.out.println(sale);
		}
	}

}
