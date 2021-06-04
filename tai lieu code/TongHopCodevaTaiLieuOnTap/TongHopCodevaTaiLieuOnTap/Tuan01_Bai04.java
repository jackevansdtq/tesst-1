/*
Tuan 01 - Bai 04
*/
import java.util.Scanner;

public class Tuan01_Bai04 {
	public static void main(String[] args) {
		// Tao doi tuong Scanner
		Scanner input = new Scanner(System.in);

		// Yeu cau nguoi dung nhap vao so luong sinh vien
		System.out.print("Nhap so sinh vien: ");
		int numberOfStudents = input.nextInt();

		int score, 					// Khai bao bien luu diem sinh vien		
			 highest = 0, 			// Bien luu diem cao nhat
			 secondHigest = 0;	// Diem cao nhi`
		String name = "", 		// Bien luu ten sinh vien
				 student1 = "", 	// Bien luu ten sinh vien cao diem nhat
				 student2 = "";	// ten sinh vien cao diem nhi`
		
		// Yeu cau nguoi dung nhap vao ten va diem cua sinh vien
		System.out.println("Enter each students' name and score:");
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print(
				"Sinh vien: " + (i + 1) + "\n   ten la: ");
			name = input.next();
			System.out.print("   Co diem: ");
			score = input.nextInt();

			if (i == 0) {
				// Gan diem va ten sinh vien vua nhap vao diem cao nhat va ten sinh vien co diem cao nhat
				highest = score;
				student1 = name;
			}
			else if (i == 1 && score > highest) {
				// Truong hop nhap sinh vien thu 2 cao diem hon sinh vien thu nhat
				secondHigest = highest;
				highest = score;
				student2 = student1;
				student1 = name;
			}
			else if (i == 1) {
				// Truong hop thap diem hon
				secondHigest = score;
				student2 = name;
			}		
			else if (i > 1 && score > highest && score > secondHigest) {
				// Truong hop nhap sinh vien thu 3 tro di co diem cao hon 2 sinh vien kia
				secondHigest = highest;
				student2 = student1;
				highest = score;
				student1 = name;
			}
			else if (i > 1 && score > secondHigest) {
				// Truong hop nhap sinh vien thu 3 tro di co diem cao hon sinh vien cao diem thu 2 
				student2 = name;
				secondHigest = score;
			}
		}

		// Hien thi sinh vien diem so cao nhat va cao thu 2
		System.out.println(
			"Sinh vien cao diem nhat la: " + student1 + " voi so diem: "+highest+ 
			"\nSinh vien cao diem thu 2 la: " + student2 +" voi so diem: "+ secondHigest);
	}
}