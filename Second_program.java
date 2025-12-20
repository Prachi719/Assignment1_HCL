package Assignment1;

public class Second_program {
	public static void main(String args[]) {
		Operations o = new Operations();
		int arr[]  = {1,2,3,4,5,6,7,8};
		o.insertElement(45, 3, arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		o.deleteElement(3,arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		o.linearSearch(4, arr);
		o.binarySearch(0, arr.length-1, 76, arr);
		o.countEvenOdd(arr);
		o.findMaximum(arr);
	}
}

class Operations{
	
	
	//insertion
	void insertElement(int el,int pos,int arr[]) {
		System.out.println();
		
		for(int i=arr.length-1;i>=pos-1;i--) {
			//1 2 3 4 5 6 7
			arr[i] = arr[i-1];
		}
		arr[pos-1] = el;
		System.out.println("element inserted");
	}
	//deletion
	void deleteElement(int pos,int arr[]) {
		System.out.println();
		pos -= 1;
		for(int i=pos;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
		System.out.println("element deleted");
	}
	
	//linear search
	void linearSearch(int tar,int arr[]) {
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==tar) {
				System.out.println("element "+tar+" found at position : "+(i+1)+" through linear search");
				break;
			}
		}
	}
	//binary search
	void binarySearch(int st,int end,int tar,int arr[]) {
		if(st>end || st<0 || end>=arr.length) {
			System.out.println("Element Not Found!");
			return;
		}
		int mid = (st+end)/2;
		if(arr[mid]==tar) {
			System.out.println(); 
			System.out.println("Target Found at position: "+mid);
		}
		else if(arr[mid]<tar) {
			binarySearch(mid+1,end,tar,arr);
		} else {
			binarySearch(st,mid-1,tar,arr);
		}
	}
	
	//find maximum value
	void findMaximum(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.println("Maximum value is : "+ max);
	}
	
	//to count even | odd 
	void countEvenOdd(int arr[]) {
		int e=0,o=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) e++;
			else o++;
		}
		System.out.println("Even count is : "+ e);
		System.out.println("Odd count is : "+ o);
	}
	
}
