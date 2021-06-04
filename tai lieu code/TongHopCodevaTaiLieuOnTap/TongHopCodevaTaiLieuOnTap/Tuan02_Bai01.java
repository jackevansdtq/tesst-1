/*B�i 1: Java API c� m?t l?p GregorianCalWiki 
 *n?m trong g�i java.util du?c d�ng d? l?y nam, 
 *th�ng v� ng�y c?a m?t ng�y c? th?. 
 *H�m kh?i t?o kh�ng tham s? x�y d?ng m?t th? hi?n cho ng�y hi?n t?i, 
 *v� c�c phuong th?c 
 *get(GregorianCalendar.YEAR), 
 *get(GregorianCalendar.MONTH), v� 
 *get(GregorianCalendar.DAY_OF_MONTH) 
 *tr? v? nam, th�ng ng�y l?n lu?t. 
 *Vi?t m?t chuong tr�nh th?c hi?n 2 nhi?m v? sau:
 *1. Hi?n th? ng�y th�ng nam hi?n t?i.
 *2. L?p GregorianCalendar  
 *		c� phuong th?c setTimeInMillis(long), 
 *		c� th? du?c d�ng d? thi?t l?p th?i gian c? th? d� tr�i qua t? ng�y 1/1/1970. 
 *		C�i d?t gi� tr? 1234567898765L cho phuong th?c tr�n 
 *		v� hi?n th? ng�y th�ng nam t? gi� tr? d�.
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