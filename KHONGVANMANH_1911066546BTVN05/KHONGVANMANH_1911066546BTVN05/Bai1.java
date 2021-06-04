/**
 * @(#)Bai1.java
 *
 *
 * @author Khong Van Manh
 * @version 1.00 2021/4/16
 */

import java.util.Scanner;
public class Bai1 {
    public Bai1() {
    }
    public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try{
    		System.out.println ("Moi nhap toan tu: ");
    		String a = sc.nextLine();
    		int b = Integer.parseInt(a);
    		System.out.println (b);
    	}
    	catch(NumberFormatException e){
    		System.out.println ("Xin moi nhap lai: ");
    		String a = sc.nextLine();
    		int kq;
    		if(a.charAt(1) == '+'){
    			kq = Integer.parseInt(String.valueOf(a.charAt(0))) + Integer.parseInt(String.valueOf(a.charAt(2)));
    		}
    		else
    			if(a.charAt(1) == '-'){
    				kq = Integer.parseInt(String.valueOf(a.charAt(0))) - Integer.parseInt(String.valueOf(a.charAt(2)));
    			}
    			else
    				if(a.charAt(1) == '*'){
    					kq = Integer.parseInt(String.valueOf(a.charAt(0))) * Integer.parseInt(String.valueOf(a.charAt(2)));
    				}
    				else
    					kq = Integer.parseInt(String.valueOf(a.charAt(0))) / Integer.parseInt(String.valueOf(a.charAt(2)));
    				
    		System.out.println (a + " = " + kq);
    	}
    }
    
}