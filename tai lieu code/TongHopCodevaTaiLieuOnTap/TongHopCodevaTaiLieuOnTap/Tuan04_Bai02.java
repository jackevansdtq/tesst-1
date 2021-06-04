//Bai02: Xay dung lop DanhSachHangHoa 
                  //UML diagram                  
/********************************************
*               DanhSachHangHoa             *
*-------------------------------------------*
* varSoLuongHH: int                         *
* varDanhSachHH: HangHoa[]                  *
*-------------------------------------------*
* DanhSachHangHoa()                         *
* themHangHoa(HangHoa): void                *
* xuatHangHoaTheoLoai(String loai): void    *
*********************************************/
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class DanhSachHangHoa
{
	public int varSoLuongHH;
	private HangHoa[] varDanhSachHH;
	
	public DanhSachHangHoa()
	{
		varSoLuongHH = 0;
		varDanhSachHH = new HangHoa[]{};
	}
	
	public void themHangHoa(HangHoa h)
	{
		varDanhSachHH = Arrays.copyOf(varDanhSachHH, varDanhSachHH.length+1);
		varDanhSachHH[varSoLuongHH] = h;
		varSoLuongHH++;
		
	}
	
	//Trong bai nay, de xuat theo loai
	// minh chon phuong an
	//khi nhap ma hang
	//Minh se nhap ma bat dau bang DM cho dien may va TP cho thuc pham
	//khi xuat hang se kiem tra xem nguoi dung chon ma nao ma xuat theo ma do.
	// cac ban co the tim hiem phuong an khac.
	public void xuatHangHoaTheoLoai(int loai)
	{
		if(loai==0){
			for(int i = 0; i<varSoLuongHH; i++){
				varDanhSachHH[i].xuat();
			}
		}else
		if(loai == 1){
			for(int i = 0; i<varSoLuongHH; i++){
				if(varDanhSachHH[i].getVarMaHang().charAt(0)=='D')
					varDanhSachHH[i].xuat();
			}
			
		}else{
			for(int i = 0; i<varSoLuongHH; i++){
				if(varDanhSachHH[i].getVarMaHang().charAt(0)=='T')
					varDanhSachHH[i].xuat();
			}
		}
		
	}
}

public class Tuan04_Bai02
{
	public static void main (String[] args) 
	{
		/*HangHoa h = new HangHoa();
		h.nhapHangHoa();
		h.xuatHangHoa();
		
		HangDienMay h1 = new HangDienMay();
		h1.nhapHangDienMay();
		h1.xuatHangDienMay();*/
		int chonChiSo;
		Scanner sc = new Scanner(System.in);
		DanhSachHangHoa dshh = new DanhSachHangHoa();
		HangHoa h;
		do
		{
			println("========================QUAN LY HANG HOA========================");
			println("1. Them mot mat hang vao danh sach");
			println("2. Xuat hang hoa theo loai");
			println("0. Ket thuc");
			println("Chon chuc nang[0-2]: ");
			chonChiSo = sc.nextInt();
			
			switch(chonChiSo)
			{
				case 1:
					//goi them hang hoa
					//nen co them ham kiem tra xem neu so luong nhap da vuot qua so luong
					//phan tu cua mang thi xuat thong bao khong the nhap nua va ket thuc
					//diem nay la han che cua mang
					println("-----Them hang hoa-----");
					println("Chon loai hang hoa muon them: ");
					println("1. Hang dien may");
					println("2. Hang thuc pham");
					print("Lua chon cua ban[1-2]: ");
					chonChiSo = sc.nextInt();
					if(chonChiSo == 1) 
					{
						h = new HangDienMay();
						
					}
					else if (chonChiSo == 2) h = new HangThucPham();
					else {println("Ban da nhap sai!"); continue;}
					h.nhap();
					dshh.themHangHoa(h);
					break;
				case 2:
					println("-----Xuat Hang Hoa-----");
					
					println("Loai hang hoa muon xuat (0-all 1-DM 2-TP):");
					sc.nextLine();
					int loaiHH = Integer.parseInt(sc.nextLine());
					dshh.xuatHangHoaTheoLoai(loaiHH);
					break;
				default: 
					chonChiSo = 0;
					break;
					
			}
			
		}while(chonChiSo!=0);
	}
	
	public static void println(String s)
	{
		System.out.println(s);
	}
	public static void print(String s)
	{
		System.out.print(s);
	}
}