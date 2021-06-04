/**
 * @(#)Bai2.java
 *
 *
 * @author khong Van Manh
 * @version 1.00 2021/4/16
 */

import java.util.Scanner;
public class Bai2 {
	static void nhap(){
		try{
    		Scanner sc = new Scanner(System.in);
    		System.out.println ("Nhap vao 2 so nguyen: ");
	    	System.out.print ("So nguyen 1: ");
	    	int a = sc.nextInt();
	    	System.out.print ("So nguyen 2: ");
	    	int b = sc.nextInt();
	    	System.out.println ("Tong cua chung la: " + (a+b));
    	}
    	catch(java.util.InputMismatchException i){
    		System.out.println ("Xin moi nhap lai");
    		nhap();
    	}
	}
    public Bai2() {
    }
    public static void main (String[] args) {
    	nhap();
    	
    }
    
}