/*
 Bai 01 - Tuan 01
*/
import java.util.Scanner;

public class Tuan01_Bai01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		// Tao moi doi tuong Scanner

		// Thong bao nguoi dung nhap mot so nguyen tu 0 - 1000.
		System.out.print("Nhap mot so nguyen giua 0 va 1000: ");
		int number = input.nextInt();
		
		//Xet dieu kien neu de bai yeu cau
		
		// Tinh tong cac chu so trong so nguyen nhap vao.
		int lessThan10 = number % 10;		// Lay ra chu so hang don vi
		number /= 10;							// Bo di chu so hang don vi trong so nguyen ban dau
		int tens = number % 10;				// lay ra chu so hang chuc, bay gio la hang don vi cua so hien tai
		number /= 10;							// Bo di so vua lay
		int hundreds = number % 10;		// lay chu so hang tram cua so nguyen ban dau
		number /= 10;							// Bo di so vua lay, buoc danh cho viec xet dieu kien doi voi so lon hon 3 chu so
		int sum = hundreds + tens + lessThan10;	//Tinh tong

		// In ket qua
		System.out.println("Tong cac chu so trong so nguyen ban dau " + sum);
	}
}