//Static: quan ly bo nho trong java
//static thuoc ve lop (class) khong thuoc ve cac the hien (instance/object)
//gom:
//bien static - bien tinh
//phuong thuc static
//khoi static

//Bien static
//tham chieu thuoc tinh chung -> tiet kiem bo nho
//khong static
class Student{
	int rollno;  
    String name;  
    String college="HUTECH"; 
}
//co static
class Student1 {
    int rollno;
    String name;
    static String college = "HUTECH";
 
    Student1(int r, String n) {
        rollno = r;
        name = n;
    }
 
    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }
 
    public static void implement() {
        Student1 s1 = new Student1(111, "Thông");
        Student1 s2 = new Student1(222, "Minh");
 
        s1.display();
        s2.display();
    }
}
//dem ma khong co static
//trong vi du duoi day ta tao bien the hien co ten count dc tang len trong constructor
//khi instane cua no lay bo nho tai thoi diem tao doi tuong
//moi doi tuong se la mot ban sao
class Counter_NoStatic {
    int count = 0; // se lay bo nho moi khi instance dc tao ra
 
    Counter_NoStatic() {
        count++;
        System.out.println(count);
    }
 
    public static void implement() {
 
        Counter_NoStatic c1 = new Counter_NoStatic();
        Counter_NoStatic c2 = new Counter_NoStatic();
        Counter_NoStatic c3 = new Counter_NoStatic();
 
    }
}//khi tang len se khong anh huong den doi tuong khac

//dem co static
//doi tuong nao thay doi gia tri bien static, no se van ghi nho
class Counter_Static {
    static int count = 0; // se lay bo nho 1 lan duy nhat
 
    Counter_Static() {
        count++;
        System.out.println(count);
    }
 
    public static void implement() {
 
        Counter_Static c1 = new Counter_Static();
        Counter_Static c2 = new Counter_Static();
        Counter_Static c3 = new Counter_Static();
 
    }
}

//Phuong thuc static
// thuoc lop khong thuoc doi tuong
// goi khong can tao instance
// co the truy cap bien static va thay doi gia tri cua no
class Student3 {
    int rollno;
    String name;
    static String college = "HUTECH";
 
    static void change() {
        // Thay doi thuoc tinh static
        college = "Dai hoc cong nghe";
        //this.display()+"...";
    }
 
    Student3(int r, String n) {
        rollno = r;
        name = n;
    }
 
    void display() {
    	//this.change();
        System.out.println(rollno + " - " + name + " - " + college);
    }
 
    public static void implement() {
        Student3.change();
        //this.change();
 
        Student3 s1 = new Student3(111, "Thông");
        Student3 s2 = new Student3(222, "Minh");
        Student3 s3 = new Student3(333, "Anh");
 
        s1.display();
        
        s2.display();
        s3.display();
    }
}

//Han che cua static
// - Phuong thuc static khong the su dung bien non-static hoac 
//	goi truc tiep phuong thuc non-static
// - Tu khoa this va super khong the su dung trong ngu canh static.
class HanChe {
    int a = 40;// non static
 
    public static void implement() {
        //System.out.println(a);
    }
}

//Khoi static
//su dung de khoi tao thanh vien du lieu static
//thuc thi truoc phuong thuc main tai luc tai lop

public class StaticInJava{
//static {
//        System.out.println("Khoi static: hello !");
//    }
 /*
	public static void main(String args[]) {
	    System.out.println("Main: hello !");
	}
*/
	public static void main (String[] args) {
		Student3.implement();
	}
	
}
//Tai sao phuong thuc main trong java la static
