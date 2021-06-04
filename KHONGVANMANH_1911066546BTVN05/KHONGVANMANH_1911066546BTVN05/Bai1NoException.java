class ExcepTest {

	public static void main(String args[]) {
	   int a[] = new int[5];
	   try {
		  System.out.println("Truy cập phần tử 6 :" + a[6]);
	   } catch (ArrayIndexOutOfBoundsException e) {
		  System.out.println("Exception thrown  :" + e);
	   }finally {
		  a[0] = 6;
		  System.out.println("Giá trị phần tử đầu tiên: " + a[0]);
		  System.out.println("Câu lệnh cuối cùng được thực thi");
	   }
	}
 }