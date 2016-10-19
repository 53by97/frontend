package com.dev.frontend.services;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.dev.frontend.intg.client.IntgClient;
import com.dev.frontend.intg.constants.IntgConstants;
import com.dev.frontend.intg.models.Customer;
import com.dev.frontend.intg.models.Product;
import com.dev.frontend.intg.models.SalesOrder;
import com.dev.frontend.intg.utils.IntgUtil;
import com.dev.frontend.panels.ComboBoxItem;
import com.google.gson.Gson;

public class Services {
	public static final int TYPE_PRODUCT = 1;
	public static final int TYPE_CUSTOMER = 2;
	public static final int TYPE_SALESORDER = 3;

	private static Gson gson = new Gson();

	public static Object save(Object object, int objectType) {
		// TODO by the candidate
		/*
		 * This method is called eventually after you click save on any edit
		 * screen object parameter is the return object from calling method
		 * guiToObject on edit screen and the type is identifier of the object
		 * type and may be TYPE_PRODUCT , TYPE_CUSTOMER or TYPE_SALESORDER
		 */

		String obj = IntgClient.post(IntgConstants.HOST
				+ "/backend/javase-trial/restapi/save/record/" + objectType,
				gson.toJson(object));
		Type type = IntgUtil.getClassType(objectType);

		return gson.fromJson(obj, type);
	}

	public static Object readRecordByCode(String code, int objectType) {
		// TODO by the candidate
		/*
		 * This method is called when you select record in list view of any
		 * entity and also called after you save a record to re-bind the record
		 * again the code parameter is the first column of the row you have
		 * selected and the type is identifier of the object type and may be
		 * TYPE_PRODUCT , TYPE_CUSTOMER or TYPE_SALESORDER
		 */

		String obj = IntgClient.get(IntgConstants.HOST
				+ "/backend/javase-trial/restapi/get/record?type=" + objectType
				+ "&code=" + code);
		Type type = IntgUtil.getClassType(objectType);

		return gson.fromJson(obj, type);
	}

	public static boolean deleteRecordByCode(String code, int objectType) {
		// TODO by the candidate
		/*
		 * This method is called when you click delete button on an edit view
		 * the code parameter is the code of (Customer - PRoduct ) or order
		 * number of Sales Order and the type is identifier of the object type
		 * and may be TYPE_PRODUCT , TYPE_CUSTOMER or TYPE_SALESORDER
		 */

		String obj = IntgClient.delete(IntgConstants.HOST
				+ "/backend/javase-trial/restapi/delete/record?type="
				+ objectType + "&code=" + code);

		return Boolean.valueOf(gson.fromJson(obj, String.class));
	}

	public static List<Object> listCurrentRecords(int objectType) {

		// TODO by the candidate
		/*
		 * This method is called when you open any list screen and should return
		 * all records of the specified type
		 */

		String obj = IntgClient.get(IntgConstants.HOST
				+ "/backend/javase-trial/restapi/get/records?type="
				+ objectType);
		Type type = IntgUtil.getListOfClassType(objectType);

		return gson.fromJson(obj, type);
	}

	public static List<ComboBoxItem> listCurrentRecordRefernces(int objectType) {
		// TODO by the candidate
		/*
		 * This method is called when a Combo Box need to be initialized and
		 * should return list of ComboBoxItem which contains code and
		 * description/name for all records of specified type
		 */
		List<ComboBoxItem> returnList = new ArrayList<ComboBoxItem>();
		List<Object> list = listCurrentRecords(objectType);

		switch (objectType) {
		case 1:
			Product product;
			for (Object object : list) {
				product = (Product) object;
				returnList.add(new ComboBoxItem(String.valueOf(product
						.getProdId()), product.getProdDesc()));
			}
			break;
		case 2:
			Customer customer;
			for (Object object : list) {
				customer = (Customer) object;
				returnList.add(new ComboBoxItem(String.valueOf(customer
						.getCustId()), customer.getCustName()));
			}
			break;
		case 3:
			SalesOrder order;
			for (Object object : list) {
				order = (SalesOrder) object;
				returnList.add(new ComboBoxItem(String.valueOf(order
						.getOrderId()), order.getCustomer().getCustName()));
			}
			break;
		default:
			break;
		}

		return returnList;
	}

	public static double getProductPrice(String productCode) {
		// TODO by the candidate
		/*
		 * This method is used to get unit price of product with the code passed
		 * as a parameter
		 */

		Product product = (Product) readRecordByCode(productCode, TYPE_PRODUCT);
		return product.getPrice().doubleValue();
	}
}
