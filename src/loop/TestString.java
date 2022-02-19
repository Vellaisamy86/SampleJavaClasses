package loop;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Vellaisamy";
		char[] str1 = str.toCharArray();
		int i = str1.length;
		for(;i>0;i-- ) {
			System.out.print(str1[i-1]);
		}
		System.out.println();
		int k=10 ,j=20;
		
		int l;
		System.out.println("k: "+k + " j:"+j);
		/*l=k;
		k=j;
		j=l;*/
		k=k+j;
		j=k-j;
		k=k-j;
		
		System.out.println("k: "+k + " j:"+j);
		//
		//
		//
		
		
		int[] a;
		a= new int[] {3,8,9,7,6};
		for(int e:a){
			System.out.print(e);
		}
		int[] b=new int[a.length];
		b[0]=a[a.length-1];
		for(int m=1;m<a.length;m++){
			b[m]=a[m-1];
		}
		System.out.println();
		for(int d:b) {
			System.out.print(d);;
		}
		 //63897

	}

}
