package Codility;

public class BinaryGap {
	
	public int findBinaryGaps(int n) {
		String binary = Integer.toString(n, 2);
		System.out.println(binary);
		int counter=0;
		int maxCounter=0;
		for(int i=0; i<binary.length(); i++) {
			String c = binary.substring(i, i+1);
			
			if(c.equals("1")) {
				if(maxCounter<counter) {
					maxCounter=counter;
					counter=0;
				}
			}else if(c.equals("0")) {
				counter++;
			}
		}
		return maxCounter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryGap bg=new BinaryGap();
		System.out.println(bg.findBinaryGaps(1041));

	}

}
