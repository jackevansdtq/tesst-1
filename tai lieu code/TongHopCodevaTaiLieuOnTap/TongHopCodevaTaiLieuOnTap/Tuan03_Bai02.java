
//Bai 02: Thiet ket lop Stock gom cac yeu cau:
// -Yeu cau 1: Ve UML  va hien thuc lop - 1 diem
// -Yeu cau 2: Viet chuong trinh kiem tra... Cai dat 34.35 va hien thi ty le % thay doi- 1 diem

//Yeu cau 1
                  //UML diagram                  
/********************************************
*                    Stock                  *
*-------------------------------------------*
* symbol: String                            *
* name: String                              *
* previousClosingPrice: double              *
* currentPrice: double                      *
* Stock(newSymbol: String, newName: String) *
* getChangePercent(): double                *
********************************************/
class Stock{
	String symbol; //Ma chung khoang
	String name; //Ten chung khoang
	double previousClosingPrice; //Gia dong cua ngay hom qua
	double currentPrice; //Gia hien tai
	
	//Constructor with a specified symbol and name
	Stock(String newSymbol, String newName){
		symbol = newSymbol;
		name = newName;
	}
	
	//Tra ve ty le phan tram thay doi gia giua gia hom truoc va hien tai
	double getChangePercent(){
		return ((currentPrice - previousClosingPrice)/previousClosingPrice)*100;
	}
}
//Xong yeu cau 1

//Yeu cau 2
public class Tuan03_Bai02 {
	//Main method
	public static void main (String[] args) {
		//Tao mot doi tuong Stock voi symbol ORCL, name Oracle Corporation
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;
		
		//Hien thi
		System.out.println("\nStock name: " +stock.name);
		System.out.println("Stock symbol: " +stock.symbol);
		System.out.printf("Price-change percentage: %.2f%%\n" , stock.getChangePercent());
	}
}
//Xong yeu cau 2