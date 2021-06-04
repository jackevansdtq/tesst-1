import java.util.Scanner;
public class TryCatchStringLength{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean done = false;
		
		int int6Chars = 0;

		do{
			try{
				System.out.println("Nhap Protection: ");
				String s6 = sc.nextLine();
				if (s6.length()==6){
					done=true;
				}else{
					done=false;
				}
				int6Chars = Integer.parseInt(s6);
				
				
			}catch(Exception e){
				System.out.println("Chuoi nhap khong dung: "+e.getMessage());
			}
		}while(!done);
		System.out.print(int6Chars);
	}
	static boolean checkString(String s){
		if(s.length()==6)
			return true;
		return false;
	}
}