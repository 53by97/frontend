package com.dev.frontend.intg.utils;

import java.lang.reflect.Type;
import java.util.List;

import com.dev.frontend.intg.models.Customer;
import com.dev.frontend.intg.models.Product;
import com.dev.frontend.intg.models.SalesOrder;
import com.google.gson.reflect.TypeToken;

public class IntgUtil {

	public static Type getClassType(int objectType) {
		Type type = null;

		switch (objectType) {
		case 1:
			type = new TypeToken<Product>() {
			}.getType();
			break;
		case 2:
			type = new TypeToken<Customer>() {
			}.getType();
			break;
		case 3:
			type = new TypeToken<SalesOrder>() {
			}.getType();
			break;
		default:
			break;
		}
		return type;
	}

	public static Type getListOfClassType(int objectType) {
		Type type = null;

		switch (objectType) {
		case 1:
			type = new TypeToken<List<Product>>() {
			}.getType();
			break;
		case 2:
			type = new TypeToken<List<Customer>>() {
			}.getType();
			break;
		case 3:
			type = new TypeToken<List<SalesOrder>>() {
			}.getType();
			break;
		default:
			break;
		}
		return type;
	}
}
