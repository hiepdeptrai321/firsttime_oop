package Bai2_kethuadahinh;

import java.time.LocalDate;

public class StudentBook extends Book {
	private String status;
	public StudentBook(String bookcode, LocalDate assigndate, int quantity, String nxb,double price) {
		super(bookcode, assigndate, quantity, nxb,price);
		setStatus();
		calcTotalPrice();
	}
	public void setStatus() {
		LocalDate t= LocalDate.of(2021,12,02);
		if(this.getAssignDate().isBefore(t)) this.status="cũ";
		else this.status="mới";
	}
	public void calcTotalPrice() {
		if(status == "mới") this.totalPrice=this.price*this.quantity;
		else this.totalPrice=this.price*this.quantity*0.5;
	}
	
}
