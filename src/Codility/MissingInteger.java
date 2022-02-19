package Codility;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
	
	private int findMissingPositiveInteger(int[] intArray) {
		int minimumMissingPositiveNum=0; 
		
		Set<Integer> intSet=new HashSet<Integer>();
		
		for(int i=1;i<=intArray.length+1;i++) {
			intSet.add(i);
		}
		
		for(int j:intArray) {
			intSet.remove(j);
		}
		
		minimumMissingPositiveNum = intSet.iterator().next();
		return minimumMissingPositiveNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingInteger mi=new MissingInteger();
		System.out.println(mi.findMissingPositiveInteger(new int[] {55,100}));
	}

}
