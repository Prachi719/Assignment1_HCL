package Assignment1;

public class Third {
	public static void main(String args[]) {
//		int arr[][] = {{10,15,20},{24,23,30},{19,57,35}};
//		int brr[][] = {{10,15,20},{24,23,30},{19,57,35}};
		
//		int arr[][] = {{6 ,5,4},{9,8,2},{1,0,7}};
//		int brr[][] ={{6 ,5,4},{9,8,2},{1,0,7}};
		
		int arr[][] = {{1,2},
				{3,4}
		};
		int brr[][] ={{1,3},
				{2,4}
		}; 
		TwoDMatrix t = new TwoDMatrix();
		t.multiply(arr, brr);
	}
}


class TwoDMatrix{
	//addition
	void sum(int arr[][],int brr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;i++) {
				System.out.println(arr[i][j] + brr[i][j]);
			}
			System.out.println();
		}
	}
	//subtraction
	void difference(int arr[][],int brr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] - brr[i][j]+" ");
			}
			System.out.println();
		}
	}
	//multiplication
	void multiply(int arr[][],int brr[][]) {
		// 6 5 4     6 5 4     
		// 9 8 2     9 8 2	
		// 1 0 7	  1 0 7
		
		//00 01 02 -> 
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[0].length;j++) {
				int sum =0;
				for(int k=0;k<arr[0].length;k++) {
					sum += (arr[i][k]*brr[k][j]);
				}
				System.out.print(sum+ "   ");
			}
			System.out.println();
		}
	}
	//to check square matrix
	void checkSquare(int arr[][]) {
		if(arr.length==arr[0].length) System.out.println("square matrix");
		else System.out.println("not a square matrix");
	}
	//to check matrix is identity
	int checkIdentity(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for (int j = 0;j<arr[0].length;j++) {
				if((i==j && arr[i][j]!=1) || (i!=j && arr[i][j]!=0)) {
					System.out.println("Not a identity matrix");
					return 0 ;
				}
			}
			
		}
		System.out.println("Yes! it is a identity matrix");
		return 1;
	}
	//to check matrix is diagonal
	int checkDiagonal(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for (int j = 0;j<arr[0].length;j++) {
				if((i!=j && arr[i][j]!=0)) {
					System.out.println("Not a diagonal matrix");
					return 0 ;
				}
			}
		}
		System.out.println("Yes! it is a identity matrix");
		return 1;
	}
	void printTranspose(int arr[][]) {
		// 6 5 4  -    6  9  1
		// 9 8 2    	 5  8  0
		// 1 0 7		 4  2  7
		
		//00 01 02 - 00 10 20
		//10 11 12 - 01 11 21
		//20 21 22 - 02 12 22
		int t=0;
		for(int i=0;i<arr.length;i++) {
			for (int j = 0;j<arr[0].length;j++) {
				if(i!=j) {
					t = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = t;
				}
			}
		}
	}
	
}