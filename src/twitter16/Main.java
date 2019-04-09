package twitter16;

public class Main {

	public static void main(String[] args) {
		LogRecord day1 = new LogRecord();
		
		day1.record("A1-set");
		day1.record("A2-set");
		day1.record("A3-set");
		day1.record("C4-set");
		day1.record("C5-await");
		day1.record("E7-done");
		day1.record("F4-XVT");
		
		System.out.println(day1.getLength());
		
		System.out.println(day1.getOneLast(3));
		
		String[] x = day1.getMoreLast(3);
		
		for(String y: x) {
			System.out.println(y);
		}
	}

}
