/**
 * @(#)Tuan04_BaiVN04.java
 *
 *
 * @author Phan Duc Tri
 * Sua bai tap ve nha
 * Cac phuong thuc thu vien dung trong file cac ban co gang tu tim hieu
 * @version 1.00 2021/4/11
 */
 //Tat cac cac class se nam trong 1 package QuanLyCanBo
 package QuanLyCanBo;
 
 
import java.io.DataInputStream;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.Exception;
import java.lang.Object;


public class Tuan04_BaiVN04 {
        
    /**
     * Creates a new instance of <code>Tuan04_BaiVN04</code>.
     */
    public Tuan04_BaiVN04() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        QuanLyCanBo.excute();
        
        
    }
}

class NhapDL{
	static DataInputStream inStr = new DataInputStream(System.in);
	public static String nhapChuoi() throws IOException{
		String chuoi = "";
		try{
			chuoi = inStr.readLine();
		}catch(Exception e){
			XuatDL.println("Error: "+ e);
		}
		return chuoi;
	}
	public static int nhapSo() throws IOException{
		String chuoi = nhapChuoi();
		int so = 0;
		try{
			so = Integer.valueOf(chuoi).intValue();//Integer.parseInt(chuoi);
			
		}catch(Exception e){
			XuatDL.println("Error: "+e);
		}
		return so;
	}
}

class XuatDL{
	public static void println(String s){
		System.out.println(s);
	}
	
	public static void print(String s){
		System.out.print(s);
	}
}

//Xay dung class CanBo
class CanBo{
	protected String hoTen, gioiTinh, diaChi;
	protected int namSinh;
	
	//Constructors
	CanBo(){
		
	}
	CanBo(String ht, String gt, String dc, int ns){
		this.hoTen = ht;
		this.gioiTinh = gt;
		this.diaChi = dc;
		this.namSinh = ns;
	}
	
	//nhap du lieu
	public void nhapDuLieu() throws IOException{
		XuatDL.println("Ho ten\t: ");
		this.hoTen = NhapDL.nhapChuoi();
		XuatDL.println("Gioi tinh\t: ");
		this.gioiTinh = NhapDL.nhapChuoi();
		XuatDL.println("Dia chi\t: ");
		this.diaChi = NhapDL.nhapChuoi();
		XuatDL.println("Nam sinh\t: ");
		this.namSinh = NhapDL.nhapSo();
	}
	
	//Xuat du lieu
	public void xuatDuLieu(){
		XuatDL.println("Ho ten\t: "+this.hoTen);
		XuatDL.println("Gioi tinh\t: "+this.gioiTinh);
		XuatDL.println("Dia chi\t: "+this.diaChi);
		XuatDL.println("Nam sinh\t: "+this.namSinh);
	}
	
	//Phuong thuc tim kiem
	public boolean timKiem(String tuKhoa){
		StringBuffer sb = new StringBuffer(this.hoTen);
		if(sb.lastIndexOf(tuKhoa)>=0){
			return true;
		}else{
			return false;
		}
	}
}

//Xay dung class CongNhan ke thua class CanBo
class CongNhan extends CanBo{
	private String bac;
	
	//Constructors
	CongNhan(){
	}
	CongNhan(String b){
		this.bac = b;
	}
	
	//Nhap thong tin cong nhan
	@Override
	public void nhapDuLieu() throws IOException{
		super.nhapDuLieu();
		XuatDL.print("Cap bac\t: ");
		this.bac = NhapDL.nhapChuoi();
	}
	
	//Xuat thong tin cong nhan
	@Override
	public void xuatDuLieu(){
		super.xuatDuLieu();
		XuatDL.println("Cap bac CN\t: "+this.bac);
	}
}

//Xay dung class NhanVien ke thua class CanBo
class NhanVien extends CanBo{
	private String congViec;
	NhanVien(){
	}
	//Xay dung tuong tu
}

//Xay dung class KySu ke thua class CanBo
class KySu extends CanBo{
	private String nganhDT;
	KySu(){
	}
	
	//Xay dung tuong tu
}

class QuanLyCanBo{
	public static void excute()throws IOException {
		CanBo[] dsCB = null;
		int luaChon =-1, n=0;
		while(luaChon !=5){
			menu();
			luaChon = NhapDL.nhapSo();
			switch(luaChon){
			case 1:{
				XuatDL.print("Nhap so luong can bo can nhap: ");
				n = NhapDL.nhapSo();
				
				dsCB = new CanBo[n];
				for(int i= 0; i<n; i++){
					XuatDL.println("Nhap thong tin can bo thu " + (i+1));
					boolean lapLai = false;
					while(!lapLai){
						XuatDL.print("Loai can bo muon nhap (CN, KS, NV): ");
						String loaiCB = NhapDL.nhapChuoi().trim();
						if(loaiCB.equalsIgnoreCase("cn")){
							dsCB[i] = new CongNhan();
							dsCB[i].nhapDuLieu();
							lapLai = true;
						}else
						if(loaiCB.equalsIgnoreCase("ks")){
							dsCB[i] = new KySu();
							//dsCB[i].nhapDuLieu();
							lapLai = true;
						}else
						if(loaiCB.equalsIgnoreCase("nv")){
							dsCB[i] = new NhanVien();
							//dsCB[i].nhapDuLieu();
							lapLai = true;
						}
					}
				}
				XuatDL.println("Da nhap xong...");
				break;
			}
			case 2:{
				if(dsCB!=null){
					XuatDL.print("Nhap tu khoa: ");
					String tuKhoa = NhapDL.nhapChuoi().trim();
					StringTokenizer st = new StringTokenizer(tuKhoa, " ", false);
					XuatDL.println("Ket qua tim kiem: ");
					for(CanBo c: dsCB){
						if(c.timKiem(st.nextToken()) || (st.hasMoreTokens())){
							c.xuatDuLieu();
						}
					}
					XuatDL.println("Tim xong.");
				}else{
					XuatDL.println("Canh bao: Ban chua nhap danh sach");
				}
				break;
			}
			case 3:{
				if(dsCB!=null){
					XuatDL.println("Danh sach can bo bao gom: ");
					for(CanBo c : dsCB){
						c.xuatDuLieu();
					}
				}else{
					XuatDL.println("Canh bao: Ban chua nhap danh sach");
				}
				break;
			}
			case 4:{
				if(dsCB!=null){
					XuatDL.println("Nhap vao loai can bo (CongNhan/NhanVien/KySu): ");
					String st = NhapDL.nhapChuoi();
					for(CanBo c : dsCB){
						if(c.getClass().getName().equalsIgnoreCase("QuanLyCanBo."+st)){
							c.xuatDuLieu();
						}
					}
				}else{
					XuatDL.println("Canh bao: Ban chua nhap danh sach");
				}
				break;
			}
			case 5:{
				XuatDL.println("GoodBye. See you next day");
				break;
			}
		}
		}
		
		
	}
	
	public static void menu() throws IOException{
			XuatDL.println("||==================================||");
			XuatDL.println("||	 Chuong trinh quan ly can bo	||");
			XuatDL.println("|| 1. Nhap thong tin n can bo		||");
			XuatDL.println("|| 2. Tim kiem theo ho va ten		||");
			XuatDL.println("|| 3. Hien thi thong tin DSCB		||");
			XuatDL.println("|| 4. Hien thi theo loai can bo		||");
			XuatDL.println("|| 5. Thoat khoi chuong trinh		||");
			XuatDL.println("||==================================||");
			
			XuatDL.print("\nNhap lua chon cua ban: ");
		
	}
}

