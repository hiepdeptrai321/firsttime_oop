package Bai2_kethuadahinh;

import java.time.LocalDate;

public class ReferenceBook extends Book {
	private double thue;
	public ReferenceBook(String bookcode, LocalDate assigndate, int quantity, String nxb, double price,double thue) {
		super(bookcode, assigndate, quantity, nxb, price);
		setThue(thue);
		calcTotalPrice();
	}
	public void calcTotalPrice() {
		this.totalPrice=this.price*this.quantity+this.thue;
	}
	public void setThue(double thue) {
		this.thue=thue;
	}
	public double getThue() {
		return this.thue;
	}
}
