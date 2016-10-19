package com.dev.frontend.panels.list;

import java.util.List;

import com.dev.frontend.intg.models.Product;
import com.dev.frontend.intg.models.SalesOrder;
import com.dev.frontend.services.Services;


public class SalesOrderDataModel extends ListDataModel
{
	private static final long serialVersionUID = 7526529951747614655L;

	public SalesOrderDataModel() 
	{
		super(new String[]{"Order Number","Customer","Total Price"}, 0);
	}

	@Override
	public int getObjectType() {
		return Services.TYPE_SALESORDER;
	}

	@Override
	public String[][] convertRecordsListToTableModel(List<Object> list) 
	{
		//TODO by the candidate
		/*
		 * This method use list returned by Services.listCurrentRecords and should convert it to array of rows
		 * each row is another array of columns of the row
		 */
		
		int size = list.size();

		String[][] data = new String[size][3];

		SalesOrder order;
		for (int i = 0; i < size; i++) {
			order = (SalesOrder) list.get(i);
			data[i][0] = String.valueOf(order.getOrderId());
			data[i][1] = String.valueOf(order.getCustomer().getCustId());
			data[i][2] = order.getTotalPrice().toString();
		}

		return data;
	}
}
