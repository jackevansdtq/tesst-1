/*Bài 1: Java API có m?t l?p GregorianCalWiki 
 *n?m trong gói java.util du?c dùng d? l?y nam, 
 *tháng và ngày c?a m?t ngày c? th?. 
 *Hàm kh?i t?o không tham s? xây d?ng m?t th? hi?n cho ngày hi?n t?i, 
 *và các phuong th?c 
 *get(GregorianCalendar.YEAR), 
 *get(GregorianCalendar.MONTH), và 
 *get(GregorianCalendar.DAY_OF_MONTH) 
 *tr? v? nam, tháng ngày l?n lu?t. 
 *Vi?t m?t chuong trình th?c hi?n 2 nhi?m v? sau:
 *1. Hi?n th? ngày tháng nam hi?n t?i.
 *2. L?p GregorianCalendar  
 *		có phuong th?c setTimeInMillis(long), 
 *		có th? du?c dùng d? thi?t l?p th?i gian c? th? dã trôi qua t? ngày 1/1/1970. 
 *		Cài d?t giá tr? 1234567898765L cho phuong th?c trên 
 *		và hi?n th? ngày tháng nam t? giá tr? dó.
*/

import java.util.GregorianCalendar;

public class Tuan02_Bai01 {
	/** Main method */
	public static void main(String[] args) {
		String months[] = {
			"Jan", "Feb", "Mar", "Apr",
      		"May", "Jun", "Jul", "Aug",
      		"Sep", "Oct", "Nov", "Dec"};
		// Tao doi tuong GregorianCalendar
		GregorianCalendar calender = new GregorianCalendar();

		// Hien thi ngay thang nam hien tai theo dinh dang Thang/Ngay/Nam
		System.out.print("\nCurrent year, month, and day in format Mth/Day/Year: ");
		System.out.println(months[calender.get(calender.MONTH)] + "/" +
			calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));

		// Cai dat thoi gian troi qua tu 1/1/1970 to 1234567898765 giay.
		calender.setTimeInMillis(1234567898765L);

		// Hien thi ngay thang nam luc do
		System.out.print("\nElapsed time since January 1, 1970 set to " +
			"1234567898765L in format Mth/Day/Year: ");
		System.out.println(months[calender.get(calender.MONTH)] + "/" +
			calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
	}
}