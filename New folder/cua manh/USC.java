
 
import java.util.Scanner;

import jdk.internal.org.jline.utils.InputStreamReader;

import java.io.BufferedReader;

//import jdk.tools.jlink.resources.plugins;

//import jdk.internal.agent.resources.agent;

//import jdk.javadoc.internal.doclets.formats.html.resources.standard;
import java.util.*;
public class USC {

    private static Scanner scanner = new Scanner(System.in);
    /**
     * main
     * 
     * 
     */
    public static void main(String[] args) {

    String name, address, email;
    float  height, toan, nguvan, tinhoc, vatly;
    int   age, point, read, sdt, mssv;
   // name = "hello";
    height = 166  ;
    age = 50;
    point = 20 ;
    read = 100;
    address = " Quận Hoàn Kiếm, Hà Nội";
    email = " khongmanh11@gmail.com";
    sdt = 0332773513; 
    mssv = 1911066546;
             
        public nhap() throw Exception {
            NhapThongTin();
            
        }
        public void NhapThongTin() throw Exception {
            system.out.print("so luong mon hoc");
            BufferedReader_nhap = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(_nhap.readLine());
            BangDiem=new Diem[n];
            for (int; i<n; i++){
                BangDiem[i]=new Diem[];
                BangDiem[i].nhapDiem();
                System.out.println("");
            }       
        }
        public void XuatThongTin() {
            System.out.println(" STT        MON        DIEM HK1       DIEM HK2      DIEM TB");
        
                    for (int i=0; i< BangDiem.length(); i++) {
                        BangDiem[i].xuatDiem(i+1);
                    }
                    System.out.printf("Diem Trung Binh : ", DiemTBCaNam);
                }
        Scanner love = new Scanner(System.in);
        Scanner hihi = new Scanner(System.in);
        System.out.print("Tên sinh viên là:" );
        name = hihi.nextLine();
        //System.out.print(" mssv sinh viên là:" );
       // mssv = love.nextInt();
         System.out.println("Tổng điểm các môn của sinh viên là:");
         System.out.println("Chiều cao sinh viên là:"+ height);
         System.out.println("Cân nặng sinh viên là:" + age);
         System.out.println("điểm số sinh viên là:" + point);
         System.out.println("read sinh viên là:" + read);
         System.out.println("Địa chỉ sinh viên"+address);
        System.out.println("địa chỉ email sinh viên"+ email);
        System.out.println("số điện thoại sinh viên"+ sdt);
        System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));
        // tính BSCNN của a và b
        System.out.println("BSCNN của " + a + " và " + b
                + " là: " + BSCNN(a, b));
        System.out.println("Tổng " + a + " và " + b
                + " là:  " +  (a+b));
        System.out.println("số lơn nhất " + a + " và " + b
                + " là:  " + Max (a,b));
        System.out.println("số nhỏ nhất" + a + " và " + b
                + " là:  " +  Min (a,b));
       
        
    }
    
      
    /**
     * Tìm ước số chung lớn nhất (USCLN)
     * 
     * @param a: số nguyên dương
     * @param b: số nguyên dương
     * @return USCLN của a và b
     */
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
      
    /**
     * Tìm bội số chung nhỏ nhất (BSCNN)
     * 
     * @param a: số nguyên dương
     * @param b: số nguyên dương
     * @return BSCNN của a và b
     */
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
        public static int sun (int a, int b) {
        return (a+b);
    }
    public static int Max (int a, int b) {
        return (Math.max(a,b));
    }
   
    public static int Min (int a, int b) {
        return (Math.min(a,b));
    }
   

}
