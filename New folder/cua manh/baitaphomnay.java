import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

//import jdk.javadoc.internal.doclets.toolkit.resources.doclets;
public class bai1 {

  



    public static void main(String []args) {
        Scanner sc = new Scanner (System.in);
        int mssv, Tuoi, NamSinh;
        String HoTen;
        float DiemTB;

        System.out.println("Hello I'm <Manh>.");
        System.out.println("I'm 20 yesrs old.");
        System.out.println("This is my java program.");
        System.out.print("hãy nhập mã số sinh viên của bạn: ");
        mssv = sc.nextInt();
        System.out.print("hãy nhập họ và tên của bạn: ");
        sc.nextLine();
        HoTen = sc.nextLine();
         System.out.print("hãy nhập tuổi của bạn: ");
        Tuoi = sc.nextInt();
        System.out.print("hãy nhập năm sinh của bạn: ");
        NamSinh = sc.nextInt();
        System.out.print("hãy nhập Diểm TB của bạn: ");
        DiemTB = sc.nextFloat();
        
        System.out.println("MÃ SỐ SINH VIÊN CỦA BẠN LÀ: " + mssv);
        System.out.println("HỌ VÀ TÊN CỦA BẠN LÀ: "+ HoTen);
        System.out.println("TUỔI CỦA BẠN LÀ: " + Tuoi);
        System.out.println("NĂM SINH CỦA BẠN LÀ: "+ NamSinh);
        System.out.println("ĐIỂM TRUNG BÌNH CỦA BẠN LÀ: "+ DiemTB);
        
        int a[], n=0;
       // Scanner scanner = new Scanner(System.in);
             
        do {
            System.out.print("Nhập vào số phần tử của mảng n: ");
            n = sc.nextInt();
        } while (n < 0);
             
        // khởi tạo và cấp phát bộ nhớ cho mảng
         a = new int[n];
             
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " +i+ ": ");
            a[i] = sc.nextInt();
        }
      
    }

    

    

        

        //System.out.println("hãy nhập mã số sinh viên của bạn: ");

}
