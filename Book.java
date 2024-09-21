package Bai2_kethuadahinh;

import java.time.LocalDate;

public class Book {
	private String bookcode;
	private LocalDate assigndate;
	protected int quantity;
	private String nxb;
	protected double price;
	protected double totalPrice;
	public Book(String bookcode,LocalDate assigndate,int quantity,String nxb,double price) {
		setBookCode(bookcode);
		setAssignDate(assigndate);
		setQuantity(quantity);
		setNXB(nxb);
		setPrice(price);
	}
	public void setBookCode(String bookcode) {
		this.bookcode=bookcode;
	}
	public void setAssignDate(LocalDate assigndate) {
		this.assigndate=assigndate;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public void setNXB(String nxb) {
		this.nxb=nxb;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getBookCode() {
		return this.bookcode;
	}
	public LocalDate getAssignDate() {
		return this.assigndate;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public String getNXB() {
		return this.nxb;
	}
	public double getPrice() {
		return this.price;
	}
}
