package Bai2_kethuadahinh;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Book a= new StudentBook("KN1",LocalDate.of(2021,12,26),3,"NXB Quốc Gia",300);
		Book b= new StudentBook("KN2",LocalDate.of(2021,5,8),2,"NXB Quốc Gia",350);
		Book c= new StudentBook("KN3",LocalDate.of(2021,11,8),3,"NXB TPHCM",200);
		Book A= new ReferenceBook("XP1",LocalDate.of(2020,12,5),4,"NXB AG",500,50);
		Book B= new ReferenceBook("XP2",LocalDate.of(2022,10,5),1,"NXB TN",200,20);
		Book C= new ReferenceBook("XP3",LocalDate.of(2023,2,5),6,"NXB HN",160,10);
		
		BookList kn = new BookList();
//		BookList xp = new BookList();
		
		kn.addBook(a);
		kn.addBook(b);
		kn.addBook(c);
		
		kn.addBook(A);
		kn.addBook(B);
		kn.addBook(C);
		
		System.out.println(kn.toString());	
		System.out.println("Tổng giá: "+kn.sumPrice());
		System.out.println("Trung bình giá: "+kn.avgPrice());
		
		System.out.println(kn.outputNXB("NXB AG"));
		
		

	}

}
