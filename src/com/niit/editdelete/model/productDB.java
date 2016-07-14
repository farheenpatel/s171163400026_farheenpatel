package com.niit.editdelete.model;

import java.util.ArrayList;
import java.util.List;

import com.niit.editdelete.model.product;

public class productDB {
	private List<product> prodlist = new ArrayList<product>();

	public productDB() {
		prodlist.add(new product("P1000", "Dining Table", "c0001", "Table", "Wooden", "Pepperfry", "20000.00"));
		prodlist.add(new product("P1001", "Dining chair", "c0003", "Component", "Wooden", "Pepperfry", "2300.00"));
		prodlist.add(new product("P1002", "Bookcase", "c0002", "Case", "Wooden", "Ikea", "13000.00"));
		prodlist.add(new product("P1003", "Cabinetry", "c0002", "Case", "Wooden", "Pepperfry", "10000.00"));
		prodlist.add(new product("P1004", "Drawer", "c0003", "Component", "Wooden", "Ikea", "1200.00"));
		prodlist.add(new product("P1005", "Nightstand", "c0001", "Table", "Wooden", "Pepperfry", "3000.00"));
		prodlist.add(new product("P1006", "Writing Table", "c0001", "Table", "Wooden", "Godrej", "12000.00"));
		prodlist.add(new product("P1007", "Television set", "c0001", "Table", "Wooden", "Ikea", "28000.00"));
	}

	public List<product> getall() {
		return prodlist;
	}

	public void remove(String prodid){
		for (int i=0;i<=prodlist.size();i++){
			if(prodlist.get(i).getProduct_id().equals(prodid)){
				prodlist.remove(i);
					
			}
		}
		
		
	}
	
	public boolean addprod(product prod){
		
		if(prodlist.add(prod)){
			return true;
		}
		else{
			return false;
		}
	}

}
