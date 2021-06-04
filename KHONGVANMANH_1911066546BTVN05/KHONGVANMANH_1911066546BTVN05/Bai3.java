/**
 * @(#)Bai3.java
 *
 *
 * @author KhongvanMan
 * @version 1.00 2021/4/16
 */

import java.util.Random;
import java.util.Scanner;
public class Bai3 {

    public Bai3() {
    }
    public static void main (String[] args) {
    	try{
    		Random random = new Random();
    	Scanner sc = new Scanner(System.in);
    	int[] list;
    	list = new int[100];
    	for(int i = 0;i<100;i++){
    		list[i] = random.nextInt(1000);
    	}
    	System.out.print ("Nhap vao vi tri muon xuat: ");
    	int n = sc.nextInt();
    	System.out.println ("Gia tri: " + list[n]);
    	}
    	catch(java.lang.ArrayIndexOutOfBoundsException e){
    		System.out.println ("Nhap qua so luong roi!!!");
    	}
    	
    }
    
}