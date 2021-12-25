package loop;

public class SampleForLoop {
	
	private void testLoop(int i, int j) {
		System.out.println("i:"+i+" j:"+j);
		for(;i<=j;i++) {
			System.out.println("Value of i:"+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleForLoop tfl=new SampleForLoop();
		tfl.testLoop(1, 10);
	}

}
