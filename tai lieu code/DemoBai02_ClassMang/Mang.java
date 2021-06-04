/**
 * @(#)Mang.java
 *
 *
 * @author Phan Duc Tri
 * @Buoi 02 
 * @Bai 02: Xay dung class Mang
 * @version 1.00 2021/3/23
 */
import java.util.Scanner;

public class Mang {
	private short soPhanTu;
	private int[] mangSoNguyen;

    public Mang() {
    }
    
    //get/set
    /*Cac ban luu y lai giup cach su dung get/set
     *O tren lop, minh noi chung ta nen xu ly cac thuoc tinh
     *thong qua cac phuong thuc get/set
     *Tuy nhien, chi truy xuat thong qua get/set khi o ngoai class
     *Khi con o trong class, cac ban co the tuong tac voi cac thuoc tinh 
     *truc tiep, khong can thong qua get/set, vi se anh huong toi
     *hieu nang xu ly
     *co gi chua hieu minh se giai thich them o tren lop
     */
     public short getSoPhanTu(){
     	return this.soPhanTu;
     }
     public void setSoPhanTu(short spt){
     	this.soPhanTu = spt;
     }
     public int[] getMangSoNguyen(){
     	return this.mangSoNguyen;
     }
     public void setSoPhanTu(int[] msn){
     	this.mangSoNguyen = msn;
     }
     
     //Cac phuong thuc thong thuong trong class se 
     //tuong tac truc tiep toi cac thuoc tinh ma khong
     //can thong qua get/set
     public void input(){
     	Scanner sc = new Scanner(System.in);
     	
     	System.out.print("\nNhap so phan tu cua mang: ");
     	//Gan truc tiep vao bien thuoc tinh, khong can thong qua set
     	this.soPhanTu = sc.nextShort();
     	//Khoi tao truc tiep bien thuoc tinh
     	this.mangSoNguyen = new int[this.soPhanTu];
     	
     	System.out.print("\nNhap cac phan tu cua mang: \n");
     	for(int i = 0; i<this.soPhanTu; i++){
     		System.out.print("Nhap phan tu thu "+(i+1)+" cua mang: ");
     		//Gan truc tiep
     		this.mangSoNguyen[i] = sc.nextInt();
     	}
     	
     }
     
     //Voi phuong thuc output cung vay
     public void output(){
     	System.out.println("\nMang so nguyen vua nhap co "+this.soPhanTu+" phan tu lan luot la: ");
     	for(int i= 0 ; i<this.soPhanTu; i++){
     		System.out.println("Phan tu " +(i+1)+": "+mangSoNguyen[i]);
     		
     	}
     }
     
     //Phuong thuc tinh gia tri trung binh cac so le
     public void averageOfOddNumbers(){
     	System.out.print("\nGia tri trung binh cac so le trong mang la: ");
     	int sum=0, count=0;
     	for(int i= 0 ; i<this.soPhanTu; i++){
     		if(this.mangSoNguyen[i]%2!=0){
     			sum += this.mangSoNguyen[i];
     			count++;
     		}
     		
     	}
     	System.out.printf("%.2f",(float)sum/count);
     }
     
     //phuong thuc tim phan tu lon nhat cua mang
     public void findMax(){
     	System.out.print("\nPhan tu lon nhat mang la: ");
     	int max = this.mangSoNguyen[0];
     	for(int i= 1;i<this.soPhanTu;i++){
     		if(max<this.mangSoNguyen[i]){
     			max = this.mangSoNguyen[i];
     		}
     	}
     	System.out.print(max);
     }
     
     //Sap xep mang theo tang dan
     public void sort(){
     	System.out.println("\nMang sau khi sap xep tang dan: ");
     	int temp;
     	for(int i= 0; i<this.soPhanTu; i++){
     		for(int j=this.soPhanTu-1; j>i; j--){
     			if(this.mangSoNguyen[i]>this.mangSoNguyen[j]){
     				temp=this.mangSoNguyen[i];
     				this.mangSoNguyen[i] = this.mangSoNguyen[j];
     				this.mangSoNguyen[j] = temp;
     			}
     		}
     	}
     	for(int i= 0 ; i<this.soPhanTu; i++){
     		System.out.println("Phan tu " +(i+1)+": "+mangSoNguyen[i]);
     		
     	}
     }
    
}