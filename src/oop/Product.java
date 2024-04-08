package oop;

public class Product {
	private String name;
	private double price;
	private double tax;

	public Product nhapThongTin(String name, double price, double tax) {
		Product pr = new Product(name, price, tax);
		return pr;
	}

	public void xuatThongTin(Product pr) {
		System.out.println("Tên sản phẩm: " + pr.getName() + ", giá sản phẩm: " + pr.getPrice() + ", thuế sản phẩm: "
				+ pr.getTax());
	}

	public double getTaxPrice(Product pr) {
		return pr.getPrice() * pr.getTax();
	}

	public Product() {

	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
