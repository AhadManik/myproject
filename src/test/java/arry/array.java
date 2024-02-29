package arry;

public class array {

	public static void main(String[] args) {
		
		//array2D();
		 //arry2();
		//arry_1d();	
		arry_2d();

	}
	public static void arry_1d() {
		int a[]= {100,215,151,854,849,114,755,948,644,366};
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
			System.out.println(a[9]);
		}
	}

	
	public static void arry_2d() {
		
		int [][]a= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
	public static void arry2() {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for (int i=0; i<a.length; i++) {
			//System.out.print(i+" ");
			System.out.println(a[9]);
			break;
		}
	}
	public static void array2D() {
		int [][]a= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.println();
	}
	}

