/****************************
*UML for class StopWatch:	*
*****************************
*         StopWatch         *
*---------------------------*
* -startTime: long          *
* -endTime: long            *
* +StopWatch()              *
* +start()                  *
* +stop()                   *
* +getElapsedTime(): long   *
* +getStratTime(): long     *
* +getEndTime(): long       *
****************************/

// Hien thuc lop
class StopWatch {
	private long startTime; // Start time
	private long endTime;	// End time

	// constructor no-arg khoi tao startTime 
	// la thoi gian hien hanh
	StopWatch() {
		startTime = System.currentTimeMillis();
	}

	// Cai dat thoi gian bat dau la thoi gian hien hanh
	public void start() {
		startTime = System.currentTimeMillis();
	} 

	// Cai dat thoi gian ket thuc la thoi gian hien hanh
	public void stop() {
		endTime = System.currentTimeMillis();
	}

	// Tra ve thoi gian bam gio  
	// theo milliseconds
	public long getElapsedTime() {
		return getEndTime() - getStratTime();
	}

	// tra ve thoi gian bat dau
	public long getStratTime() {
		return startTime;
	}

	// tra ve thoi gian ket thuc
	public long getEndTime() {
		return endTime;
	}
}

public class Tuan02_Bai02{
	/** Main method */
	public static void main(String[] args) {
		// Tao doi tuong StopWatch
		StopWatch stopWatch = new StopWatch();

		// Tao mang 100 000 so ngau nhien
		int[] randomArray = getArray();

		// Goi phuong thuc start() bat dau tinh gio
		stopWatch.start();

		// thuc hien thuat toan selection sort
		selectionSort(randomArray);

		// Goi phuong thuc stop() ket thuc tinh gio
		stopWatch.stop();

		// Hien thi thoi gian bat dau, ket thuc va thuc thi
		System.out.println("Start time: " +stopWatch.getStratTime()+ " milliseconds");
		System.out.println("Stop time: " +stopWatch.getEndTime()+ " milliseconds");
		System.out.println("The execution time of sorting 100,000 " +
			"numbers using selection sort: " + stopWatch.getElapsedTime() +
			" milliseconds");
	}

	/** getArray tao tra ve mang 100 000 so ngau nhien */
	public static int[] getArray() {
		// Create an array of length 100,000
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100000);
		}
		return array;
	}

	/** selection sort */
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}

			if (i != minIndex) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}
	} 
}