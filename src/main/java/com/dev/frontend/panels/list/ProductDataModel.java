package com.dev.frontend.panels.list;

import java.util.List;

import com.dev.frontend.intg.models.Product;
import com.dev.frontend.services.Services;


public class ProductDataModel extends ListDataModel
{
	private static final long serialVersionUID = 7526529951747614655L;

	public ProductDataModel() 
	{
		super(new String[]{"Code","Description","Price","Quantity"}, 0);
	}

	@Override
	public int getObjectType() {
		return Services.TYPE_PRODUCT;
	}

	@Override
	public String[][] convertRecordsListToTableModel(List<Object> list) 
	{
		//TODO by the candidate
		/*
		 * This method use list returned by Services.listCurrentRecords and should convert it to array of rows
		 * each row is another array of columns of the row
		 * 
		 */
		
		int size = list.size();

		String[][] data = new String[size][4];

		Product product;
		for (int i = 0; i < size; i++) {
			product = (Product) list.get(i);
			data[i][0] = String.valueOf(product.getProdId());
			data[i][1] = product.getProdDesc();
			data[i][2] = product.getPrice().toString();
			data[i][3] = String.valueOf(product.getAvailableQuantity());
		}

		return data;
	}
}
