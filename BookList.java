package Bai2_kethuadahinh;

public class BookList {
	private Book[] booklist;
	private int count;
	public BookList() {
		booklist = new Book[20];
		count=0;
	}
	public void addBook(Book a) {
		this.booklist[count]=a;
		count++;
	}
	public double sumPrice() {
		double sum=0;
		for(int i=0;i<count;i++) {
			sum+=booklist[i].totalPrice;
		}
		return sum;
	}
	public double avgPrice() {
		return this.sumPrice()/(count+1);
	}
	public String outputNXB(String nxb) {
		BookList x= new BookList();
		for(int i=0;i<count;i++) {
			if(this.booklist[i].getNXB()==nxb) {
				x.addBook(this.booklist[i]);
			}
		}
		return x.toString();
	}
	public String toString() {
		String s="";
		s+=s+=" Mã sách\t| Ngày nhập\t| Đơn giá\t| Số lượng\t| Nhà xuất bản\t\t\t\n";
		for(int i=0;i<count;i++) {
			s+=String.format("%5s%23s%14.3f%13d\t\t  %-10s\n",this.booklist[i].getBookCode(),booklist[i].getAssignDate(),booklist[i].price,booklist[i].quantity,booklist[i].getNXB());
		}
		return s;
	}

}
