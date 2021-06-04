import java.util.Scanner;
import java.util.Arrays;

class Demo
{
	public static void main(String[] args)
	{
		NhanVien nv1 = new NhanVien();
		NhanVien nv2 = new NhanVien("NV02", "Nguoi Thu Hai", 1.5f);
		NhanVien nv3 = new NhanVien(nv1);
		nv1.input();
		System.out.println(nv1.toString());
		nv1.setHoTenNV("Ho ten sau khi thay doi");
		
		//in thong tin nhan vien co hsl cao nhat
		float max = nv1.getHsl();
		NhanVien nvMax = new NhanVien(nv1);
		if(nv2.getHsl()> max){
			max = nv2.getHsl();
			nvMax = nv2;
		}
		if(nv3.getHsl()> max){
			max = nv3.getHsl();
			nvMax = nv3;
		}
		System.out.println("Nhan vien co he so luong max: ");
		System.out.println(nvMax.toString());
		
		//Nhap danh sach Nhan vien
		NhanVien[] dsnv = new NhanVien[]{};
		dsnv = Arrays.copyOf(dsnv,dsnv.length+1);
		dsnv[0] = nv1;
		dsnv = Arrays.copyOf(dsnv,dsnv.length+1);
		dsnv[1] = nv2;
		dsnv = Arrays.copyOf(dsnv,dsnv.length+1);
		dsnv[2] = nv3;
		for(int i = 0; i<dsnv.length;i+=1){
			System.out.println(dsnv[i].toString());
		}
		NhanVien.inSLNV();
	}
}
class NhanVien
{
	//du lieu
	private String maSoNV, hoTenNV;
	private static float lcb;
	static int slnv = 0;
	private float hsl;
	
	//constructor khong tham so
	public NhanVien()
	{
		this.maSoNV = "";
		this.hoTenNV = "";
		this.lcb = 100;
		hsl = 1;
		slnv++;
		
	}
	//constructor cotham so
	public NhanVien(String ms, String ht, float hsl){
		this.maSoNV = ms;
		this.hoTenNV = ht;
		this.hsl = hsl;
		slnv++;
	}
	//constructor saochep
	public NhanVien(NhanVien nv){
		this.maSoNV = nv.maSoNV;
		this.hoTenNV = nv.hoTenNV;
		this.hsl = nv.hsl;
		slnv-=-1;
	}
	
	//get/set ma so
	public String getMaSoNV(){
		return this.maSoNV;
	}
	public void setMaSoNV(String ms){
		this.maSoNV = ms;
	}
	//get/set hoten
	public String getHoTenNV(){
		return this.hoTenNV;
	}
	public void setHoTenNV(String ht){
		this.hoTenNV = ht;
	}
	//get/set hsl
	public float getHsl(){
		return this.hsl;
	}
	public void setHsl(float hsl){
		this.hsl = hsl;
	}
	
	//Cac phuong thuc xu ly thong thuong
	//Phuong thuc nhap du lieu
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ma so nhan vien: ");
		this.maSoNV = sc.nextLine();
		System.out.print("\nNhap ho ten nhan vien: ");
		this.hoTenNV = sc.nextLine();
		System.out.print("\nNhap he so luong: ");
		this.hsl = sc.nextFloat();
	}
	//toString()
	public String toString(){
		String moTa = "Nhan vien co ma so " +this.maSoNV;
		moTa += " la " + this.hoTenNV;
		moTa += " hsl: " +this.hsl;
		return moTa;
	}
	//tinhLuong()
	public float tinhLuong(){
		return this.hsl*this.lcb;
	}
	//inSLNV()
	public static void inSLNV(){
		System.out.println("So luong nhan vien: " + slnv);
	}
	
}