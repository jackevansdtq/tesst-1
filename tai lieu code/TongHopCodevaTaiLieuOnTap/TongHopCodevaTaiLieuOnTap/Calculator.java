/**
 * @(#)Calculator.java
 *
 *
 * @author 
 * @version 1.00 2021/4/11
 */
import java.util.Scanner;
public class Calculator {
        
    /**
     * Creates a new instance of <code>Calculator</code>.
     */
    public Calculator() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NumberFormatException {
    	
    	Scanner sc = new Scanner(System.in);
    	int n=0;
    	//Nhap vao do dai mang chua cac phep tinh
    	try{
    		System.out.print("Input array length: ");
    		n = Integer.valueOf(sc.nextLine()).intValue();
    	}catch(Exception e){
    		System.out.println("Error: "+e);
    	}
    	
    	//khoi tao mang, minh dung doi so args cua Java de khoi tao luon
    	args = new String[n];
    	
    	// Kiem tra do dai chuoi cho phep chuong trinh chay tiep hay khogn
		if (args.length != 3) {
			System.out.println(
			"Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}
    	
    	for(int i= 0; i<args.length;i++){
    		System.out.print("args["+i+"]: ");
    		args[i]= sc.nextLine();
    	}
        
		
		// Khoi tao bien result chua ket qua phep tinh
		int result = 0;
		
		// Xac dinh phep tinh
		try{
			switch (args[1].charAt(0)) {
				case '+': 
					result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
					break;
				case '-': 
					result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
					break;
				case '.': 
					result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
					break;
				case '/': 
					result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
					break;
				default:
					throw new NumberFormatException("");
			}
			// Hien thi ket qua
			System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
		}catch(NumberFormatException ex){
			System.out.println("Wrong Input: " + 
				ex.getMessage().substring(ex.getMessage().indexOf("\"") + 1, 
					ex.getMessage().lastIndexOf("\"")));
		}
		
		
		
    }
}
