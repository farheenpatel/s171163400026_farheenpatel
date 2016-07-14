package com.niit.editdelete.model;

public class product {
	private String product_id;
	private String product_name;
	private String category_id;
	private String product_category;
    private String product_discription;
    private String product_brand;
    private String price;
    
    public product(String product_id,String product_name,String category_id,String product_category,String product_discription,String product_brand,String price)
    {
    	this.product_id = product_id;
    	this.product_name = product_name;
    	this.category_id = category_id;
    	this.product_category = product_category;
    	this.product_discription = product_discription;
    	this.product_brand = product_brand;
    	this.price = price;
    }

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

	public String getProduct_discription() {
		return product_discription;
	}

	public void setProduct_discription(String product_discription) {
		this.product_discription = product_discription;
	}

	public String getProduct_brand() {
		return product_brand;
	}

	public void setProduct_brand(String product_brand) {
		this.product_brand = product_brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
    

}
