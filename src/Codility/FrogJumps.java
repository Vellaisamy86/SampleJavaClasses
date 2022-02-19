package Codility;

public class FrogJumps {
	
	public int numberOfJumps(int start, int end, int distanceJumped) {
		int distance = end-start;
		//return (int)Math.ceil((double)distance/distanceJumped);
		int a =  distance%distanceJumped;
		int b = distance/distanceJumped;
		return a>0 ? b+1:b;		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrogJumps fj=new FrogJumps();
		System.out.println(fj.numberOfJumps(10, 85, 30));
	}

}
