package com.dev.frontend.panels.list;

import java.util.List;

import com.dev.frontend.intg.models.Customer;
import com.dev.frontend.services.Services;

public class CustomerDataModel extends ListDataModel {
	private static final long serialVersionUID = 7526529951747613655L;

	public CustomerDataModel() {
		super(new String[] { "Code", "Name", "Phone", "Current Credit" }, 0);
	}

	@Override
	public int getObjectType() {
		return Services.TYPE_CUSTOMER;
	}

	@Override
	public String[][] convertRecordsListToTableModel(List<Object> list) {
		// TODO by the candidate
		/*
		 * This method use list returned by Services.listCurrentRecords and
		 * should convert it to array of rows each row is another array of
		 * columns of the row
		 */

		int size = list.size();

		String[][] data = new String[size][4];

		Customer customer;
		for (int i = 0; i < size; i++) {
			customer = (Customer) list.get(i);
			data[i][0] = String.valueOf(customer.getCustId());
			data[i][1] = String.valueOf(customer.getCustName());
			data[i][2] = customer.getPrimaryContactNumber();
			data[i][3] = String.valueOf(customer.getCurrentCredit());
		}

		return data;
	}
}
