
//Bai01: Phan Tich phan cap ke thua cho cac lop
                  //UML diagram                  
/********************************************
*                 HangHoa                   *
*-------------------------------------------*
* varMaHang: String                         *
* varTenHang: String                        *
* varDonGia: long                           *
*-------------------------------------------*
* HangHoa()                                 *
* HangHoa(String, String, long)             *
* nhap()									*<-------|
* xuat()									*		 |
*********************************************		 |
                  ^									 |
                  |									 |
                  |									 |
*********************************************		 |
*            HangDienMay                    *		 |
*-------------------------------------------*		 |
* thoiGianBH: int                           *		 |
* dienAp: int                               *		 |
* congSuat: int                             *		 |
*-------------------------------------------*		 |
* HangDienMay()                             *		 |
* HangDienMay(String,String, long,          *		 |
* 				int, int, int)				*		 |
* nhap()									*        |
* xuat()									*        |
********************************************         |
													 |
*********************************************        |
*            HangThucPham                   *--------|
*-------------------------------------------*
* ngaySX: String                            *
* ngayHH: String                            *
*-------------------------------------------*
* HangThucPham()                            *
* HangThucPham(String,String, long,         *
* 				String, String)				*
* nhap()									*
* xuat()									*
********************************************/
//ngaySX va ngayHH chi yeu cau nhap, xuat nen dung String hay int deu duoc

//import libraries
import java.util.Scanner;

//Lop hang hoa
class HangHoa{
	//Du lieu lop Hang hoa
	protected String varMaHang;
	protected String varTenHang;
	protected long varDonGia;
	
	//getter 
	public String getVarMaHang() {
		return varMaHang;
	}
	public String getVarTenHang() {
		return varTenHang;
	}
	public long getVarDonGia() {
		return varDonGia;
	}
	
	//and setter
	public void setVarMaHang(String varMaHang) {
		this.varMaHang = varMaHang;
	}
	public void setVarTenHang(String varTenHang) {
		this.varTenHang = varTenHang;
	}
	public void setVarDonGia(long varDonGia) {
		this.varDonGia = varDonGia;
	}
	
	
	//PTKT khong tham so
	public HangHoa()
	{
		varMaHang = "";
		varTenHang = "";
		varDonGia = 0;
	}
	
	//PTKT co tham so truyen cho 3 thuoc tinh tuong ung
	public HangHoa(String maHang, String tenHang, long donGia)
	{
		setVarMaHang(maHang);
		varTenHang = tenHang;
		setVarDonGia(donGia);
	}
	
	//ham nhap
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma hang (Dien may - DM123, thuc pham - TP123: ");
		varMaHang = sc.nextLine();
		System.out.print("Nhap ten hang: ");
		varTenHang = sc.nextLine();
		System.out.print("Nhap don gia: ");
		varDonGia = Long.parseLong(sc.nextLine());
	}
	
	//ham xuat
	public void xuat()
	{
		System.out.println("Ma hang: " +getVarMaHang());
		System.out.println("Ten hang: " +getVarTenHang());
		System.out.println("Don gia: " +getVarDonGia());
	}
}

//Lop HangDienMay
class HangDienMay extends HangHoa{
	private int thoiGianBH;
	private int dienAp;
	private int congSuat;
	
	public int getThoiGianBH() {
		return thoiGianBH;
	}
	public void setThoiGianBH(int thoiGianBH) {
		this.thoiGianBH = thoiGianBH;
	}
	public int getDienAp() {
		return dienAp;
	}
	public void setDienAp(int dienAp) {
		this.dienAp = dienAp;
	}
	public int getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}
	
	public HangDienMay(){
		super();
		thoiGianBH = 0;
		dienAp = 0;
		congSuat = 0;
	}
	
	public HangDienMay(String newMaHang, String newTenHang, long newDonGia, int newThoiGianBH, int newDienAp, int newCongSuat){
		super(newMaHang,newTenHang,newDonGia);
		thoiGianBH = newThoiGianBH;
		setDienAp(newDienAp);
		setCongSuat(newCongSuat);
	}
	
	@Override
	public void nhap(){
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap thoi gian bao hanh: ");
		thoiGianBH = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap dien ap: ");
		dienAp = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap cong suat: ");
		congSuat = Integer.parseInt(sc.nextLine());
		
	}
	
	@Override
	public void xuat(){
		super.xuat();
		System.out.println("Thoi gian bao hanh: " +getThoiGianBH());
		System.out.println("Dien ap: " +getDienAp());
		System.out.println("Cong suat: " +getCongSuat());
		System.out.println("---");
	}
}

//class HangThucPham
class HangThucPham extends HangHoa{
	private String ngaySX;
	private String ngayHH;
	
	public String getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(String ngaySX) {
		this.ngaySX = ngaySX;
	}
	public String getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(String ngayHH) {
		this.ngayHH = ngayHH;
	}
	
	public HangThucPham(){
		super();
		ngaySX = "";
		ngayHH = "";
	}
	
	public HangThucPham(String newMaHang, String newTenHang, long newDonGia, String newNgaySX, String newNgayHH){
		super(newMaHang,newTenHang,newDonGia);
		ngaySX = newNgaySX;
		ngayHH = newNgayHH;
	}
	
	@Override
	public void nhap(){
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ngay san xuat (dd/mm/yyyy): ");
		ngaySX = sc.nextLine();
		System.out.print("Nhap ngay het han (dd/mm/yyyy): ");
		ngayHH = sc.nextLine();
		
		
	}
	
	@Override
	public void xuat(){
		super.xuat();
		System.out.println("Ngay san xuat: " +getNgaySX());
		System.out.println("Ngay het han: " +getNgayHH());
		System.out.println("---");
		
	}
}

public class Tuan04_Bai01{
	public static void main (String[] args) {
		HangDienMay hdm= new HangDienMay();
		HangHoa htp = new HangThucPham();
		System.out.println("Nhap thong tin hang dien may: ");
		hdm.nhap();
		System.out.println("****************************");
		System.out.println("Nhap thong tin hang thuc pham: ");
		htp.nhap();
		System.out.println("****************************");
		System.out.println("Xuat thong tin hang dien may: ");
		hdm.xuat();
		System.out.println("****************************");
		System.out.println("Xuat thong tin hang thuc pham: ");
		htp.xuat();
	}
}