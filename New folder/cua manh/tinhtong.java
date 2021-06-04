import java.util.Scanner;
public class tinhtong {
    
    public static void main(String[] args) {
       
      
        Scanner scanner = new Scanner(System.in);
         
        
        System.out.print("Nhập số nguyên dương a = ");
        float a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        float b = scanner.nextInt();
        System.out.println(" hai so a va b là:");   
        System.out.println(Math.max(a,b));
        
        

    }
    
}
