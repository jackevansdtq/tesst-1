//Bai03: Viet chuong trinh minh hoa theo thiet ke
                  //UML diagram                  
/********************************************
*                 ConNguoi                  *
*-------------------------------------------*
* hoTen: String                             *<-------|
*-------------------------------------------*		 |
* nhap()									*		 |
* xuat()									*		 |
*********************************************		 |
                  ^									 |
                  |									 |
                  |									 |
*********************************************		 |
*            HocVien                        *		 |
*-------------------------------------------*		 |
* diem01: float                             *		 |
* diem02: float                             *		 |
* diem03: float                             *		 |
*-------------------------------------------*		 |
* nhap()									*        |
* xuat()									*        |
*********************************************        |
													 |
*********************************************        |
*            NhanVien	                    *--------|
*-------------------------------------------*
* luong: long                               *
* ngayNV: String							*
* pBK: PhongBanKhoa							*
*-------------------------------------------*
* nhap()									*
* xuat()									*
*********************************************
				  |
				  |
				  |
                  |									 
                  |									 
                  V									 
*********************************************		 
*            PhongBanKhoa                   *		 
*-------------------------------------------*		 
* maPB: float                               *
* tenPB: float                              *
*-------------------------------------------*
* nhap()									*
* xuat()									*
********************************************/

 class ConNguoi{
 	protected String hoTen;
 	
 	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public ConNguoi(){
	}
	
	public ConNguoi(String newHoTen){
		hoTen =newHoTen;
	}
	
	public void nhap(){
		//tu viet
	}
	
	public void xuat(){
		//tu viet
	}
 }
 
 class HocSinh extends ConNguoi{
 	private float diem01, diem02, diem03;
 	
 	//get, set
 	
 	//constructors
 	
 	//override nhap
 	
 	//override xuat
 }
 
 class PhongBanKhoa{
 	private String maPB;
 	private String tenPB;
 	
 	//getter, setter
 	
 	//constructors
 	
 	//nhap
 	
 	//xuat
 }
 
 //phai tao class NhanVien sau khi tao class PhongBanKhoa
 //ly do rat de thay.
 class NhanVien extends ConNguoi{
 	private long luong;
 	private String ngayNV;
 	private PhongBanKhoa pBK;
 	
 	//getter, setter
 	
 	//constructors
 	
 	//override nhap
 	
 	//override xuat
 }
 
 //Ham main tu viet