/*
Tuan 01 - Bai 03
*/
import java.util.Scanner;

public class Tuan01_Bai03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Yeu cau nguoi dung nhap va thang va nam - xet dieu kien nhap neu de bai yeu cau
		System.out.print("Enter month: ");
		int month = input.nextInt();
		System.out.print("Enter year: ");
		int year = input.nextInt();
		
		//Tao bien dieu kien cho thang 2
		boolean leapYear = 
			(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			
		// Hien thi so ngay trong thang
		switch (month)
		{
			case 1: System.out.println(
					 "January " + year + " had 31 days"); break;
			case 2: System.out.println("February " + year + " had" +
					  ((leapYear) ? " 29 days" : " 28 days")); break;
			case 3: System.out.println(
					 "March " + year + " had 31 days"); break;
			case 4: System.out.println(
					 "April " + year + " had 30 days"); break;
			case 5: System.out.println(
					 "May " + year + " had 31 days"); break;
			case 6: System.out.println(
					 "June " + year + " had 30 days"); break;
			case 7: System.out.println(
					 "July " + year + " had 31 days"); break;
			case 8: System.out.println(
					 "August " + year + " had 31 days"); break;
			case 9: System.out.println(
					 "September " + year + " had 30 days"); break;
			case 10: System.out.println(
					 "October " + year + " had 31 days"); break;
			case 11: System.out.println(
					 "November " + year + " had 30 days"); break;
			case 12: System.out.println(
					 "December " + year + " had 31 days");
			default: //Day la noi xay dung cac truong hop khac
					break;
		}
	}
}