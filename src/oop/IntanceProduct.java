package oop;

public class IntanceProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product test = new Product();
		Product p1 = test.nhapThongTin("a", 200, 0.1);
		test.xuatThongTin(p1);
		System.out.println("Giá sản phẩm: " + test.getTaxPrice(p1));

		Product p2 = new Product("b", 300, 0.1);
		p2.xuatThongTin(p2);
		System.out.println("Giá sản phẩm: " + p2.getTaxPrice(p2));
	}

}
